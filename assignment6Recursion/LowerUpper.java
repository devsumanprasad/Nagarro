/*
Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" 
if character lies between 'A-Z' and print "Invalid" for all other characters like $,.^# etc.

Input Format
Single Character .

Constraints
-

Output Format
lowercase UPPERCASE Invalid

Sample Input
$
Sample Output
Invalid
Explanation
-
 */

package assignment6Recursion;
import java.util.*;
public class LowerUpper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char str = scn.next().charAt(0);
		
		String ans = lowerUpper(str);
		System.out.println(ans);
	}
	
	public static String lowerUpper(char str) {
		
		if((int)str >= 65 && str<= (char)(90)) {
			return "UPPERCASE";
		}
		else if((int)str>= 97 && str<= (char)(122)) {
			return "lowercase";
		}
		
		else
			return "Invalid";
	}

}
