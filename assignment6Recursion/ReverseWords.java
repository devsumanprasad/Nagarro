/*
Given a string of space separated words, you have to revere the order of words in a string in place.

Input Format
The first line consist number of test cases T. Each test case consists of a string of space separated words.

Constraints
1 ≤ T ≤ 1000

Output Format
Print the output string for each test case in a new line.

Sample Input
3
complex is fun
programming is an art
step on no step
Sample Output
fun is complex
art an is programming
step no on step
 */

package assignment6Recursion;

import java.util.Scanner;

public class ReverseWords {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t+1!=0) {
			String str = s.nextLine();
			//String str = "The sky is blue";
			String ans = "";
			//System.out.println(str);
			ans = reverseSt(str);
			
			System.out.println(ans);
			t--;
		}
		
	}
	public static String reverseSt(String str) {
		String ans= new String("");
		String finalAns="";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c==' ') {
				finalAns=" "+ans+finalAns;
				ans="";		
			}
			else {
				ans = ans+c;	
			}	
		}
		finalAns=ans+finalAns;
		return finalAns;
	}

}
