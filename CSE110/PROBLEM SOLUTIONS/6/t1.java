import java.util.Scanner;
public class t1{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("Enter favorite car name");
    String car = on.nextLine();
    System.out.println("Enter number");
    int x = on.nextInt();
    
    
    for (int a = 1 ; a <= x ; a++){
      System.out.println(car);
    }
  }
}