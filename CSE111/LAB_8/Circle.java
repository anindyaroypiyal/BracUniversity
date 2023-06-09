
public class Circle extends Point {

	Circle(double r) {
		super(r);
		
	}

	double space() {
		System.out.println("Creating a Circle … done!");
		double area = Math.PI * getRadius() * getRadius();
		
		return area;
	}
}
