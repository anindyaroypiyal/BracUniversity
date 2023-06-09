
public class Sphere extends Point {
	Sphere(double r) {
		super(r);
		}

	double space() {
		System.out.println("Creating a Sphere… done!");
		double volume = 4/3 * Math.PI * getRadius() * getRadius() * getRadius();
		
		return volume;
	}
}
