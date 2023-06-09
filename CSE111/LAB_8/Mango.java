
public class Mango extends Fruit {
	private static String name = "Mango";
	static boolean formalin = true;
	
	 public Mango() {
		super(formalin , name);
	}
	public String getName(){
	        return name;
	    }
	public String toString() {
		return name+"s are bad for you";
	 }
	
}
