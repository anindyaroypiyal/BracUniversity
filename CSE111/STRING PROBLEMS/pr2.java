import java.util.Scanner;
public class pr2 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	String ar = on.nextLine();
	
	for(int i = 0 ; i <ar.length();i++) {
		if(ar.charAt(i) >= 'A' && ar.charAt(i) <= 'z') {
	System.out.print((char)(ar.charAt(i)+1));
	  }
		else {
			System.out.print(" ");
		}
	}
	
	}

}
