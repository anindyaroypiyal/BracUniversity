import java.util.Scanner;
public class t2 {
  public static void main(String[] args){
    int sum = 0;
    for (int x =1; x <= 600 ; x++){
    
      if (x % 7 == 0) {
        if (x % 9 == 0) {
        sum = sum + x;
        }
      }
    }
    System.out.println(sum);
  }

}