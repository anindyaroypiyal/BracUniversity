import java.util.Scanner;
public class testPoints {
public static void main(String[] args) {
	
	Scanner on = new Scanner(System.in);
	
	System.out.print("enter radius of circle : ");
	int x = on.nextInt();
	Circle c1 = new Circle(x);
	
	System.out.println("the area of circle is: "+c1.space());
	
	System.out.print("enter radius of sphere: ");
	int y = on.nextInt();
	Sphere s1 = new Sphere(y);
	
	System.out.println("the volume of sphere is: "+s1.space()
	);
}


}
