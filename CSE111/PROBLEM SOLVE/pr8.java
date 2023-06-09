import java.util.Scanner;

public class pr8 {

	public static void main(String[] args) {
		
	} {
    Scanner on = new Scanner(System.in);
    
    String num = on.next();
    
    int sum = 0;
    for (int i = 0 ;i < num.length() ; i++) {
    	
    	sum += num.codePointAt(i) - (int)'0';
    	 
    	
    }
    if (sum % 3 == 0) {
    	System.out.print(num +" is devisible by 3");
    }
    else {System.out.print(num +" is not devisible by 3");
     }
	}

}
