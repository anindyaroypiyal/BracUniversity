import java.util.Scanner;
public class pr9 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	String st1 = on.next();
	String st2 = on.next();
	
	int sum1 = 1;
	int sum2 = 1;
	
	for(int i = 0 ; i < st1.length() ; i++) {
		sum1 *= (st1.codePointAt(i)-64);
		}
	for(int i = 0 ; i < st2.length() ; i++) {
		sum2 *= (st2.codePointAt(i)-64);
		}
	
	int mod1 = sum1 % 14 ;
	int mod2 = sum2 % 14;
	
	if(mod1 < mod2) {
		System.out.print("I am Happy With my Coach");
	}
	else {
		System.out.print("I am Sad With my Coach");
	}

	}

	}