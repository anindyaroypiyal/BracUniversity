
public class Account {

	String name;
	double balance;
	static double interestRate = 5;
	
	Account(){
		name = "Default Name";
		balance = 0.0;
	}
	Account(String n , double b){
		name = n;
		balance = b;
	}
	String nameKi() {
		return name;
	}
	double balanceKi() {
		return balance;
	}
	void nameBoshao(String n) {
		name = n;
	}
	void balanceBoshao(double b) {
		balance = b;
	}
	void withdraw(int i) {
		int min = 100;
		balance = balance - i;
		if(balance > min) {
			System.out.println("withdraw successful! new balance is "+balance);
		}
		else {
			System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
		}
	}
}
