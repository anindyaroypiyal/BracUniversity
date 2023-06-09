import java.util.Scanner;
public class t5 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  
  System.out.println("enter seconds");
  int second = on.nextInt();
  
  int hour = second / 3600 ;
  int x = second % 3600 ; 
  
  int minute = x / 60;
  int seconds = x % 60;

  System.out.println(hour +"hour " +minute +"minute " +seconds + "seconds");
  }
}