
public class CheckingAccount extends Account {

	 static int numberOfAccount = 0;
	static double balance = 0;
	
	
	public CheckingAccount(){
	super(balance);	
	numberOfAccount++;
	}
	CheckingAccount(double a){
		super(a);
		numberOfAccount++;
	}
}
