import java.util.Scanner;
public class pr6 {
  public static void main(String[] args) {
	int sum = 0;
	Scanner on = new Scanner(System.in);
	
	String n1= on.next();
	String n2 = on.next();
	
	String n3 = n1.concat(" ").concat(n2);
	
	System.out.println(n3);
	
	for (int i = 0 ; i < n3.length(); i++) {
		if(n3.charAt(i) >= 'A' && n3.charAt(i) <= 'z') {
		sum = sum + n3.codePointAt(i);
	}
	}
	System.out.print(sum);
}
}
