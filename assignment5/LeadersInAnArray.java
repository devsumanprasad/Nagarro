/*
 * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

Input Format
First line contains size of the array.
Second line contains the elements of the array.

Constraints
1 <= Size of array <= 100000

Output Format
Print the leaders in increasing order.

Sample Input
4
5 7 10 6 
Sample Output
6 10 
 */

package assignment5;
import java.util.*;

public class LeadersInAnArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++)
			arr[i]=scn.nextInt();
		int max = arr[n-1];
		System.out.print(max+" ");
		for(int i = n-2; i>=0;i--) {
			if(arr[i]>=max) {
				max=arr[i];
				System.out.print(max+" ");
			}
		}
			
	}

}
