import java.util.Scanner;
public class t16{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int a = on.nextInt();
    int min = a ;
    int max = a;
    int sum = 0;
    int count=0;
    int avg;
    int y=0;

    for (int i = 1 ; i <= 4 ; i++){
    y = on.nextInt();
    if(y < min ) 
    {
      min = y;
    }
    if ( y > max) {max = y;} 
    }
    sum = sum + y;
    avg = sum / 6;
    System.out.println("Min is : "+min +" Max is : "  +max +"average is : "+avg);
  }
}