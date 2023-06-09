
public class bankTest {

	public static void main(String[] args) {
		
		bankAccount acc1 = new bankAccount();
		bankAccount acc2 = new bankAccount();
		bankAccount acc3 = new bankAccount();
		
		acc1.setName("halo");
		acc1.setAddress("banani");
		acc1.setAccountID(10235);
		acc1.setBalance(102345.5655);
		acc1.addinterest();
		
		
		System.out.println(acc1.getName() + " " +acc1.getAccountID() +" "  +acc1.getAddress() + " " +acc1.getBalance());
		
		
		acc3.setName("jello");
		acc3.setAddress("uttara");
		acc3.setAccountID(10286);
		acc3.setBalance(156617.545);
		acc3.addinterest();

		System.out.println(acc3.getName() + " " +acc3.getAccountID() +" "  +acc3.getAddress() + " " +acc3.getBalance());
	}

}
