import java.io.*;
public class assignment4_task1 {

	public static void main(String[] args) {
		try {
			File f1 = new File("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\a4t1.txt");
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			String a = br.readLine();
			int budget = Integer.parseInt(a);
			String b = br.readLine();
			int player = Integer.parseInt(b);
			
			String []pl = new String[player];
			int []form = new int[player];
			int [] price = new int [player];
			
			int c = 0;
			
			String []starry = new String[4];
			String st = br.readLine();
			while(st != null) {
				starry = st.split(", ");
	
				pl[c] = starry[0];
				price[c] = Integer.parseInt(starry[1]);
				form[c] = Integer.parseInt(starry[2]);
				c++;
				
				st = br.readLine();
			}
//			for(int i = 0 ; i < player ; i++) {
//				System.out.println("pl "+pl[i]);
//				System.out.println("form "+form[i]);
//				System.out.println("price "+price[i]);
//				System.out.println();
//			}
			
			int [][]k = new int [player+1][budget+1];
			for(int r = 0 ; r <= player; r++) {
				for(int col = 0 ; col <= budget; col++) {
					
					if(r == 0 || col == 0) {
						k[r][col] = 0;
					}
					else if(col < price[r-1] ) {
						k[r][col] = k[r-1][col];
					}
					else {
						k[r][col] = Math.max(k[r-1][col], form[r-1]+k[r-1][col - price[r-1]]);
					}
				}
			}
			int res = k[player][budget];
			System.out.println("Bought Players:");
			int w = budget;
			int n = player;
			int result = res;
			for(int i = n ; i > 0 && res > 0 ; i--) {
				if(res == k[i-1][w]) {
					continue;
				}
				else {
					System.out.print(pl[i-1]);
					res = res - form[i-1];
					w = w - price[i - 1];
					if(res > 0) {
						System.out.print(", ");
					}
				}
			}
			System.out.println("\nMaximum summation of form: "+result);
		}
		catch(Exception e) {
			System.out.println(e);
			System.err.println("CRASHEDDD");
		}
	}
}
