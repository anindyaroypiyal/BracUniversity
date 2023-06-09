import java.util.Scanner;
public class t13{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter value of n");
    int n = on.nextInt();
    int sum = 0;
    
    for (int i = 1 ; i <= n ; i++){
     
      if (i % 2 != 0){
      sum = sum + i;
      }
    }
   
     System.out.println(sum); 
  }
}