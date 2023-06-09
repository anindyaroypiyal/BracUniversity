import java.io.*;
public class assignment4_task2 {

	public static void main(String[] args) {
		try {
			File f1 = new File("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\a4t2.txt");
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			String a = br.readLine();
			int mxweight = Integer.parseInt(a);
			String b = br.readLine();
			int trophies = Integer.parseInt(b);
			
			String []team = new String[trophies];
			double []price = new double[trophies];
			int [] wt = new int [trophies];
			String []league = new String[trophies];
			
			int c = 0;
			
			String []starry = new String[4];
			String st = br.readLine();
			while(st != null) {
				starry = st.split(", ");
	
				team[c] = starry[0];
				wt[c] = Integer.parseInt(starry[1]);
				price[c] = Double.parseDouble(starry[2]);
				league[c] = starry[3];
				c++;
				
				st = br.readLine();
			}
//			for(int i = 0 ; i < player ; i++) {
//				System.out.println("pl "+pl[i]);
//				System.out.println("form "+form[i]);
//				System.out.println("price "+price[i]);
//				System.out.println();
//			}
			double [][]k = new double [trophies+1][mxweight+1];
			for(int r = 0 ; r <= trophies; r++) {
				for(int col = 0 ; col <= mxweight; col++) {
					
					if(r == 0 || col == 0) {
						k[r][col] = 0;
					}
					else if(col < wt[r-1] ) {
						k[r][col] = k[r-1][col];

					}
					else {
						k[r][col] = Math.max(k[r-1][col], price[r-1]+k[r-1][ (col - wt[r-1])]);
					}
				}
			}
			double res = k[trophies][mxweight];
			System.out.println("Name of clubs whose trophies were sold:");
			int w = mxweight;
			int n = trophies;
			double result = res;
			for(int i = n ; i > 0 && w > 0 ; i--) {
				if(res == k[i-1][w]) {
					continue;
				}
				else {
					System.out.print(team[i-1]);
					res = res - price[i-1];
					w = (w - wt[i - 1]);
					if(w > 0) {
						System.out.print(", ");
					}		
				}
			}
			System.out.println("\nMaximum money he earned: "+result+" million");
		}
		catch(Exception e) {
			System.out.println(e);
			System.err.println("CRASHEDDD");
		}
	}
}
