/*
Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abC
Sample Output
ABc
Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.
 */

package assignment6Recursion;
import java.util.*;
public class StringsToggleCase {
	static String ans="";
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = strTogg(str);
		System.out.println(ans);

	}
	public static String strTogg(String str) {
		
		if(str.length()<1) {
			
			//System.out.println(ans);
			return ans;
		}
		char t = str.charAt(0);
		if((int)t<=122 && t>=97) {
			t = (char)(((int)t)-32);
		}
		else {
			t = (char) (32+(int)t);
		}
		ans = ans+t;
		strTogg(str.substring(1));
		
		return ans;
		}

}
