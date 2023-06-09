import java.util.Scanner;
public class t1 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  
  System.out.println("enter mark");
  int mark = on.nextInt();
  
  if (mark > 50) {System.out.println("Pass");}
  else {System.out.println("You shall not pass");}
  }
}