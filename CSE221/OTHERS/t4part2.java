import java.util.*;
import java.io.*;
public class t4part2 {
	static Boolean []visit;
	static int parent[];
	static int dis[];
	static int fin[];
	static int time = 0;
	
   static void DFSVis(ArrayList<ArrayList<Integer>> list1,int i) {
			visit[i] = true;
			time++;
			dis[i] = time;
			System.out.println("disco time of "+i+" is "+dis[i]);
		System.out.println("time1 "+time);	
System.out.println("ver"+i);
			 for(int w = 0 ; w < list1.get(i).size();w++) {
				
				if(visit[list1.get(i).get(w)]==false) {
					
					int x = list1.get(i).get(w);
					System.out.println("num"+x);
					DFSVis(list1,x);
					
					System.out.println("time again "+time); //i found problem in this line's time t
				}
			 }
			 
			++time;
			System.out.println("time2 "+time);
			fin[i]=time;
			System.out.println("finsh of "+i +" is "+fin[i]);
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
			
			for(int i = 0; i < vertex; i++) {
				System.out.print(i +">>");
				for (int j = 0 ; j < List1.get(i).size() ; j++) {
					
					System.out.print(List1.get(i).get(j)+" ");
					
				}
				
				System.out.println();
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
				
	       	  for(int q = 0 ; q<dis.length;q++) {
	       		  System.out.println("finish time of "+q+" is "+fin[q]);
	       	  }
		}
			catch(Exception e) {
				
		}
	}
}

