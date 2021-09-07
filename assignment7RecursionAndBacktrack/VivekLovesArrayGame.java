/*
Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal. The rules of the game are as follows:

Initially, there is an array, A , containing 'N' integers.

In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements in the left part is equal  to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.

After each successful move, Vivek have to discards either the left part or the right part and continues playing by using 
the remaining partition as array 'A'.

Vivek loves this game and wants your help getting the best score possible. Given 'A', 
can you find and print the maximum number of points he can score?

Input Format
First line of input contains an integer T denoting number of test cases. 
Each further Test case contains first line an integer 'N' , the size of array 'A'. After that 'N' space separated integers denoting the elements of array.

Constraints
1 <= T <= 10 1 <= N <= 17000 0 <= A[i] <= 10^9

Output Format
For each test case, print Vivek's maximum possible score on a new line.

Sample Input
3
3
3 3 3
4
2 2 2 2
7
4 1 0 1 1 0 1
Sample Output
0
2
3
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class VivekLovesArrayGame {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int T=scn.nextInt();
		int count=1;
		while(count<=T) {
    int size=scn.nextInt();
		int[] arr= new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=scn.nextInt();
		}
    System.out.println(output(arr, 0, arr.length-1));
    count++;
		}
	}
public static int output(int[] arr, int si, int ei) {
	
	int fh=0;
	int sh=0;
	
	for(int i=si; i<ei; i++ ) {
		
		int Sum1=sum(arr, si, i);
		int Sum2=sum(arr, i+1, ei);
		
		if(Sum1==Sum2) {
			 
			 fh=output(arr, si, i);
			 sh=output(arr, i+1, ei);
			 
			 return Math.max(fh, sh)+1;
			 }
		}
	return 0;
	}

	public static int sum(int[] arr, int si, int ei ) {
		int sum=0;
		for(int i=si; i<=ei; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

}
