import java.util.Scanner;
public class t30{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter staring range");
    int x = on.nextInt();
    System.out.println("enter ending range");
    int y = on.nextInt();
 
    int prime = 0;
    int perfect = 0;
   
    for (int i = x ; i <= y ; i++){ 
   int sum = 0;
   int count = 0;
    for (int j = 1; j < i ; j++){
      if (i % j == 0) {count++;
      sum = sum + j ;}
      
    }
    if (count == 1) {prime++;}
     if (sum == i ) {perfect++;}
    }
   System.out.println(prime +" prime numbers"); 
   System.out.println(perfect +" perfect numbers"); 
  }
}