import java.io.*;
import java.util.*;

//adjacency matrix (directed/undirected)
public class adjacentTask2 {

	public static void main(String[] args) {

		try {
		File fl = new File ("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\df.txt");
		Scanner on = new Scanner(fl);
		String st = on.nextLine();
		int vertex = Integer.parseInt(st); //make it int from string
		
		ArrayList<ArrayList<Object>> List1 = new ArrayList<>(); //create father array list
		
		for(int i = 0 ; i < vertex; i++) {
			ArrayList<Object> vert = new ArrayList<>(); //create baby array list
			List1.add(vert);
			
			for (int j = 0 ; j < vertex; j++) {
				List1.get(i).add(0); //add 0s to all the babyArrayList
			}
		}
		
		String []starry = new String[2];
		while(on.hasNext()) {
			String s = on.nextLine();
			starry = s.split(" ");
			int fvertex = Integer.parseInt(starry[0]);//for fatherAList
			int bconnect = Integer.parseInt(starry[1]);//for babyAList
			List1.get(fvertex).add(bconnect, 1);//add 1s to the adjacent connections
			List1.get(bconnect).add(fvertex,1);//if add this line then undirected graph otherwise directed
		}
		
		System.out.print("   ");
		for(int a = 0 ; a < vertex ; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int i = 0; i < vertex; i++) {
			System.out.print(i +"  ");
			for (int j = 0 ; j < vertex ; j++) {
				System.out.print(List1.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}
		catch(Exception e) {
			
		}
	}
}
