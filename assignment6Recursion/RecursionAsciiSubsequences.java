/*
Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. 
E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible ascii-subsequences for a given string 
(void is the return type for function).

Input Format
Enter the string

Constraints
None

Output Format
Display the number of ASCII-subsequences and display all the ASCII- subsequences

Sample Input
ab
Sample Output
 b 98 a ab a98 97 97b 9798
9
 */

package assignment6Recursion;

import java.util.Scanner;

public class RecursionAsciiSubsequences {

	static int count = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		subseq(str, "");
		System.out.println();
		System.out.println(subseqCount(str,""));

	}
	
	public static void subseq(String str, String ans) {
		
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = str.charAt(0);
		String temp = str.substring(1);
		
		subseq(temp, ans);
		subseq(temp, ans+ch);
		subseq(temp, ans+(int) ch);
		
	}
	
	public static int subseqCount(String str, String ans) {
		
		if(str.length()==0) {
			count++;
			return count;
		}
		char ch = str.charAt(0);
		String temp = str.substring(1);
		
		subseqCount(temp, ans);
		subseqCount(temp, ans+ch);
		subseqCount(temp, ans+(int)ch);
		return count;
	}

}
