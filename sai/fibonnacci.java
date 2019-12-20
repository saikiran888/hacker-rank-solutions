package sai;

import java.util.*;

public class fibonnacci {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        int result = 0,n;
        n=sc.nextInt();
       if(n==0){
           result=0;
       
       }
       else if(n==1){
           result=1;
       
       }
       
        else
        {
        	int t1=0,t2=1;
            for(int i=2;i<=n;i++){
                
                result=t1+t2;
                t1=t2;
                t2=result;    
          }
        }
           System.out.println(result);
            
    }
}
