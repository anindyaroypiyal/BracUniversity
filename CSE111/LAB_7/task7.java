import java.util.Scanner;
public class task7 {

	public static void main(String[] args) {
	Scanner on = new Scanner (System.in);
	
	String s1 = on.nextLine();
	String x = on.next();
	String y  = on.next();
	
	char[] a1 = s1.toCharArray();
	 char []x1 = x.toCharArray();
	 char []y1 = y.toCharArray();
	for(int i = a1.length-1 ; i > 0; i--) {
		if(a1[i] == x1[0]) {
			a1[i] =  y1[0];
			break;
		}
	}
	for(int i = 0 ; i < a1.length ; i++) {
		System.out.print(a1[i]);
	}
}
}
