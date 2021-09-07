/*
Nishant is a very naughty boy in Launchpad Batch. One day he was playing with strings, 
and randomly shuffled them all. Your task is to help Nishant Sort all the strings ( lexicographically ) 
but if a string is present completely as a prefix in another string, then string with longer length should come first. 
Eg bat, batman are 2 strings and the string bat is present 
as a prefix in Batman - then sorted order should have - Batman, bat.

Input Format
N(integer) followed by N strings.

Constraints
N<=1000

Output Format
N lines each containing one string.

Sample Input
3
bat
apple
batman
Sample Output
apple
batman
bat
Explanation
In mathematics, the lexicographic or lexicographical order (also known as lexical order, 
dictionary order, alphabetical order or lexicographic(al) product) is a generalization of the way words are 
alphabetically ordered based on the alphabetical order of their component letters.
 */

package assignment6Recursion;
import java.util.*;
import java.util.Arrays;


public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] str = new String[n];
		for(int i=0; i<n;i++)
		str[i] = sc.next();
		
		String [] ans = new String[n];
		ans = stringSort(str);
		
		for(int i=0; i<str.length;i++)
		System.out.println(ans[i]);

	}
	
	static String [] stringSort(String [] str) {
		Arrays.sort(str);
		for(int i=0; i<str.length-1;i++) {
			if(str[i+1].charAt(0)==str[i].charAt(0)) {
				if(str[i+1].length()>str[i].length()) {
					String tmp = str[i+1];
					str[i+1]=str[i];
					str[i]=tmp;
				}
			}
		}
		
		return str;
	}

}
