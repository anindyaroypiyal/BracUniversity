import java.util.Scanner;
public class t4{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int a = on.nextInt();
    int min = a ;
    int sum;
    int count=0;
    if(a % 2 == 0) {sum = a; count++;}
    else{sum = 0;}
    int avg;

    for (int i = 1 ; i <= 4 ; i++){
    int y = on.nextInt();
    if(y < min ) 
    {
      min = y;
    }
    if (y % 2 == 0) {sum += y; count++;} 
    }
    avg = sum / count;
    System.out.println("Min is : "+min +" average is : "+avg);
  }
}