/*
A Derangement is a permutation of n elements, such that no element appears in its original position.
 For example, a derangement of {0, 1, 2, 3} is {2, 3, 1, 0}.
Given a number n, find total number of Derangements of a set of n elements.

Input Format
First line contains integer T - no of testcases. Next T lines contain a single integer each - N.

Constraints
1 <= T <= 20
1 <= N <= 20

Output Format
Print the answer for each testcase in a new line.

Sample Input
2
4
5	
Sample Output
9
44
 */

package assignment_12Graph;
import java.util.*;
public class Count_Derangements {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			long ans = pairs(n);
			System.out.println(ans);
		}
    }
	static long pairs(int n){
		if(n<=2){
			return n-1;
		}
		long sp1 = (n-1)*pairs(n-1);
		long sp2 = (n-1)*pairs(n-2);
		return sp1+sp2;
	}
}
