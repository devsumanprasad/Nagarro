/*
 * Given an array A of size N , write a function that implements insertion sort on the array. 
 * Print the elements of sorted array.

Input Format
First line contains a single integer N denoting the size of the array. 
Next line contains N space seperated integers where ith integer is the ith element of the array.

Constraints
1 <= N <= 1000
|Ai| <= 1000000

Output Format
Output N space seperated integers of the sorted array in a single line.

Sample Input
4
3 4 2 1
Sample Output
1 2 3 4
Explanation
For each test case, write insertion sort to sort the array.
 */

package assignment5;
import java.util.*;
public class ArraysInsertionSort {

	public static void main(String [] arg) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
		arr = insertionSort(arr);
        for(int i=0; i<n; i++)
		    System.out.print(arr[i]+" ");
		
	}
	
	public static int [] insertionSort(int [] arr) {
		for(int i=1; i<arr.length;i++) {
			int ele = arr[i];
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>ele) {
					arr[j+1]=arr[j];
					
				}
				else {
					arr[j+1]=ele;
					break;
				}
				
			}
			
			if(arr[0]>ele)
				arr[0]=ele;
		}
		
		return arr;
	}

}
