import java.util.Scanner;
public class t27{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
   
  
    int i = 0;
   
    for (i = 1 ; i <= 600 ; i++){ 
   int count = 0;
    for (int j = 2; j < i ; j++){
      if (i % j == 0) {count++;}
      
    }
    if (count == 0) {System.out.println(i+" = Prime number");}
      else {System.out.println(i+ " = Not a prime number");}
    }
    
  }
}