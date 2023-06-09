
public class ComplexNumber extends RealNumber {

	private double ImagValue = 1;
	private double realValue = 1;
	
	ComplexNumber(){
		super();
	}
	ComplexNumber(double r , double i){
		setRealValue(r);
		setImagValue(i);
	}
	double getImagValue() {
		return ImagValue;
	}
	void setImagValue(double i) {
		this.ImagValue = i;
	}
	public double getRealValue() {
        return realValue;
    }
    public void setRealValue(double r) {
        realValue = r;
    }
    public String toString() {
        return "RealPart: "+getRealValue()
        +"\nImaginaryPart: "+getImagValue();
    }
    void check() {
    	System.out.println("I'm in ComplexNumber class");
    	ping();
    	System.out.println("Checking Ended");
    			
    }
}
