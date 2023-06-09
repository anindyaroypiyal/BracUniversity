import java.util.Scanner;
public class t2{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int []mark = new int[5];
    int sum = 0 ;
    int avg = 0;
    int j=0;
    int count = 0;
    
    for (int i = 0 ; i < mark.length ; i++){
    mark[i] = on.nextInt();
    sum += mark [i];
    }
    
    avg = sum / 5;
    
    for ( j  = 0 ; j < mark.length ; j++){
      if (mark[j] > avg) {count++;}
    }
     
    System.out.println(count +" students are better than average.");
    
    System.out.println("they hava received following marks");
           
    for (j = 0 ; j < mark.length ; j++){

     if (mark [j] > avg) {System.out.println(mark[j]);}
    }
}

  }
  