
public class Complex {

	private double realPart;
	private double imaginaryPart;
	
	Complex(){
		realPart = 0;
		imaginaryPart = 0;
	}
	Complex(double realPart , double imaginaryPart){
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public void setRealPart(double realpart) {
		this.realPart = realPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public Complex add(Complex c1) {
		Complex temp = new Complex(0 , 0);
		temp.realPart = c1.realPart + this.realPart;
		temp.imaginaryPart = c1.imaginaryPart + this.imaginaryPart;
		return temp;
		
	}
}

