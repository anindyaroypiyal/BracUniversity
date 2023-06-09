import java.util.Scanner;
public class task9 {

	public static void main(String[] args) {
	Scanner on = new Scanner (System.in);
	
	String s1 = on.nextLine();

	char []up = s1.toCharArray();
	
	for(int i = 0 ; i < up.length ; i++){
		if(up[i] > 95) {
			up[i]-=32;
		}
		}
	for(int i = 0 ; i < up.length; i++) {
		System.out.print((char)(up[i]));
	}
}
}
