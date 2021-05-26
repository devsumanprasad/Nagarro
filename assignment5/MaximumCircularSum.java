/*
 * You are provided n numbers (both +ve and -ve). 
 * Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

Input Format
First line contains integer t which is number of test case.
For each test case, it contains an integer n which is the size of array and next line contains
 n space separated integers denoting the elements of the array.

Constraints
1<=t<=100
1<=n<=1000
|Ai| <= 10000

Output Format
Print the maximum circular sum for each testcase in a new line.

Sample Input
1
7
8 -8 9 -9 10 -11 12
Sample Output
22
Explanation
Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
 */

package assignment5;
import java.util.*;
public class MaximumCircularSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
			int n = s.nextInt();
			int [] arr = new int[n];
			int [] inv = new int[n];
			int arrSum=0;
			for(int i = 0; i<arr.length; i++) {
				arr[i]=s.nextInt();
				arrSum = arrSum+arr[i];
			}
			System.out.println(Arrays.toString(arr));
			int maxSum = kadanesMax(arr);
			
			for(int i = 0; i<arr.length; i++)
				inv[i]=arr[i]-2*arr[i];
			
			int invertMax = kadanesMax(inv);
			
			int circularSum = arrSum+invertMax;
			circularSum = (int)Math.max(circularSum, maxSum);
			System.out.println(circularSum);
		}
	}
	
	public static int kadanesMax(int [] arr) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		
		
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
			
			if(sum>max)
				max=sum;
			if(sum<0)
				sum = 0;
		}
		
		return max;
	}

}
