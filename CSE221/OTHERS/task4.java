import java.util.*;
import java.io.*;
public class task4 {
	
	static Boolean []visit;
	static int dis[];
	static int fin[];
	static int time = 0;
	
   static void DFSVis(ArrayList<ArrayList<Integer>> list1,int i) {
			visit[i] = true;
			time++;
			dis[i] = time;

			 for(int w = 0 ; w < list1.get(i).size();w++) {
				
				if(visit[list1.get(i).get(w)]==false) {
					
					int x = list1.get(i).get(w);
					
					DFSVis(list1,x);

				}
			 }
			++time;
			fin[i]=time;
		}
	public static void main(String[] args) {
		try {
			File fl = new File ("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\t4.txt");
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
			
			String []starry = new String[2];
			while(on.hasNext()) {
				String s = on.nextLine();
				starry = s.split(" ");
				int fvertex = Integer.parseInt(starry[0]);//for fatherAList
				int bconnect = Integer.parseInt(starry[1]);//for babyAList
				List1.get(fvertex).add(bconnect);
			}
			visit = new Boolean[vertex];
			dis = new int[vertex];
			fin = new int[vertex];
			
			for(int i = 0 ; i < vertex ;i++) {
				visit[i] = false;
				}
			    
				for (int j = 0 ; j < vertex ; j++) {
						
						if(visit[j] == false) {
							
							DFSVis(List1,j);
						}	
					}	
	       
	       	int pos = -1;
	       	int s = 0;
	       	for(int i = 0; i < fin.length;i++ ) {
	       		if(fin[i]>pos) {
	       			pos = fin[i];
	       			s = i;
	       		}
	       	}
	       	System.out.println("suitable position for nora is "+s);
		}
			catch(Exception e) {
				
		}
	}
}

