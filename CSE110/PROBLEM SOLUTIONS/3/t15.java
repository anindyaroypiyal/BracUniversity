import java.util.Scanner;
public class t15{
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  
  System.out.println("enter time");
  int t = on.nextInt();
  
  if (t >= 0 && t <=3) {System.out.println("keep patience");}
  else { if (t >= 4 && t <= 6) {System.out.println("breakfast");}
    else { if (t >= 7 && t<= 11) {System.out.println("keep patience");}
      else{ if (t>= 12 && t<=13) {System.out.println("lunch");}
        else { if (t>= 14 && t<= 15) {System.out.println("keep patience");}
          else { if (t>=16 && t<= 17) {System.out.println("snacks");}
            else { if (t >= 19 && t<= 20) {System.out.println("dinner");}
              else {if (t == 18 || (t >= 21 && t <= 23)) {System.out.println("keep patience");}
              }
            }
          }
        }
      }
    }
    }
  }
  }