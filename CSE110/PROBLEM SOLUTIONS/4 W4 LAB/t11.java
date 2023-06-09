public class t11 {
  public static void main(String[] args){
  
   int devisor=0;
   
   for (int i = 40; i <= 50 ; i++) {
     
     for (int j =1 ; j <= i; j++) {
     if (j % i  == 0) 
     {
       devisor++;
     }
   } if (devisor == 2) {System.out.println(i +" = prime number");}
    else {System.out.println(i +" = not a prime number");}
    
  }
}
}