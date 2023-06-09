package lab10;

public class testbike {

	
	public static void main(String[] args) {
		motorbike mb = new motorbike();
		
		mb.printinfo();
		
		mb.speedUp(60);
		mb.printinfo();
		
		mb.brake(10);
		mb.printinfo();
		
	}
	
}
