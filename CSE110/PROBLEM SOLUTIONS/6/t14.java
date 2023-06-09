import java.util.Scanner;
public class t14{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter value of n");
    int n = on.nextInt();
    int prod = 1;
    
    for (int i = 1 ; i <= n; i++) {
    int y = on.nextInt();
    prod *= y;
    }
  System.out.println(prod);
  }
}