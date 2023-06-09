
public class Teacher {

	String name;
	String department;
	
	String []listOfCourses = new String [10];
	int numberOfCourses = 0;
	
	Teacher(String n , String d){
		name = n;
		department = d;
	}
	public void addCourse(Course c) {
		for(int i = numberOfCourses ;i < listOfCourses.length ;) {
		listOfCourses[i] = c.name;
		i++;
		numberOfCourses++;
		break;
		}
	}
	public void printDetail() {
		System.out.println("Name : "+name);
		System.out.println("Department : "+department);
		System.out.println("List of courses");
		System.out.println();
		for (int i = 0 ;i < listOfCourses.length ;i++) {
			if (listOfCourses[i] != null) {
				System.out.println(listOfCourses[i]);
			}
		}
		System.out.println();
		System.out.println();
	}
}
