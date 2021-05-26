/*
 * You are given an input array whose each element represents the height of a line towers. 
 * The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. 
 * You need to find how much water filled between these given towers.

Example : |	
		  |	
		  |
		  |
		  |         __
		  |   __   |  |
		  |   | |  |  |  ___
		  |	  | |  |  |  |  |
		  |___|_|__|__|__|__|____________________

Input Format
The first line consists of number of test cases T. 
Each test case consists an integer N as number of towers and next line contains the N space separated integers.

Constraints
1 <= N <= 1000000 1 <= t <= 10 0 <= A[i] <= 10000000

Output Format
Print how much unit of water collected among towers for each test case.

Sample Input
2
6
3  0  0  2  0  4
12
0  1  0  2  1  0  1  3  2  1  2  1
Sample Output
10
6
 */

package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0){
				int n = scn.nextInt();
				int [] arr = new int[n];
				int [] lmax=new int[n];
				int [] rmax = new int[n];
				for(int i=0;i<n;i++)
					arr[i] = scn.nextInt();
				
				System.out.println(Arrays.toString(arr));
				lmax = leftMax(arr, lmax, n);
				System.out.println(Arrays.toString(lmax));
				rmax= rightMax(arr, rmax, n);
				System.out.println(Arrays.toString(rmax));
				int cum = 0;
				for(int i=0;i<n;i++) {
					cum = cum+Math.min(lmax[i], rmax[i])-arr[i];
				}
				System.out.println(cum);
				t--;
			}
		}
		
	
	public static int [] leftMax(int [] arr, int [] lmax, int n) {
		int temp=arr[0];
		lmax[0]=arr[0];
		for(int i = 1;i<n;i++) {
			
			if(arr[i]>lmax[i-1]) {
				lmax[i]=arr[i];
				temp = lmax[i];
			}
			else {
				lmax[i]=temp;
			}
		}
		
		return lmax;
	}
	public static int [] rightMax(int [] arr, int [] rmax, int n) {
		int temp=arr[n-1];
		rmax[n-1]=arr[n-1];
		for(int i = n-2;i>=0;i--) {
			
			if(arr[i]>rmax[i+1]) {
				rmax[i]=arr[i];
				temp = rmax[i];
			}
			else {
				rmax[i]=temp;
			}
		}
		
		return rmax;
	}

}
