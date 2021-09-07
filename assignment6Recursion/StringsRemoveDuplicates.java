/*
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000

Output Format
String

Sample Input
aabccba
Sample Output
abcba
Explanation
For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.

After removing all of the consecutive occurences, the Final ans will be : - "abcba".
 */

package assignment6Recursion;
import java.util.*;
public class StringsRemoveDuplicates {
	static String a="";
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		//String ans = duplicateStringRemove(str);
		String ans2 = ConsecutiveDuplicateStringRemove(str);
		//System.out.println(ans);
		System.out.println(ans2);

	}
	//duplicate characters remove from string
	public static String duplicateStringRemove(String str) {
		if(str.length()==0) {
			return a;
		}
		char ch = str.charAt(0);
		
		if(!a.contains(str.valueOf(ch))) {
			a=a+ch;
		}
		duplicateStringRemove(str.substring(1));
		return a;
	}
	
	//only Consecutive Duplicate characters remove from string
	public static String ConsecutiveDuplicateStringRemove(String str) {
		if(str.length()==0) {
			return a;
		}
		char ch = str.charAt(0);
		if(a.isEmpty()) {
			a=a+ch;
		}
		if(str.charAt(0)!=a.charAt(a.length()-1)) {
			
			a=a+ch;
		}
		
		ConsecutiveDuplicateStringRemove(str.substring(1));
		return a;
	}

}
