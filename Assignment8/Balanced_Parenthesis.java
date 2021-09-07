/*
You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence of parenthesis is balanced or not.
For example, "(())", "(())()" are balanced and "())(", "(()))" are not.

Input Format
A string of '(' , ')' , '{' , '}' and '[' , ']' .

Constraints
1<=|S|<=10^5

Output Format
Print "Yes" if the brackets are balanced and "No" if not balanced.

Sample Input
(())
Sample Output
Yes
Explanation
(()) is a balanced string.
 */

package Assignment8;
import java.util.*;
public class Balanced_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}
			else if(ch==')') {
				boolean val = closing_handler(st, '(');
				if(val==false) {
					System.out.println("No");
					return;
				}
			}
			else if(ch=='}') {
				boolean val = closing_handler(st, '{');
				if(val==false) {
					System.out.println("No");
					return;
				}
			}
			else if(ch==']') {
				boolean val = closing_handler(st, '[');
				if(val==false) {
					System.out.println("No");
					return;
				}
			}
		}
		if(st.size()==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	static boolean closing_handler(Stack<Character> st, char ch) {
		if(st.peek()!=ch) {
			return false;
		}else if(st.size()==0) {
			return false;
		}else {
			st.pop();
			return true;
		}
	}

}
