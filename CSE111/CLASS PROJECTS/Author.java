
public class Author {

	private String firstName;
	private String lastName;
	
	public Author(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		String s1 = firstName + lastName;
		return s1;
	}
	
}
