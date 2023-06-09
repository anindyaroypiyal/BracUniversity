import java.util.Scanner;
public class p12{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int num = on.nextInt();
    int space = 1;
    
    for (int i = 1 ; i <= num ; i++){
      for (space = 1; space <= num - i ; space++){
      System.out.print(" ");
      }
      for (int j = space ; j <= num ; j++ ){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}