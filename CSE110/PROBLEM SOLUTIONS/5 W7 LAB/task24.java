import java.util.Scanner;
public class task24 {
  public static void main (String[] args) {
  
  System.out.println("enter input");  
  Scanner on = new Scanner(System.in);
  int input = on.nextInt();
  
  for (int i=1 ; i <= input ; i++) {
  System.out.print(i);
  } 
  for (int i = input-1 ; i >= 1; i--) {
  System.out.print(i);
  }
    
  }

}