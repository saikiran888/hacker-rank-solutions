package sai;

public class f {

    public static void main(String[] args) {
   

        int result = 0,n=12;

        {
        	int t1=0,t2=1;
            for(int i=2;i<=n;i++){
                
                result=t1+t2;
                t1=t2;
                t2=result;
          
               }
            System.out.print(" "+result);   
            
         }
           
            
    }
}
