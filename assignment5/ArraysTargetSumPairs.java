/*
 * Take as input N, the size of array. Take N more inputs and store that in an array. Take as input �target�, a number. Write a function which prints all pairs of numbers which sum to target.

Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

Constraints
Length of the arrays should be between 1 and 1000.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3
Explanation
Find any pair of elements in the array which has sum equal to target element and print them.
 */

package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumPairs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=scn.nextInt();
		
		Arrays.sort(arr);
		
		int target = scn.nextInt();
		targetSumPairs(arr, n, target);

	}
	
	public static void targetSumPairs(int [] arr, int n, int target) {
			int i=0;
			int l=i;
			int r=n-1;
			while(l<r) {
				if(arr[l]+arr[r]==target) {
					System.out.println(arr[l]+" and "+arr[r]);
					l++;
					r--;
				}
				else if(arr[l]+arr[r]>target)
					r--;
				else
					l++;
			}
		
	}

}
