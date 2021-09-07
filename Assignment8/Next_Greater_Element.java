/*
Given an array, print the Next Greater Element (NGE) for every element. 
The Next Greater Element for an element x is the first greater element on the right side of x in array. 
Elements for which no greater element exist, consider next greater element as -1.

Input Format
First line of the input contains a single integer T denoting the number of testcases. First line of each testcase contains an integer N denoting 
the size of array. Second line of each testcase contains N space seperated integers denoting the array.

Constraints
1 <= T <= 50 1 <= N <= 10^5

Output Format
For each index, print its array element and its next greater element seperated by a comma in a new line.

Sample Input
2
4
11 13 21 3
5
11 9 13 21 3
Sample Output
11,13
13,21
21,-1
3,-1
11,13
9,13
13,21
21,-1
3,-1
Explanation
For the first testcase , the next greater element for 11 is 13 , for 13 its 21 and 21 being the 
largest element of the array does not have a next greater element. Hence we print -1 for 21. 3 is the last element of the array and does not 
have any greater element on its right. Hence we print -1 for it as well.
 */
package Assignment8;
import java.util.*;
public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0) {
			int n= sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
			//nextGreaterBroutForce(arr);
			nextGreater(arr);
			
		}

	}
	private static void nextGreater(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int ans[]=new int[n];
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[n-1]);
		ans[n-1]=-1;
		for(int i=n-2; i>=0;i--) {
			while(st.size()>0 && arr[i]>=st.peek()) {
				st.pop();
			}
			if(st.size()==0) {
				ans[i]=-1;
			}
			else {
				ans[i]=st.peek();
			}
			st.push(arr[i]);
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+","+ans[i]);
		}
	}
	//Brout force approch O(n^2)
	static void nextGreaterBroutForce(int arr[]) {
		int n= arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					System.out.println(arr[i]+", "+arr[j]);
					break;
				}
				else {
					if(j==n-1) {
						System.out.println(arr[i]+", "+"-1");
						
					}
					
				}
			}
			if(i==n-1) {
				System.out.println(arr[i]+", "+"-1");
				break;
			}
		}
		//System.out.println();

	}

}
