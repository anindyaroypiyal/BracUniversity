import java.util.Scanner;
public class Task09{
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    int a[] = new int[10];
    for(int i = 0 ; i < a.length ; i++){
      a[i] = input.nextInt();
    }
    int c =1 ;
    
    int b[] = new int[5];
    int count = 0 ;
    for(int i = 0; i<a.length; ){
    if(c%2!=0){
      b[count]=a[i];
      i++;
      c++;
      count++;
    }
    else{
      c++;
      i++;
    }
    }
    for(int k = 0 ; k < b.length ; k++){
      for(int j =1 ; j < (b.length-k) ; j++){
       
        if(b[j-1]<b[j]){
        int temp = b[j-1];
        b[j-1]=b[j];
        b[j]=temp;
        }
      }
    }
    for(int u = 0 ; u < b.length ; u++){
      System.out.println(b[u]);
    }
  }
}
          
          
          
        