import java.util.Scanner;
public class str2 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	String wrd = on.nextLine();
	
	for(int i = 0 ; i < wrd.length() ; i++) {
	 System.out.println(wrd.charAt(i));
	 System.out.println(wrd.codePointAt(i));
	 System.out.println();
	}
	

	}

}
