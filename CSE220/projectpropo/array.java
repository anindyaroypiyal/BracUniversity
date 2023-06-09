package projectpropo;

import java.util.Arrays;

public class array {

	public static int size;
	
	public int [] union(int a [],int b []) {
		int x = 0;
		int []n = new int[a.length + b.length];
		for(int i = 0; i < a.length ; i++) {
			n[x] = a[i];
			x++;
		}
		for(int i = 0; i < b.length ; ) {
			if(check(n, b[i],x) == false){
				n[x] = b[i];
				x++;
			}
		}
		n = sort(n);
		return n;
		
	}
	public boolean check(int []a, int el,int size) {
		int flag = 0;
		for(int i = 0 ; i <= size ; i++) {
			if(el == a[i]) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			return true;
		}
		else return false;
	}
	   
	public int [] sort(int [] a) {
	    
	        for(int i = 0; i < size  - 1; i++)
	        {
	            int mini = a[i];
	            int miniIndex = i;

	            for(int j = i; j < size; j++)
	            {
	                if(a[j] < mini)
	                {
	                    mini = a[j];
	                    miniIndex = j;
	                }
	            }

	            int box = a[i];
	            a[i] = a[miniIndex];
	            a[miniIndex] = box;

	        }

	        return a;
	    }
	public int []intersect(int []a , int []b){
		
        int [] n = new int[a.length];

        int x = 0;

        for(int i = 0; i < n.length; i++)
        {
            if((check(b,a[i],b.length)) == true)
            {
                if((check(n,a[i],(x + 1))) == false)
                {
                    n[x] = a[i];
                    x++;
                }
            }

        }

        size = x;

        n = sort(n);

        return n;
    }
	
	public int [] zigzag(int [] a, int [] b) {
		int []c = new int[a.length + b.length];
		int i = 0,j=1,x=0,y=0;;
		for(; i<c.length ;i=i+2,x++) {
			c[i] = a[x];
		}
		while(j < c.length) {
			c[j] = b[y];
			j=j+2;
			y++;
		}
		return c;
	}
	  public int [ ] SortedInsertion(int a[ ], int size, int elem)
	    {
	        int [] c = new int [a.length + 1];

	        for(int i = 0 ;i < c.length; i++)
	        {
	            c[i]=a[i];
	        }
	        c[c.length-1]=elem;
	        
	        c = sort(c);

	        return(c);
	    }
}
