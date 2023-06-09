package lab1v10;
import java.util.Scanner;
public class ques5 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	System.out.println("enter voltage");
	int v = on.nextInt();
	System.out.println("enter resistance");
	int r = on.nextInt();
	System.out.println("enter inductance");
	int i = on.nextInt();
	System.out.println("enter capacitance");
	int c = on.nextInt();
	System.out.println("enter frequency");
	int f = on.nextInt();
	
	
	double a = (r*r)+(2*3.1416*f*i - (1/2*3.1416*f*c))*(2*3.1416*f*i - (1/2*3.1416*f*c));
	double I = v/Math.sqrt(a);

	System.out.print("current is "+I);
	}

}
