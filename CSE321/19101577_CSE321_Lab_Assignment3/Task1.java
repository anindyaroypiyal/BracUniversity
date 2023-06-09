import java.util.Scanner;

class Calculations extends Thread{
	int a = 0;
	int b = 0;
	
	public Calculations(String name, int n1, int n2) {
		super(name);
		a = n1;
		b = n2;
	}
	public void run() {		
		if (Thread.currentThread().getName() .equalsIgnoreCase("add")) {
			int res = a + b;
			System.out.println(Thread.currentThread().getName()+ " is executing, The result is: "+res );
	}
		if (Thread.currentThread().getName().equalsIgnoreCase("subtract")) {
			int res = a - b;
			System.out.println(Thread.currentThread().getName()+ " is executing, The result is: "+res );
	}
		if (Thread.currentThread().getName().equalsIgnoreCase("multiply")) {
			int res = a * b;
			System.out.println(Thread.currentThread().getName()+ " is executing, The result is: "+res );
	}
		if (Thread.currentThread().getName().equalsIgnoreCase("division")) {
			int res = a / b;
			System.out.println(Thread.currentThread().getName()+ " is executing, The result is: "+res );
		}
		if (Thread.currentThread().getName().equalsIgnoreCase("other")) {
			System.out.println("No valid operation for other");
         }	
	}
}
public class Task1 {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first number:");
	 int a = sc.nextInt();
	 System.out.println("Enter second number:");
	 int b = sc.nextInt();
			 
	Calculations add = new Calculations("add", a, b);
	add.start();
	try {
		add.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Calculations sub = new Calculations("subtract", a, b);
	sub.start();
	
	Calculations mul = new Calculations("multiply", a, b);
	mul.start();
	
	Calculations div = new Calculations("division", a, b);
	div.start();
	
	Calculations oth = new Calculations("other", a, b);
	oth.start();
	try {
		oth.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  	}
}
