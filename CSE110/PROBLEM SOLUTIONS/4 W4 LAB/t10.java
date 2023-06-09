import java.util.Scanner;
public class t10 {
  public static void main(String[] args){
  
   Scanner on = new Scanner(System.in);
   
   System.out.println("enter number");
   
   int num = on.nextInt();
   int devisor=0;
   
   for (int i =1; i <= num ; i++) {
     if (num % i  == 0) 
     {
       devisor++;
     }
   } if (devisor == 2) {System.out.println("prime number");}
    else {System.out.println("not a prime number");}
    
  }
}