import java.util.*;
import java.io.*;
public class Assignment2Task1 {
	
	static int []d;
	static int []pre;
	static PriorityQueue<Integer> queue;
	static HashSet<Integer> set;
	static int country; 
	
	static void Dijkstra(ArrayList<ArrayList<Integer>> list, int s){
		
		set = new HashSet<>();
		queue = new PriorityQueue<>();
		
		for(int i =1 ; i <= country; i++) {
		d[i] = Integer.MAX_VALUE;
		pre[i] = -1;	
		}
		
		d[s] = 0;
		sortqueue();
		while(!queue.isEmpty()) {
			int minDis = queue.poll();
			int u = findIndx(minDis);
			set.add(u);
			for(int v = 1; v <= country; v++) {
				if(list.get(u).get(v)!=0 && (!set.contains(v))) {
					if(d[v] > d[u] + list.get(u).get(v)) {
						d[v] = d[u] + list.get(u).get(v);
						pre[v] = u;
					
					}
				}

			sortqueue();	
		}
	}
}
	static void sortqueue() {
		queue.clear();
		for(int i = 1 ; i <= country ; i++ ) {	
			if(!set.contains(i)) {
				queue.add(d[i]);
			}
		}
	}
	static int findIndx(int m) {
		int j;
		for(j = 1 ; j <= d.length ; j++) {
			if(d[j]==m) {
				break;
			}
		}
		return j;
	}
	public static void main(String[] args) {
		
		try {
			File f1 = new File("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\a2t1.txt");
			FileReader fr = new FileReader(f1);
			BufferedReader b = new BufferedReader(fr);
			String []starry = new String[4];
			String st = b.readLine();
			starry = st.split(" ");
			country = Integer.parseInt(starry[0]);
			int flight = Integer.parseInt(starry[1]);
			int cont = Integer.parseInt(starry[2]);
			int cas = Integer.parseInt(starry[3]);
			
			ArrayList<ArrayList<Integer>> List = new ArrayList<>();
			
			for (int i = 0 ; i <= country ; i++) {
				ArrayList<Integer> sm = new ArrayList<>();
				List.add(sm);
				for (int j = 0 ; j <= country; j++) {
					List.get(i).add(0); 
				}
			}for (int i = 0 ; i < country ; i++) {
				st = b.readLine();
				starry = st.split(" ");
				int fv = Integer.parseInt(starry[0]);
				int con = Integer.parseInt(starry[1]);
				int wt = Integer.parseInt(starry[2]);
				List.get(fv).add(con, wt);
				
			}
			
			d = new int [country+1];
			pre = new int [country+1];
			
			for(int j = 1 ; j <= cas ; j ++) {
			st = b.readLine();
			starry = st.split(" ");
			int from = Integer.parseInt(starry[0]);
			int to = Integer.parseInt(starry[1]);
			Dijkstra(List,from);
			System.out.println("Case "+j+ ":  "+d[to]);
			}
			
//			System.out.print("   ");
//			for(int a = 1 ; a <= country ; a++) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//			
//			for(int i = 1; i <= country; i++) {
//				System.out.print(i +"  ");
//				for (int j = 1 ; j <= country ; j++) {
//					System.out.print(List.get(i).get(j)+" ");
//				}
//				System.out.println();
//			}
	
		}
		catch(Exception e){
			System.err.println("crashed");
		}
	}
}
