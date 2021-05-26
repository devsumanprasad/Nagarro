/*
 * Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.



Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 
Explanation
Rotate the array 90 degrees anticlockwise.
 */

package assignment5;

import java.util.*;

public class RotateImage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int [][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
				}
		}
		
		/*for(int i=0;i<arr.length;i++)
			System.out.println(Arrays.toString(arr[i]));*/
			 
		
		int ans[][] = new int[n][n];
		ans = rotateImg(arr, n);
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
			
		
	}

	public static int[][] rotateImg(int[][] arr, int n){
		int ans[][] = new int[n][n];
		int  tempN=n;
		for(int i=0; i<tempN; i++) {
			for(int j=0;j<tempN;j++) {
				ans[i][j]=arr[j][n-1];
				
			}
			n--;
			
		}
		return ans;
	}
}
