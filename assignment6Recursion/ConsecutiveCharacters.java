/*
Given a string s, the power of the string is the maximum length of a non-empty substring that contains 
only one unique character.

Return the power of the string.

Input Format
Single line input containing a string

Constraints
Solve in O(n) time.

Output Format
Single integer output

Sample Input
abbcccddddeeeeedcba
Sample Output
5
Explanation
The substring "eeeee" is of length 5 with the character 'e' only.
 */

package assignment6Recursion;
import java.util.*;
public class ConsecutiveCharacters {
	static int cnt=1;
	static int tempcnt=0;
	static int currPos=1;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		//int ans= consecutiveMax(str);
		//int ans= maxConsq(str);
		int ans= maxConsecutiveChar(str);
		System.out.println(ans);
		//s.close();

	}
	//O(n^2) solution
	
	public static int consecutiveMax(String str) {
		if(str.length()==0) {
			//System.out.println(tempcnt);
			return tempcnt;
		}
		char c = str.charAt(0);
		for(int i=1; i<str.length();i++) {
			if (c==str.charAt(i)) {
				cnt=cnt+1;
			}
			else
				break;
		}
		
		tempcnt = Math.max(cnt, tempcnt);
		cnt=1;
		consecutiveMax(str.substring(1));
		return tempcnt;
		
	}

	
	//O(n) solution
	public static int maxConsq(String str) {
		
		if(str.length()<=1) {
			return tempcnt;
		}
		
		//if(str.length()==1) { return 1; }
		 
		char ch = str.charAt(currPos);
		//String temp = str.substring(1);
		if(ch==str.charAt(currPos-1)) {
			cnt++;
			tempcnt = Math.max(tempcnt, cnt);
		}
		else
			cnt=1;
		maxConsq(str.substring(1));
		return tempcnt;
	}
	
	//trying itterative approch in O(n)
	
	public static int maxConsecutiveChar(String str) {
		int count = 0;
		int curr_start = 1;
		int tmp = 0;
		int start=0;
		
		for(int i=0; i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				//count++;
				curr_start++;
				
			}
			else {
				tmp = Math.max(curr_start, tmp);
				curr_start=1;
			}
			
		}
		
		return tmp;
	}
	
}