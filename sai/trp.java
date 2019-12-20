package sai;

import java.util.*;
public class trp{
    public static void main(String args[])
    {
   int n=0,k=0;
        Scanner in=new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();

        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int a[]= {a0,a1,a2};
        int b[]= {b0,b1,b2};
        for (int i=0;i<3;i++) {
     
    
	if(a[i]>b[i]){
          n++;
      }
      if(a[i]<b[i]){
          k++;
      }
      
      }
        System.out.println(n+" "+k);

        }
}
