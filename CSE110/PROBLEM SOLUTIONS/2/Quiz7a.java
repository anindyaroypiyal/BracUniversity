public class Quiz7a{
  public static void main(String [] args){
    int i = 0;
    int j = 1;
    String [ ][ ] twoD1  = new String [3][3];
    int [ ][ ] twoD2  = new int [3][3];
    twoD1[0][0] = "k";
    twoD1[0][1] = "f";
    twoD1[0][2] = "c";
    twoD1[1][0] = "x";
    twoD1[1][1] = "g";
    twoD1[1][2] = "h";
    twoD1[2][0] = "w";
    twoD1[2][1] = "m";
    twoD1[2][2] = "s";
    twoD2[0][0] = 22;
    twoD2[0][1] = 5;
    twoD2[0][2] = 12;
    twoD2[1][0] = 17;
    twoD2[1][1] = 10;
    twoD2[1][2] = 23;
    twoD2[2][0] = 9;
    twoD2[2][1] = 8;
    twoD2[2][2] = 3;
    while (i < 3){
      j = 2;
      while (j >= 0){
        System.out.println(twoD1[i][j] + twoD2[j][i]);
        j--;
      }      
      ++i;
    }
  }
}
