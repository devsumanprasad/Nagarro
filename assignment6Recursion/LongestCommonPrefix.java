/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Input Format
First Line Contains Single Integer n. Next line contain n strings

Constraints
length of strings is less than 1e5

Output Format
Single String

Sample Input
3
aad aas aac
Sample Output
aa
 */

package assignment6Recursion;
import java.util.*;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String[] str = new String[n]; 
		
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		
		
		String ans = commonPrefix(str);
		System.out.println(ans);

	}
	
	public static String commonPrefix(String[] str) {
		Arrays.sort(str);
		int n = str.length;
		if(n==0) {
			return "";
		}
		else if(n==1) {
			return str[0];
		}
		
		int minLen=0;
		minLen = Math.min(str[0].length(), str[n-1].length());
		int i=0;
		while(i<minLen && str[0].charAt(i)==str[n-1].charAt(i)) {
			i++;
			
		}
		String prefix = "";
		prefix = new String(str[0].substring(0,i));
		
		return prefix;
	}

}
