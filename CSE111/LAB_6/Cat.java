/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

public class Cat {
   public String color = "White"; 
public String action = "sitting"; 


public Cat(){
}

 public Cat(String c){
color=c;
}
public Cat(String c,String a){
color =c;
action=a;
}
public void printCat(){
System.out.println(color+" Cat is "+action);

}
public void changeColor(String c){
color=c;
}


}