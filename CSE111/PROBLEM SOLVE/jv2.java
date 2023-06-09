import java.util.Scanner;

public class jv2 {
	public static void main(String[] args) {
		Scanner on= new Scanner(System.in);
		
		String t = on.next();
		
		
		int[] le = new int[500];
		char[] st = t.toCharArray();
		int i, c;
		
		for(i=0; i<t.length(); i++){
			c = st[i];
			if(c>=65 && c<=90)
				c += 32;
			
			le[c]++;
		}
		int flag = 0;
		for(i=97; i<=122; i++){
			if(le[i]>1) {
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("You entered " + t);
		else {
			for(i=97; i<=122; i++) {
				if(le[i]>1) {
					System.out.println((char)i + " has been counted " + le[i] + " times in the word " + t + "...");
					System.out.println("Please enter another word.");
				}
			}
		}
	}
}
