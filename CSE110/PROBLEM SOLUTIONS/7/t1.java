import java.util.Scanner;
public class t1{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int []mark = new int[5];
    int sum = 0 ;
    int avg = 0;
    int j=0;
    
    for (int i = 0 ; i < mark.length ; i++){
    mark[i] = on.nextInt();
    sum += mark [i];
    }
    
    int max = mark[0];
    int min = mark[0];
    
    for (j = 1 ; j < mark.length ; j++){
      if (mark[j] > max) {max = mark[j];}
    
    if (mark [j] < min) {min = mark[j];}
    
    avg = sum / 5;
    } 
    System.out.println("highest is "+max);
  System.out.println("lowest is "+min);
  System.out.println("average is "+avg);
}

  }
  