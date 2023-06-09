package lab10;

public class motorbike implements bike {

	int speed = 0;
	
	motorbike(){
		
	}
	
	
	public void brake(int decrement) {
		speed -= decrement;
	}
	
	public void printinfo() {
		System.out.println("speed: "+speed);
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
		
	}
	
}
