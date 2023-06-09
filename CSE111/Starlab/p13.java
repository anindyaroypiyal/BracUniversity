import java.util.Scanner;
public class p13{
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  int num = on.nextInt();
  
  for (int i = 1; i<=num ; i++){
  System.out.print(i);
  } 
  for (int i = num -1 ; i >=1 ; i--){
  System.out.print(i);
  }
  }
}