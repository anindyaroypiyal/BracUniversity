
public class testsstudent {
	  public static void printShout(Students s){
		    System.out.println("------------------");
		    System.out.println(s.msg);
		    System.out.println(s.shout());
		  }
		  public static void main(String [] args){
		    Students s = new Students();
		    CSEStudent cs = new CSEStudent();
		    CSE111Student cs111 = new CSE111Student();
		    System.out.println(s.msg);
		    System.out.println(cs.msg);
		    System.out.println(cs111.msg);
		    printShout(s);
		    printShout(cs);
		    printShout(cs111);
		  }

}
