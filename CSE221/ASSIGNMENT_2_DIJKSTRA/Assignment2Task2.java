import java.util.*;
import java.io.*;
public class Assignment2Task2 {
	
	static int []d;
	static int []pre;
	static PriorityQueue<Integer> queue;
	static HashSet<Integer> set;
	static int nodes; 
	static int alter;
	static String[] ynodes;
	static List<String> yn;
	static void Dijkstra(ArrayList<ArrayList<Integer>> list, int s){
		
		set = new HashSet<>();
		queue = new PriorityQueue<>();
		
		for(int i = 0 ; i < nodes; i++) {
		d[i] = Integer.MAX_VALUE;
		pre[i] = -1;	
		}
		d[s] = 0;
		sortqueue();
		
		while(set.size() < 7) {
			int minDis = queue.poll();
			int u = findIndx(minDis);
			set.add(u);
			for(int v = 0; v < nodes; v++) {
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

		List<String> yn = Arrays.asList(ynodes);
		for(int i = 0 ; i < nodes ; i++ ) {	
			String y = Integer.toString(i);
			if((!set.contains(i)) && (!yn.contains(y))) {
				queue.add(d[i]);	
			}
		}		
	}
	static int findIndx(int m) {
		List<String> yn = Arrays.asList(ynodes);
		int j;
		for(j = 0 ; j < nodes ; j++) {
			String y = Integer.toString(j);
			if(yn.contains(y)) {
			continue;
			}
			if(d[j]==m) {
				break;
			}
		}
		return j;
	}
	public static void main(String[] args) {
		
		try {
			File f1 = new File("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\a2t2.txt");
			FileReader fr = new FileReader(f1);
			FileReader fr2 = new FileReader(f1);
			BufferedReader b = new BufferedReader(fr);
			BufferedReader b2 = new BufferedReader(fr2);
			
			String st = b.readLine();
			b2.readLine();
			nodes = Integer.parseInt(st);
			
			st = b.readLine();
			int connection = Integer.parseInt(st);
			
			String []starry = new String[4];

			ArrayList<ArrayList<Integer>> List = new ArrayList<>();
			
			for (int i = 0 ; i <= nodes ; i++) {
				ArrayList<Integer> sm = new ArrayList<>();
				List.add(sm);
				for (int j = 0 ; j <= nodes; j++) {
					List.get(i).add(0); 
				}
			}
			ynodes = new String [4];
			String f2 =  b2.readLine();
			for(int i = 0; i < connection; i++) {
				b2.readLine();
			}
			f2 = b2.readLine();
			int src = Integer.parseInt(f2);
			f2 = b2.readLine();
			int des = Integer.parseInt(f2);
			f2 = b2.readLine();
			ynodes = f2.split(",");
			List<String> yn = Arrays.asList(ynodes);
			
			for (int i = 0 ; i < connection ; i++) {
				st = b.readLine();
				starry = st.split(",");
				String f = starry[0];
				String t = starry[1];
					alter=0;
				if((!yn.contains(f)) && (!yn.contains(t))) {
					alter++;
				int fv = Integer.parseInt(starry[0]);
				int con = Integer.parseInt(starry[1]);
				int wt = Integer.parseInt(starry[2]);
				
				List.get(fv).add(con, wt);
				}
			}
			
			String []loca = new String[12];
			loca[0] = "Mouchak";
			loca[1] = "Panthapath";
			loca[2] = "Rampura";
			loca[3] = "Shahbagh";
			loca[4] = "Dhanmondi";
			loca[5] = "Lalmatia";
			loca[6] = "Badda";
			loca[7] = "Hatirjhil";
			loca[8] = "Nilkhet";
			loca[9] = "TSC";
			loca[10] = "Dhaka University";
			loca[11] = "BUET";
			
			d = new int [nodes];
			pre = new int [nodes];

			Dijkstra(List,src);
			
			int q = -1;
			int temp = des;
			String []l = new String[5];
//			System.out.print(loca[des]);
			l[0] = loca[des];
			int a = 1;
			while(q  != 0) {
//				System.out.print(">>");
				q = pre[temp];
				l[a] = loca[q];
//				System.out.print(loca[q]);
				temp = q;
				a++;
			}
			System.out.print(l[l.length - 1]);
			for(int i = l.length - 2 ; i >= 0 ; i--) {
				System.out.print(">>");
				System.out.print(l[i]);
			}

			System.out.println("\nPath cost: "+d[des]);

//shows adjacency matrix 			
//			System.out.print("   ");
//			for(int a = 0 ; a < nodes ; a++) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//			
//			for(int i = 0; i < nodes; i++) {
//				System.out.print(i +"  ");
//				for (int j = 0 ; j < nodes ; j++) {
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

