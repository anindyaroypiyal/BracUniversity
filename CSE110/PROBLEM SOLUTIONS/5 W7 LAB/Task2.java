import java.util.Scanner;
public class Task2{
  public static void main (String[]args){
  
    Scanner on = new Scanner (System.in);
    System.out.println("enter number");
    
    int x = on.nextInt();
    
    for (int i =1 ; i <= x ; i++) {
    System.out.print("*");
    }
   }
 }
