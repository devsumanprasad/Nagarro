//pending, This is recursive approach and hance its giving TLE Run Error in online submission
/*
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PlayingWithGoodStrings {
	static ArrayList<String> a = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//String str = "cbaeicde";
		goodString(str, "");
		
		String an = Collections.max(a, Comparator.comparing(String::length)); 
		System.out.println(an.length());
		/*for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		 */
		
		//System.out.println(an);
	}
	
	static void goodString(String str, String ans) {
		if(str.length()==0) {
			//System.out.println(ans+" ");
			a.add(ans);
			return;
		}
		char c = str.charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			goodString(str.substring(1), ans+c);
			a.add(ans);
		}
		else {
			
			//char ch= 0;
			a.add(ans);
			ans="";
			goodString(str.substring(1), ans);
			
			
			
			//if(str.length()>1) {
				//c=str.charAt(1);
				//goodString(str.substring(1), ans+c);
			//}
			
		}
		
	}

}
