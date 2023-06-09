import java.util.*;
import java.io.*;
public class task3 {

	public static void main(String[] args) {
		try {
			File fl = new File ("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\t3.txt");
			Scanner on = new Scanner(fl);
			
			String st = on.nextLine();
			int vertex = Integer.parseInt(st); //make it int from string
			st = on.nextLine();
			int edge = Integer.parseInt(st);
			ArrayList<ArrayList<Integer>> List1 = new ArrayList<>(); //create father array list
			
			for(int i = 0 ; i < vertex; i++) {
				ArrayList<Integer> vert = new ArrayList<>(); //create baby array list
				List1.add(vert);
				}
			
			int w = 0;
			int q = Integer.MAX_VALUE;
			int []pl = null;
			int lina = 0;
			String []starry = new String[2];
			while(on.hasNextLine()) {
				String s = on.nextLine();
				if(s.length() > 1) {
				
				starry = s.split(" ");
				int fvertex = Integer.parseInt(starry[0]);//for fatherAList
				int bconnect = Integer.parseInt(starry[1]);//for babyAList
				List1.get(bconnect).add(fvertex);
			}
				else {
					lina = Integer.parseInt(s);
					break;
				}
			   
			}
			String s = on.nextLine();
			int par = Integer.parseInt(s);
			pl = new int[par];
			
			while(on.hasNextLine()) {
				s = on.nextLine();
				pl[w]=Integer.parseInt(s);
				w++;
			}
			
			
				int src = lina;
			
			
			Boolean []visit = new Boolean[vertex];
			int []dist = new int [vertex];
			
			
			for(int i = 0; i < vertex ; i++) {
				dist[i]= -1;
				visit[i]=false;
			}
			visit[src] = true;
			dist[src]= 0;
			
			Queue<Integer> queue = new LinkedList<>();
			queue.add(src);
			
			
			while(queue.size() != 0) {
				int u = queue.remove();
				
				for(int a = 0 ; a < List1.get(u).size(); a++) {
					
					if(visit[List1.get(u).get(a)]==false) {
						
						visit[List1.get(u).get(a)] = true;
						dist[List1.get(u).get(a)] = dist[u] + 1;
						queue.add(List1.get(u).get(a));
					   }
					}
				}
			     
			for(int t = 0; t < pl.length ; t++) {
			    	 if(dist[pl[t]] < q) {
			    		 q = dist[pl[t]];
			    	 }
			     }
			    
			 System.out.println("winner needs "+q+" steps to kill");
		 	
	       	}
			catch(Exception e) {
				
			}
	}
}

