/*
 * Take as input N, the size of array. 
 * Take N more inputs and store that in an array. Write a function that bubble sorts the array. 
 * Print the elements of sorted array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Bubble sort the array and print the Array.

Input Format
Constraints
N cannot be Negative. Range of Numbers can be between -1000000000 to 100000000.

Output Format
Sample Input
4
2
-18
45
30
Sample Output
-18
2
30
45
Explanation
For each test case write bubble sorting program to sort the elements of the array.
 */

package assignment5;
import java.util.*;
public class ArraysBubbleSort {

	 public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
			int [] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = scn.nextInt();
			arr = bubbleSort(arr);
	        for(int i=0; i<arr.length;i++)
			    System.out.println(arr[i]);

		}
		
		public static int [] bubbleSort(int [] arr) {
			for(int i = 0; i<arr.length-1;i++) {
				for(int j=0; j<arr.length-1;j++) {
					if(arr[j+1]<arr[j]) {
						swap(arr,j);
					
					}
					
				}
			
			}
			return arr;
		}
		public static void swap(int [] arr,int j) {
			int temp = arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
		}

}
