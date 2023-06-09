
public class ComplexTest {

	public static void main(String[] args) {
		Complex other = new Complex();
		
		other.setRealPart(6.0);
		other.setImaginaryPart(9.5);
		
		Complex c1 = new Complex(1.2 , 5.3);
		
		Complex temp = c1.add(c1);
		
		System.out.println(temp.getRealPart() +" "+ temp.getImaginaryPart());
		
	}
}
