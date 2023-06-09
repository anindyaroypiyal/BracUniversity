import java.io.File;
import java.util.*;

public class bfs1 {
	
	public static void main(String[] args) {

		try {
		File fl = new File ("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\as.txt");
		Scanner on = new Scanner(fl);
		String st = on.nextLine();
		int vertex = Integer.parseInt(st); //make it int from string
		
		ArrayList<ArrayList<Integer>> List1 = new ArrayList<>(); //create father array list
		
		for(int i = 0 ; i < vertex; i++) {
			ArrayList<Integer> vert = new ArrayList<>(); //create baby array list
			List1.add(vert);
			}
		
		String []starry = new String[2];
		while(on.hasNext()) {
			String s = on.nextLine();
			starry = s.split(" ");
			int fvertex = Integer.parseInt(starry[0]);//for fatherAList
			int bconnect = Integer.parseInt(starry[1]);//for babyAList
			List1.get(fvertex).add(bconnect);
			List1.get(bconnect).add(fvertex);//if add this line then undirected graph otherwise directed
		}
		int src = 0;
		
		Boolean []visit = new Boolean[vertex];
		int []dist = new int [vertex];
		
		
		for(int i = 0; i < 10 ; i++) {
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

			System.out.println(dist[6]);
		
	}
		catch(Exception e) {
			
		}
	}
}
		

	