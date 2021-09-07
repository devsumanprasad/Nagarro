/*
Take as input N, a number. Take N more inputs and store that in an array. Take as input target, a number

a. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

b. Write a recursive function which prints subsets of the array which sum to target. Return type of functions is void.

Input Format
Take as input N, a number. Take N more inputs and store that in an array.Take as input target, a number

Constraints
None

Output Format
Display the number of subsets and print the subsets in a space separated manner.

Sample Input
3
1
2
3
3
Sample Output
1 2  3
2
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class Subset_problem_Recursion {

	static int count = 0;
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int  i = 0; i < n; i++)
			arr[i] = in.nextInt();
		int t = in.nextInt();
        int ans = subset(arr, t, "", 0);
		System.out.println();
        System.out.println(ans);
	}
	public static int subset(int arr[], int t, String ans, int index)
	{
		if(t == 0)
		{
			System.out.print(ans + " ");
			return ++count;
		}
		if(t < 0 || index == arr.length)
			return count;
		subset(arr, t - arr[index], ans + arr[index] + " ", index + 1);
		subset(arr, t, ans, index + 1);
		return count;
	}

}
