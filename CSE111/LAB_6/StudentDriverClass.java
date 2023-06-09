/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;


public class StudentDriverClass {
    private String name="Ei name e kono student nai";
    private String id="Student ei nai, abar id :P";
    private String address="Naam nai .. thikana ashbe koi theke?";
    private double cgpa=-4.0;

     StudentDriverClass(){

}
StudentDriverClass(String n,String i,String a,double c){
name=n;
id=i;
address=a;
cgpa=c;

}
public String nameDao(){
return name;
}
public String idDao(){
return id;
}
public String addressDao(){
return address;

}
public double cgpaDao(){
return cgpa;
}
public void nameBoshao(String n){
name=n;
}
public void adressBoshao(String a){
address=a;

}
public void idBoshao(String i){
id=i;
}
public void cgpaBoshao(double c){
cgpa=c;
}
public void standUp(){
System.out.println(name+ " is now standing up");
}
public void tellMeYourName(){
System.out.println("Sir,my name is "+name);
        
}
public void call(String h){
System.out.println(name+": "+"hey "+h+"Sir is calling you");

}
public int add2Numbers(int i,int j){
return i+j;
}
}



