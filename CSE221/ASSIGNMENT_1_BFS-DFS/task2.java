import java.util.*;
import java.io.*;
public class task2 {

	public static void main(String[] args) {
		try {
			File fl = new File ("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\t2.txt");
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
			int []pl = new int[3];
			String []starry = new String[2];
			while(on.hasNextLine()) {
				String s = on.nextLine();
				if(s.length() > 1) {
				
				starry = s.split(" ");
				int fvertex = Integer.parseInt(starry[0]);//for fatherAList
				int bconnect = Integer.parseInt(starry[1]);//for babyAList

				List1.get(fvertex).add(bconnect);
				List1.get(bconnect).add(fvertex);//if add this line then undirected graph otherwise directed
			}
				else {
					pl[w] = Integer.parseInt(s);	
					w++;
				}
			   
			}
		
			for(int r = 1; r < 3; r++) {
				int src = pl[r];
			
			
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
			     
			     if(dist[pl[0]]< q) {
			    	 q = dist[pl[0]];
			    	 w = r;
			    	 
			     }
			    
			 }if(w==1) {
			    	System.out.println("Winner = Nora");
			    }
			    else {
			    	System.out.println("Winner = Lina");
			    }
		 	
	       	}
			catch(Exception e) {
				
			}
	}
}

