import java.util.*;
import java.io.*;
public class Assignment1_tastk1 {

	public static void main(String[] args) {
		try {
			File fl = new File ("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\tt.txt");
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
			int lina = 0;
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
					lina = Integer.parseInt(s);	
					
				}
			
			}
			
			int src = 0;
			
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
				System.out.println("Nora can kill lina with "+ dist[lina]+" moves");
				
			
		}
			catch(Exception e) {
				
		}
	}
}

