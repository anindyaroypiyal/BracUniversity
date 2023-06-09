import java.util.Scanner;
public class p10{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int num = on.nextInt();
    int space = 1;
    
    for (int i = 1 ; i <= num ; i++){
      for (space = 1; space <= num - i ; space++){
      System.out.print(" ");
      }
      for (int j = 1 ; j <= (2*i)-1 ; j++ ){
        if(i == 1 || i == num) {System.out.print(j);}
        else if(j == 1 || j == (2*i)-1 ) {System.out.print(j);}
        else {System.out.print(" ");}
      }
      System.out.println();
    }
  }
}