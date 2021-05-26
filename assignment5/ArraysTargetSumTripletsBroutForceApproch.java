package assignment5;
import java.io.*;
import java.util.Scanner;

public class ArraysTargetSumTripletsBroutForceApproch {

	public static void triplate(int [] ans, int n, int trip) {
		for(int i =0; i<n-2; i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1; k<n;k++) {
					if(ans[i] + ans[j] + ans[k] == trip) {
						System.out.println(ans[i]+", "+ans[j]+" and "+ans[k]);
					}
					
				}
				
				
			}
		}

	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int trip = scn.nextInt();
		triplate(arr, n, trip);

	}
	
	

}
