import java.util.Scanner;
public class t15v2{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int temp,min;
    int arr[] = new int[5];
    for (int i = 0; i < arr.length; i++)
    {
     arr[i] = on.nextInt();
    }
   
    for (int i = 0; i < arr.length; i++){
      min  = i;
      for (int j = i + 1 ; j < arr.length; j++){
        
        if (arr[j]>arr[min])
        {
          min = j;
        }
       
      }
       temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    for (int d = 0 ; d< arr.length; d++){
      System.out.print(arr[d] + " ");
  }
  }
}
