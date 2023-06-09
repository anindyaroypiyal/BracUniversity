class Inte extends Thread{

	public Inte(String name) {
		super(name);
	}
	public void run() {	
		int o1 = 0, o2 = 0, e1 = 0, e2 = 0;
		long x[] = Fibonacci();
		if (Thread.currentThread().getName() .equalsIgnoreCase("Odd1")) {	
			Odd1();
	}
		if (Thread.currentThread().getName() .equalsIgnoreCase("Even1")) {
			Even1();
	}
		if (Thread.currentThread().getName() .equalsIgnoreCase("Odd2")) {
			Odd2();
		}
		if (Thread.currentThread().getName() .equalsIgnoreCase("Even2")) {
			Even2();
		}
		
		if (Thread.currentThread().getName() .equalsIgnoreCase("Average")) {
			int av = Odd1() + Odd2() + Even1() + Even2();
			System.out.println("My special integer is: "+ av/4);
			}
			
		}
	private long[] Fibonacci() {
		long fibo[] = new long [50];
		int n = 49, firstTerm = 0, secondTerm = 1;

	    for (int i = 0; i <= n; ++i) {
	    	fibo[i] = firstTerm;

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	     }
	    return fibo;
	}
	public int Odd1() {
		int o1 = 0;
		long x[] = Fibonacci();
		for (int i = 1; i <= 25; i=i+2) {
			  o1+=x[i];  	
			}
			o1= o1/13;
			return o1;
	}
	public int Odd2() {
		int o2 = 0;
		long x[] = Fibonacci();
		for (int i = 27; i <= 49; i=i+2) {
			  o2+=x[i];  	
			}
		o2 = o2 / 12;
		return o2;
	}
	public int Even1() {
		int e1 = 0;
		long x[] = Fibonacci();
		for (int i = 0; i <= 24; i=i+2) {
			  e1+=x[i];  	
			}
		e1 = e1 / 13;
		return e1;
	}
	public int Even2() {
		int e2 = 0;
		long x[] = Fibonacci();
		for (int i = 26; i <= 48; i=i+2) {
			  e2+=x[i];  	
			}
		e2 = e2 / 12;
		return e2;
	}
}
public class Task3 {
	public static void main(String[] args) {
		
		Inte one = new Inte("Odd1");
		one.start();
		try {
			one.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Inte two = new Inte("Even1");
		two.start();
		try {
			two.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Inte three = new Inte("Odd2");
		three.start();
		try {
			three.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Inte four = new Inte("Even2");
		four.start();
		try {
			four.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Inte five = new Inte("Average");
		five.start();

		
		}
	}	

