/*
Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.

Input Format
First line contains the number of testcases.

For each testcase, input a string

Constraints
1 <= T <= 100
1 <= Length of string <= 10000

Output Format
Integer output for each testcase in a new line

Sample Input
1
1abc23
Sample Output
24
Explanation
For 1abc23,
1 + 23 = 24
 */

package assignment6Recursion;
import java.util.*;
public class SumOfNumbersInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-->0) {
			String str = scn.next();
			long ans = digitSumInString(str);
			System.out.println(ans);
            System.out.println();
		}
	}
	
	public static Long digitSumInString(String str) {
		long sum = 0;
		String tmp = "0";
		char ch = '0';
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				tmp = tmp+ch;
			}
			else {
				sum = sum + Long.parseLong(tmp);
				tmp = "0";
			}
		}
		
		sum = sum + Long.parseLong(tmp);
		return sum;
	}

}
