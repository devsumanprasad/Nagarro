/*
Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with 
all possible words that can be written with the pressed keys.

Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 
6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz

E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”

a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.

b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

Input Format
Single line input containing a single integer.

Constraints
1 <= Length of string <= 10^3

Output Format
Print all the words in a space separated manner. Also print the count of these numbers in next line.

Sample Input
12
Sample Output
ad ae af bd be bf cd ce cf
9
Explanation
1 can correspond to 'a' , 'b' or 'c' .
2 can correspond to 'd', 'e' or 'f'.
We print all combinations of these
 */

package assignment6Recursion;
import java.util.*;
public class RecursionKeypadCodes {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		keypadCalc(str,"");
		System.out.println();
		System.out.print(cnt);

	}
	public static void keypadCalc(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			cnt++;
			return;
		}
		
		char ch = str.charAt(0);
		String substr = str.substring(1);
		String temp = keyVal(ch);
		
		for(int i=0; i<temp.length();i++) {
			keypadCalc(substr, ans+temp.charAt(i));
		}
		
		
	}
	
	public static String keyVal(char ch) {
		switch(ch) {
		case '1':
			return "abc";
		
		case '2':
			return "def";
		
		case '3':
			return "ghi";
		
		case '4':
			return "jkl";
			
		case '5':
			return "mno";
		
		case '6':
			return "pqrs";
		
		case '7':
			return "tuv";
			
		case '8':
			return "wx";
			
		case '9':
			return "yz";
			
		default:
			break;
		
		}
		return "";
	}
}
