/*
 * Given with n element of an array and a rotation factor r , you need to rotate the array r times.

Input Format
First line represents a number n as the size of the array. Second line has n numbers that are the elements of the array. Third line represents a number r as the number of rotations for the array.

Constraints
n is less than 20000
every element in the array is in integer range
r is less than 100000

Output Format
The array after r rotations.

Sample Input
7
1 2 3 4 5 6 7
3
Sample Output
5 6 7 1 2 3 4
Explanation
Input: 1 2 3 4 5 6 7
Output: 5 6 7 1 2 3 4
Explaination
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		int rot = scn.nextInt();
		arr = rotat(arr, rot);
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
	
	public static int[] rotat(int [] arr, int rot) {
		
		int li=0;
		int hi= arr.length-1;
		int temp=0;
		
		for(int j=0;j<rot; j++) {
			hi = arr.length-1;
			temp = arr[hi];
			while(li<hi) {
				
				arr[hi]= arr[hi-1];
				hi--;
				
			}
			arr[li]=temp;
			
		}
		
		return arr;
	}

}
