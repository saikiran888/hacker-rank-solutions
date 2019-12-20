package sai;
import java.util.*;
public class MiniMaxSum {
	public static void miniMaxSum(int[] arr) {
		long min = 0, max = 0, sum = 0;
		min = arr[0];
		max = min;
		sum = min;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print((sum - max) + " " + (sum - min));

	}
public static void main(String args[]) {
	
	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
		
		
	}
	miniMaxSum(arr);
	
}

}
