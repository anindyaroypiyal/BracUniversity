import java.util.Scanner;
public class t10{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    
    System.out.println("enter number");
    
    for (int x = 1 ; x < 10 ; x++){
      int y = on.nextInt();
      if(y % 2 != 0 ) {
      sum += y ;
      count++;
      } 
    }
  int avg = sum / count;
  System.out.print("Toatal is : "+sum + " and Average is : "+avg);
  }
}