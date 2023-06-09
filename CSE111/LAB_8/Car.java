
public class Car {

	private static int Year;
	private static int ObjectCount = 0;
	public static int getYear() {
		return Year;
	}
	public static void setYear(int year) {
		Year = year;
	}
	public static int getObjectCount() {
		return ObjectCount;
	}
	public static void setObjectCount(int objectCount) {
		ObjectCount = objectCount;
	}
	
	Car(int i){
		setYear(i);
		ObjectCount++;
	}
}
