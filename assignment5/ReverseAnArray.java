/*
 * Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which reverses the array. Print the values of reversed array.

Input Format
Enter a number N and take N more inputs

Constraints
None

Output Format
Display values of the reversed array

Sample Input
4
1
2
3
4
Sample Output
4 3 2 1
 */

package assignment5;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		arr = reverseArray(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
	
	public static int [] reverseArray(int [] rev) {
		
		int len = rev.length;
		int li = 0;
		int hi = len-1;
		while(li<hi) {
			int temp = rev[li];
			rev[li] = rev[hi];
			rev[hi] = temp;
			li++;
			hi--;
		}
		
		return rev;
	}

}
