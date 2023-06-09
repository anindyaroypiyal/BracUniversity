
public class Vehicle2010 extends Vehicle {
	
	Vehicle2010(){
		
	}
	public void moveLowerLeft() {
		x--;
		y--;
	}
	public void moveUpperRight() {
		x++;
		y++;
	}
	public void moveUpperLeft() {
		y++;
		x--;
	}
	public void moveLowerRight() {
		x++;
		y--;
	}
	boolean equals(Vehicle v) {
		if(this.x == v.x && this.y == v.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
