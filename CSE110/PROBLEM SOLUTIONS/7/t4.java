import java.util.Scanner;
public class t4{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int []mark = new int[5];
 
    int j=0;
    int k = 0;
    int temp = 0;
    
    for (int i = 0 ; i < mark.length ; i++){
    mark[i] = on.nextInt();
    }
    int max = 0;
    
    for (j = 0; j < mark.length; j++){
      if (mark[j] > mark[max]) {max = j;}
    }
    
    temp = mark[max];
    mark[max]= mark[0];
    mark[0]= temp;
    
    for (k = 0 ; k < mark.length;k++){
    System.out.println(mark[k]);
    }
  }
}