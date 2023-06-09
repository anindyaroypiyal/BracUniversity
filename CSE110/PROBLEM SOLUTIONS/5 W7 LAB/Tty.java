import java.util.Scanner ; 
public class Tty{
  public static void main(String []args){
    Scanner input = new Scanner (System.in);
    System.out.println("Eneter a value");
    int x = input.nextInt();
    if(x >= 0 ){
      int ar[] = new int[x] ;
    }
    else{
      System.out.println("wronh value");
    }
    for(int i = 0 ; i < ar.length ; i++ ){
      ar[i] = input.nextInt();
    }
  }
}