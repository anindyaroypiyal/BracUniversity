import java.util.*;

public class parcheck {
    
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        
        Stack<Character> stc = new Stack<Character>();
        String e = on.nextLine();
        int i,flag=0;
        
        if(e.length() >= 0 ){
       for(i=0; i < e.length() ; i++){
    	   
           if(e.charAt(i)=='(' || e.charAt(i)=='{' || e.charAt(i)=='[' ){
               stc.push(e.charAt(i));
               stc.peek();
           }
           if(e.charAt(i)==')' || e.charAt(i)=='}' || e.charAt(i)==']'){
               if(stc.empty() != true){
                   char x = e.charAt(i);
                   char u = stc.pop();
                   if(u == '(' && x != ')'){
                       System.out.println("Opening and closing parenthesis don't match Wrong exp");
                       break;
                   }
                   else if(u == '{' && x != '}'){
                       System.out.println("Opening and closing parenthesis don't match Wrong exp");
                       break;
                   }
                   else if(u == '[' && x != ']'){
                       System.out.println("Opening and closing parenthesis don't match Wrong exp");
                       break;
                   }
               } 
              else{
                   System.out.println("Trying to pop from an empty stack Wrong exp");
                   flag = 1;
                   break;
               }
           }
           if(e.charAt(i) !='(' || e.charAt(i)!='{' || e.charAt(i)!='['|| e.charAt(i)!=')' || e.charAt(i)!='}' || e.charAt(i)!=']' ){
               continue;
           }
       }
       }
        if(stc.empty() == true && flag != 1){
            System.out.println("Correct Expression");
        }
        else{
            System.out.println("There is an additional opening/closing bracket Wrong expression");
        }
    }
}