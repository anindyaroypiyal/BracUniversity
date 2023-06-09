import java.util.Scanner;
public class t9 {
  public static void main(String[] args){
  
   Scanner on = new Scanner(System.in);
   
   System.out.println("enter number");
   
   int num = on.nextInt();
   int devisor=0;
   int sum = 0;
   
   for (int i =1; i < num ; i++) {
     if (num % i  == 0) {
      
       sum = sum + i;
     } 
   }if (sum == num) {System.out.println("its a perfect number");}
     
     else {System.out.println("not a perfect number");} 
    
  }
}