import java.util.Scanner;
public class p14{
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  int num = on.nextInt();
  
  for(int i = 1; i<= num ; i++){
    for (int space = 1 ; space <= num - i ; space++){
      System.out.print(" ");
    }
  for (int j = 1; j<=i ; j++){
  System.out.print(j);
  } 
  for (int j = i -1 ; j >=1 ; j--){
  System.out.print(j);
   }
  System.out.println();
  }
  }
 }
