/*
 * Take N as input, Calculate it's reverse also Print the reverse.

	Input Format
	Constraints
	0 <= N <= 1000000000
	
	Output Format
	Sample Input
	123456789
	Sample Output
	987654321
	Explanation
	You've to calculate the reverse in a number, not just print the reverse.
 */

package assignment3;

import java.util.*;
public class PrintReverse {
	public static void main(String[] args) {
		long n = 0l;
        Scanner scn = new Scanner(System.in);
        n = scn.nextLong();
		long ans =0l;
		while (n!=0) {
			long digit = n%10;
			ans= ans*10+digit;
			n = n/10;
		}
		System.out.println(ans);
	}
}
