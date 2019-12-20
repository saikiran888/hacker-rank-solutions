package sai;



import java.util.*;

public class add{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long bi=0;
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            bi+=arr[i];
        }
        System.out.println(bi);
    }
}