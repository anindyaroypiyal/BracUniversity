
public class Student {

	private String name;
	static int numberOfStudents = 0;
	Student(){
		name = "Default Name";
		numberOfStudents++;
	}
	Student(String s){
		name = s;
		numberOfStudents++;
	}
	public String getName() {
		return name;
	}
}
