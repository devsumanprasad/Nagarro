/*
A Good String is a string which contains only vowels (a,e,i,o,u) . 
Given a string S, print a single positive integer N where N is the length of the 
longest substring of S that is also a Good String.

Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the substrings.

Input Format
A string 'S'

Constraints
Length of string < 10^5

Output Format
A single positive integer N, where N is the length of the longest sub-string of S that is also a Good String.

Sample Input
cbaeicde
Sample Output
3
Explanation
Longest good substring is "aei"
 */

package assignment6Recursion;

import java.util.Scanner;

public class PlayingWithGoodStringIterativeApproach {
	static String ans ="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "cbaeicde";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		goodString(str);

	}
	
	static void goodString(String str) {
		int tmp=0;
		String tmpAns = "";
		char [] arr = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				ans+=c;
			}
			else {
				if(tmpAns.length()<ans.length()) {
					tmpAns = new String (ans);
					
				}
				ans="";
			}
			//str.subSequence(tmp, i);
		}
		if(ans.length()>=1 && tmpAns.equals(""))
			System.out.println(ans.length());	
		else
			System.out.println(tmpAns.length());
	}

}
