/*
Given a string and a character, remove all occurrences of that character from the string.

Input Format
First line contains the string. Second line contains the character.

Constraints
Your algorithm should work in O(n) time.

Output Format
Print the modified string

Sample Input
codingblocks
o
Sample Output
cdingblcks
Explanation
Remove o from 'codingblocks'
 */

package assignment6Recursion;
import java.util.*;
public class RemoveAllOccurrencesOfGivenCharacterInTheString {
	static String temp="";
	static String rec = "";
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char c = scn.next().charAt(0);
		//String ans = removeChar(s,c);
		//System.out.println(ans);
		
		String ans2 = removeCharRecursive(s,c);
		System.out.println(ans2);

	}
	
	//iterative approach o(n)
	static String removeChar(String s, char c) {
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)!=c)
				temp+=s.charAt(i);
		}
		return temp;
	}
	
	//Recursive approach
	static String removeCharRecursive(String s, char c) {
		if(s.length()==0) {
			return rec;
		}
			if(s.charAt(0)!=c)
				rec+=s.charAt(0);
			removeCharRecursive(s.substring(1),c);
			
		
		return rec;
	}
}
