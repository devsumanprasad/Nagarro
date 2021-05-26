/*
 * Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

Find the minimum element.

Given that the array will not contain duplicates.

Input Format
An integer n followed by an array A of size n.

Constraints
1 <= n <= 10^6 1 <= arr[i] <= 10^9 , where arr[i] is any element in the array

Output Format
Output should contain the minimum element in that array A.

Sample Input
5
3 4 5 1 2
Sample Output
1
Explanation
Here the MInimum element is 1.
 */

package assignment5;

import java.util.Scanner;

public class RotatedArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println(minimumVal(arr, n));

	}
	public static int minimumVal(int [] arr, int n) {
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		return min;
	}

}
