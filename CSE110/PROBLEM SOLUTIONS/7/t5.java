import java.util.Scanner;
public class t5{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int []mark = new int[5];
 
    int j=0;
    int k = 0;
    int temp = 0;
    int temp2 = 0;
    int max2 = 0;
    
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
    
    max2 = 1;
    for (j = 1; j < mark.length ; j++){
      if (mark[j] > mark[max2]) {max2 = j;}
    }
    
    temp2 = mark[max2];
    mark[max2] = mark[1];
    mark[1] = temp2;
    
    for (k = 0 ; k < mark.length;k++){
    System.out.println(mark[k]);
    }
  }
}