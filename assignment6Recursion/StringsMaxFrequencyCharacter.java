/*
Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb
Sample Output
a
Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.
 */

package assignment6Recursion;
import java.util.*;
public class StringsMaxFrequencyCharacter {
	static char ans = 0;
	static int cnt=0;
	static int tempc=0;
	static int fn=0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		
		char an = extractChar(s);
		System.out.println(an);

	}
	
	public static char extractChar(String s) {
		if(s.length()==0) {
			return ans;
		}
		char t = s.charAt(0);
		for(int c=0; c<s.length();c++) {
			if(t==s.charAt(c)) {
				//ans = t;
				cnt=cnt+1;
			}
			
		}
		tempc = Math.max(tempc, cnt);
		if(fn<tempc) {
			fn = tempc;
			ans = t;
		}
		cnt=0;
		tempc=0;
		extractChar(s.substring(1));
		return ans;
	}
	
	

}
