import java.util.Scanner;
public class pr11 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	int x = on.nextInt();
	String st = on.next();
	
	
		for(int j = 0 ; j < st.length() ; j++) {
			int k = st.codePointAt(j)+x;
			if (k > 90) {
				k = k - 25;
			}		
			System.out.print((char)k);
		}
	}
	}


