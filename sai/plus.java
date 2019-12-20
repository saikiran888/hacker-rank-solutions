package sai;


import java.util.*;


public class plus {

    public static void main(String[] args) {double negative=0;
  double positive=0;
  double zero=0;  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int [] arr=new int[n];
  for(int m:arr)
  {
       m=sc.nextInt();
       if(m==0)
       {
             zero++;
        }
       else if(m<0)
      {
             negative++;
       }
      else if(m>0)
     {
           positive++;
      }
  }
  System.out.println(positive/n);
  System.out.println(negative/n);
  System.out.println(zero/n);
    }
}