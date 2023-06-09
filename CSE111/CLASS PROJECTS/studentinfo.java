
public class studentinfo {
	public static void main(String[] args) {
		
		student Mike = new student();
		student John = new student();
		student Carol = new student();
		
		
		Mike.setName("Mike");
		Mike.setAddress("bracu");
		Mike.setId("10");
		Mike.setCgpa(3.59);
		
		System.out.println("name is "+Mike.getName());
		System.out.println("address is "+Mike.getAddress());
		System.out.println("id is "+Mike.getId());
		System.out.println("cgpa is "+Mike.getCgpa());
		System.out.println();
		
		
		
		John.setName("John");
		John.setAddress("bracu");
		John.setId("11");
		John.setCgpa(3.5);
		
		System.out.println("name is "+John.getName());
		System.out.println("address is "+John.getAddress());
		System.out.println("id is "+John.getId());
		System.out.println("cgpa is "+John.getCgpa());
		System.out.println();
		
		Carol.setName("Carol");
		Carol.setAddress("bracu");
		Carol.setId("12");
		Carol.setCgpa(3.89);
		
		System.out.println("name is "+Carol.getName());
		System.out.println("address is "+Carol.getAddress());
		System.out.println("id is "+Carol.getId());
		System.out.println("cgpa is "+Carol.getCgpa());
	}
}
