import java.util.Scanner;
public class t8 {
  public static void main(String[] args){
  
   Scanner on = new Scanner(System.in);
   
   System.out.println("enter number");
   
   int num = on.nextInt();
   int devisor=0;
   
   for (int i =1; i <= num ; i++) {
     if (num % i  == 0) {devisor++;
     System.out.println(i);}
   } System.out.println("total devisor is : "+devisor);
    
  }
}