import java.util.Scanner;
public class p23{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int num = on.nextInt();
    int space = 1;
    
    for (int i = 1 ; i <= num ; i++){
      for (space = 1; space <= num - i ; space++){
      System.out.print(" ");
      }
      for (int j = space ; j <= num ; j++ ){
        if(i == 1 || i == num) {System.out.print("*");}
        else if(j == space || j == num ) {System.out.print("*");}
        else {System.out.print(" ");}
      }
      System.out.println();
    }
  }
}