/*
You are given an array of numbers and a target number(T) , print all unique combinations in the array whose sum equals the target number T. 
Note that each number in the array may only be used once in the combination.
Note:

All numbers (including target) will be positive integers
Elements in the combination must be in non-descending order
There should be no duplicate combinations
Input Format
The first line will contain N indicating the number of elements in the array.
The second line will contain space separated N integers , A[i].
The third line will contain the target number T.

Constraints
N <= 15 1<= A[I] <= 100

Output Format
Print all unique combinations of the numbers satisfying the above constraints in a separate line in lexicographic manner.

Sample Input
7
10 1 2 7 6 1 5
8
Sample Output
1 1 6 
1 2 5 
1 7 
2 6 
 */

package assignment7RecursionAndBacktrack;

import java.util.*;

public class Sum_It_Up {
	static int cnt = 0;
	static ArrayList<StringBuilder> ans = new ArrayList<>();
	
	public static void main(String[] args) {
		//Taking input via Scanner
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int target = scn.nextInt();
		Arrays.sort(arr);
		printSum_It_Up(arr,0,new StringBuilder(""),0,target);
		String sans = ans.toString();
		ArrayList<String> fans = new ArrayList<>();
		for(int i=0;i<ans.size();i++) {
			if(!fans.contains(ans.get(i).toString())) {
				fans.add(ans.get(i).toString());
			}
			
			
		}
		//Collections.sort(fans);
		for(int i=0; i<fans.size();i++)
			System.out.println(fans.get(i));
		

	}

	private static ArrayList<StringBuilder> printSum_It_Up(int[] arr, int i, StringBuilder string, int sum, int target) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			if(sum==target) {
				
				ans.add(cnt,string);
				cnt++;
				
			}
			return ans;
		}
		
		printSum_It_Up(arr, i+1,new StringBuilder(string).append(arr[i]).append(" "), sum+arr[i], target);
		//string.substring(0, string.length()-2);
		printSum_It_Up(arr, i+1,string, sum, target);
		return ans;
	}

}
