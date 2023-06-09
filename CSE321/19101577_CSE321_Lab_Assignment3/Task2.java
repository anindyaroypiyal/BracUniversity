class Houses extends Thread{
	int a = 0;
	int b = 0;
	
	public Houses(String name) {
		super(name);
	}
	public void run() {	
		
		System.out.println("The house is: "+getName());
		
		if (Thread.currentThread().getName() .equalsIgnoreCase("House Stark") || Thread.currentThread().getName() .equalsIgnoreCase("House Targaryen")) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		if (Thread.currentThread().getName() .equalsIgnoreCase("House Lannister") || Thread.currentThread().getName() .equalsIgnoreCase("House Bolton")) {
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		else {
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
public class Task2 {
	public static void main(String[] args) {
			 
	Houses one = new Houses("House Stark");
	Houses two = new Houses("House Targaryen");
	Houses three = new Houses("House Lannister");
	Houses four = new Houses("House Bolton");
	Houses five = new Houses("House Tyrell");
		
	two.setPriority(Thread.MAX_PRIORITY);
	four.setPriority(Thread.MIN_PRIORITY);
	
	one.run();
	two.run();
	three.run();
	four.run();
	
	System.out.println(); 
	
	
	one.start();
	three.start();
	four.start();
	five.start();
	
	if(one.isAlive()) {
		System.out.println("\nNot Today!");
	}
	if(!four.isAlive()) {
		System.out.println("\nYou know nothing!");
	}
  	}
}
