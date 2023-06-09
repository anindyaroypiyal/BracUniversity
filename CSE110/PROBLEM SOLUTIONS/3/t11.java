import java.util.Scanner;
public class t11{
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  
  System.out.println("enter a");
  int a = on.nextInt();
  System.out.println("enter b");
  int b = on.nextInt();
  
  int temp = a;
  a = b;
  b = temp;
  
  System.out.println("a = "+a);
  System.out.println("b = "+b);
  }
}