/*
 * Given an array of n elements and a target sum t. You need to find out a pair from the array whose sum is the same as the target sum t, and print the indices of those two numbers. Also every array element will be used only once.
There is only one pair equal to the target sum.

Input Format
A number representing n length of array. The second line has n numbers representing the element in the array. The third line takes A number representing the target sum.

Constraints
n<=1000

Output Format
Print the indexes.

Sample Input
4
2 7 11 15
9
Sample Output
0 1
 */

package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumPairsPrintIndeces {

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
					System.out.println(l+" and "+r);
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
