import java.util.Scanner;
public class t3{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int a = on.nextInt();
    int max = a ;
    int sum = a;
    int avg;
    for (int i = 1 ; i <= 20 ; i++){
    int y = on.nextInt();
    if(y > max ) 
    {
      max = y;
    }
    sum = sum + y;
     }
    avg = sum / 20;
    System.out.println("Max is : "+max +" average is : "+avg);
  }
}