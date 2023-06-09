import java.util.Scanner;
public class t4 {
  public static void main(String[] args){
    
  Scanner on = new Scanner(System.in);
  System.out.println("enter salary");
  int salary = on.nextInt();
  
    System.out.println("enter age");
    int age = on.nextInt();
    
    if(salary < 10000 || age < 18) {System.out.println("No Tax");}
    else {
      if (salary >= 10000 && salary <= 20000) {System.out.println("Tax is ="+(0.05*salary));}
      else {
      if (salary > 20000) {System.out.println("Tax is ="+(0.1*salary));}
      }
    }
  
  }
}