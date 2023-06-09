import java.util.Scanner;

public class pr4 {

	public static void main(String[] args) {
    Scanner on = new Scanner(System.in);
    String ar = on.next();
    
    for (int i = 0; i < ar.length() ; i++) {
    	for (int j = 0 ; j <= i ; j++) {
    		System.out.print(ar.charAt(j));
    	}
    	System.out.println();
    }

	}

}
