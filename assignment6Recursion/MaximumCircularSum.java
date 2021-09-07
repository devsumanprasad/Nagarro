/*
 * You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. 
   You need to find the maximum sum of consecutive numbers.

Input Format
First line contains integer t which is number of test case.
For each test case, it contains an integer n which is the size of array and 
next line contains n space separated integers denoting the elements of the array.

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

package assignment6Recursion;
import java.util.*;
public class MaximumCircularSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- <=100) {
			int n = s.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = s.nextInt();
			}
			
			int ans = maxCircularSum(arr);
			System.out.println(ans);
			
			System.out.println();
		}
		

	}
	
	public static int maxCircularSum(int [] arr) {
		int temp = kadanesAlgo(arr);
		int [] ans = new int[arr.length];
		int altAns=0;
		for(int i=0; i<ans.length;i++) {
			ans[i]=arr[i]*(-1);
		}
		int mintemp = kadanesAlgo(ans);
		int arrSum = arraySum(arr);
		if(arrSum-(-mintemp)>0) {
			altAns = Math.max(temp, arrSum-(-mintemp));
		}
		else
			 altAns = temp;
		
		
		return altAns;
	}
	
	private static int arraySum(int[] arr) {
		int s=0;
		for(int i=0; i<arr.length;i++) {
			s=s+arr[i];
		}
		return s;
	}

	public static int kadanesAlgo(int [] arr) {
		int temp=0;
		int cmax=Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			temp = temp+arr[i];
		
			cmax = Math.max(cmax, temp);
			if(temp<0) {
				temp=0;
			}
			
		}
		return cmax;
	}

}
