public class Task1 { 
    public static void main(String[] args) {
        int[] a5 = {3,2,0,1};
        int[] a = {30,20,40,11};
        for (int a1=0; a1<a.length-1; ++a1) {
            int a2 = a1;
            for (int a3=a1+1; a3<a.length; ++a3) {
                if (a[a2] > a[a3]) {
                    a2 = a3;
                }
            }
            if (a2 != a1) { 
                int a4 = a[a1];
                a[a1] = a[a2];
                a[a2] = a4;
            }
            System.out.print(a[a5[a1]]+a2+" ");
        }
        System.out.print(a[1]+a[0]);
    }
}
