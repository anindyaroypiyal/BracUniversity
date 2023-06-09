
public class CheckingAccount extends Account {

	public CheckingAccount(String name , double b) {
		super(name);
		setBalance(b);
     }

	public void printAccountInfo(){
	 System.out.println("=======================================");
     System.out.println("Name : "+getName()+ 
     		"\rAccount Number : " +getAccountNumber()+ 
     		"\rBalance : " + getBalance() );
     if(getBalance() < 500) {
    	 System.out.println("Your balance is less than the minimum amount");
     }
     System.out.println("=======================================");
	}
	
	
	public String deposit(double a) {
		if(a <= 0) {
			return "Please enter amount greater than Zero";
		}
		else { setBalance(getBalance()+a);
			return "Deposit Successful";
		}
	}
		public String withdraw(double b){
			if(b > getBalance()) {
				return "You do not have enough funds";
			}
			else if(b <= 0) {
				return "Please enter amount greater than Zero";
			}
			else { setBalance(getBalance()-b);
				return "Withdraw successful";
				
			}
		}
	}
