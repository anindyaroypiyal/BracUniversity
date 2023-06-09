
public class bankAccount {

	private String name;
	private String address;
	private int accountID;
	private double balance;
	
	
	public void setName(String n) {
		name = n;
	}
	public void setAddress(String a) {
		address = a;
	}
	public void setAccountID(int aI) {
		accountID = aI;
	}
	public void setBalance(double b) {
		balance = b;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
		}
	public void addinterest() {
		balance += balance * 0.07;
	}
	
	bankAccount(String n , String a , int aI , double b){
		name = n;
		address = a;
		accountID = aI;
		balance = b;
	}
	bankAccount(){
		
	}
	
	}

