/*
One of the important aspect of object oriented programming is readability of the code. 
To enhance the readability of code, developers write function and variable names in Camel Case. 
You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.

Input Format
A single line contains the string.

Constraints
|S|<=1000

Output Format
Print words present in the string, in the order in which it appears in the string.

Sample Input
IAmACompetitiveProgrammer
Sample Output
I
Am
A
Competitive
Programmer
Explanation
There are 5 words in the string.
 */

package assignment6Recursion;
import java.util.*;
public class CanYouReadThis {
	static ArrayList<Character> ans = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<Character> answer = printString(str);
		for(int i=0;i<answer.size();i++) {
			if(answer.get(i)>='A' && answer.get(i)<='Z') {
				if(i>0)
				System.out.println();
			}
			System.out.print(answer.get(i));
		}

	}
	public static ArrayList<Character> printString(String str) {
		if(str.length()==0) {
			return ans;
		}
		ans.add(str.charAt(0));
		printString(str.substring(1));
		return ans;
	}
}
