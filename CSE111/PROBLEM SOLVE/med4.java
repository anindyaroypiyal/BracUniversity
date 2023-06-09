import java.util.Scanner;

public class med4 {

	public static void main(String[] args) {
		Scanner on= new Scanner(System.in);
		
		String t = on.next();
		
		char[] st = t.toCharArray();
		int i, c, last = 0;
		
		for(i=0; i<t.length(); i++){
			c = st[i];
			
			if(c != last) {
				System.out.print(st[i]);
				last = c;
			}
		}
	}
}
