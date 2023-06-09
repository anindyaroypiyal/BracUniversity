import java.util.Scanner;
public class t3{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int []mark = new int[5];
    int sum = 0 ;
    int j=0;
  
    int k = 0;
    
    for (int i = 0 ; i < mark.length ; i++){
    mark[i] = on.nextInt();
    sum += mark [i];
    }
    int max = mark[0];
    
    for (j = 0 ; j < mark.length; j++){
      if (mark[j] > max) {max = mark [j]; k = j;}
    }
    System.out.println("largest number is : "+max);
    System.out.println("largest number was found at location "+k);
  }
}