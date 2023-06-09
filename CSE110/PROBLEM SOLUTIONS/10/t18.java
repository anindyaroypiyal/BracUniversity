import java.util.Scanner;
public class t18{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int count;
    int arr[] = new int[15];
    for (int i = 0; i < arr.length; i++)
    {
     arr[i] = on.nextInt();
    }
    for (int num = 0 ; num < 10; num++){
      count=0;
      for (int j = 0 ; j< arr.length; j++)
      {
        if (arr[j] == num){count++;}
      }
      System.out.println("num : "+num +"& count : "+count);
    }
  }
}