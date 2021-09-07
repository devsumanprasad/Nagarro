/*
Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.

a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible subsequences 
for a “abcd” has following subsequences
 “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.
 given string (void is the return type for function).
Note: Use cin for input for C++

Input Format
Enter a string

Constraints
None

Output Format
Print all the subsequences in a space separated manner and isplay the total no. of subsequences.

Sample Input
abcd
Sample Output
 d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
16
Explanation
Print all possible subsequences of the given string.
 */

package assignment6Recursion;
import java.util.*;
public class RecursionSubsequences {
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
		
	}
	
	public static int subseqCount(String str, String ans) {
		
		if(str.length()==0) {
			//System.out.print(ans+" ");
			count++;
			return count;
		}
		char ch = str.charAt(0);
		String temp = str.substring(1);
		
		subseqCount(temp, ans);
		subseqCount(temp, ans+ch);
		return count;
	}

}
