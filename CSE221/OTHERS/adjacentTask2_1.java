import java.io.*;
import java.util.*;

//adjacency list (directed/undirected)
public class adjacentTask2_1 {

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
			}
		
		String []starry = new String[2];
		while(on.hasNext()) {
			String s = on.nextLine();
			starry = s.split(" ");
			int fvertex = Integer.parseInt(starry[0]);//for fatherAList
			int bconnect = Integer.parseInt(starry[1]);//for babyAList
			List1.get(fvertex).add(bconnect);
//			List1.get(bconnect).add(fvertex);//if add this line then undirected graph otherwise directed
		}
		
		for(int i = 0; i < vertex; i++) {
			System.out.print(i +">>");
			for (int j = 0 ; j < List1.get(i).size() ; j++) {
				
				System.out.print(List1.get(i).get(j)+" ");
				
			}
			
			System.out.println();
		}
		
	}
		catch(Exception e) {
			
		}
	}
}
