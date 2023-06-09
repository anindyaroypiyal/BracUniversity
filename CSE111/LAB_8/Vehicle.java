
public class Vehicle {

	int x = 0 ; 
	int y = 0;
	
	Vehicle(){
		
	}
	public void moveUp() {
		y++;
	}
	void moveDown() {
		y--;
	}
	void moveRight() {
		x++;
	}
	void moveLeft() {
		x--;
	}
	
	
	public String toString() {
		return  "("+x +","+ y+")"   ;
	}
}
