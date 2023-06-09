
public class Jackfruit extends Fruit {
	private static String name = "Jackfruit";
	static boolean formalin = false;
	
	 public Jackfruit() {
		super(formalin , name);
	}
	public String getName(){
	        return name;
	    }
	public String toString() {
		return name+"s are good for you";
	 }
}
