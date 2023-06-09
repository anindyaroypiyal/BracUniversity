import java.util.Scanner;
public class t29{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    int count = 0;
    int sum = 0;
 
    for (int i = 1; i < x ; i++){
      if (x % i == 0) {sum = sum + i;}
      
    }
         
          if (sum == x) {
          System.out.println(x +" is a Perfect Number");
          }
          else {System.out.println(x +" is not a Perfect Number");}
  }
}