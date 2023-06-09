

 
 
 for (int i = 0 ; i < ar.length(); i++) {
    
  int min = i ;
 
  for (int j = i +1 ; j < ar.length();j++) {
   if (ghg[j] < ghg[min] ) {
    min = j;
   } 
  }
  char temp = ghg[i];
  ghg[i] = ghg[min];
  ghg[min] = temp;
   
 }
 for (int i = 0 ; i < ghg.length ; i++) {
  System.out.print(ghg[i]);
 }
 
 }

}
