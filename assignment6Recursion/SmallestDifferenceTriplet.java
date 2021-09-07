/*
Three arrays of same size are given. Find a triplet such that maximum – minimum in that triplet is minimum of all the triplets.
A triplet should be selected in a way such that it should have one number from each of the three given arrays.

If there are 2 or more smallest difference triplets, then the one with the smallest sum of its elements should be displayed.

Input Format
First line contains size of the arrays.
Second line contains the elements of the first array.
Third line contains the elements of the second array.
Fourth line contains the elements of the third array.

Constraints
1 <= Size of arrays <= 100

Output Format
Print the triplet in non-increasing order.

Sample Input
7
7 5 4 3 4 3 3 
3 5 5 3 6 7 6 
5 7 8 8 5 10 2 
Sample Output
5 5 5
 */

package assignment6Recursion;
import java.util.*;
public class SmallestDifferenceTriplet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int [] arr3 = new int[n];
		
		for(int i=0;i<n;i++)
			arr1[i] = s.nextInt();
		for(int i=0;i<n;i++)
			arr2[i] = s.nextInt();
		for(int i=0;i<n;i++)
			arr3[i] = s.nextInt();
		
		int [] ans = new int[3];
		ans = smallestDifferenceTriplet(arr1, arr2, arr3, n);
        for(int i=0;i<ans.length;i++)
		System.out.print(ans[i]+" ");

	}
	
	public static int [] smallestDifferenceTriplet(int [] arr1, int [] arr2, int [] arr3, int n) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		int resultMax=0;
		int resultMid=0;
		int resultMin=0;
		int difference = Integer.MAX_VALUE; 
		int i=0; int j=0; int k=0;
		while(i<n && j<n && k<n) {
			int sum = arr1[i]+arr2[j]+arr3[k];
			int min = minimum(arr1[i], arr2[j], arr3[k]);
			int max = maximum(arr1[i], arr2[j], arr3[k]);
			
			if(min == arr1[i])
				i++;
			else if(min == arr2[j])
				j++;
			else
				k++;
			
			if(difference > (max-min)) {
				difference = max-min;
				resultMax = max;
				resultMid = sum-(max+min);
				resultMin = min;
			}
				
			
		}
		
		return new int [] {resultMax, resultMid, resultMin};
	}
	
	public static int maximum(int a, int b, int c) {
		int max = Math.max(Math.max(a, b), c);
		return max;
	}
	
	public static int minimum(int a, int b, int c) {
		int min = Math.min(Math.min(a, b), c);
		return min;
	}

}
