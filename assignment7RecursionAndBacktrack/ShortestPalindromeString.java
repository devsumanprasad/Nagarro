/*
 Given a string s, you are allowed to convert it to a palindrome by adding characters in front of it. 
 Find and return the shortest palindrome you can find by performing this transformation.

Input Format
Take input String s

Constraints
length of String <10000

Output Format
print the shortest palindrome string

Sample Input
aacecaaa
Sample Output
aaacecaaa
 */

package assignment7RecursionAndBacktrack;

import java.util.Scanner;

public class ShortestPalindromeString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = shortestPalindrome(s);
		System.out.println(ans);
	}
	
	public static String shortestPalindrome(String s) {
    int i=0; 
    int j=s.length()-1;
 
    while(j>=0){
        if(s.charAt(i)==s.charAt(j)){
            i++;
        }
        j--;
    }
 
    if(i==s.length())
        return s;
 
    String suff = s.substring(i);
    String pre = new StringBuilder(suff).reverse().toString();
    String mid = shortestPalindrome(s.substring(0, i));
    return pre+mid+suff;
	}

}
