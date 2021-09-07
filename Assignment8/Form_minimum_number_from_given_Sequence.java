/*
Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

Input Format
The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.

Constraints
1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8

Output Format
Print the minimum number for each String separated by a new Line.

Sample Input
4
D I DD II
Sample Output
21
12
321 
123
Explanation
For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.
 */

package Assignment8;
import java.util.*;
public class Form_minimum_number_from_given_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strArr[] = new String[n];
		for(int i=0;i<strArr.length;i++)
			strArr[i]=sc.next();
		
		for(int i=0; i<strArr.length;i++) {
			minimumFunc(strArr[i]);
			System.out.println();
		}
		
		

	}
	
	static void minimumFunc(String str) {
		Stack<Integer> st = new Stack<>();
		int num = 1;
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='D') {
				st.push(num);
				num++;
			}
			else {
				st.push(num);
				num++;
				while(st.size()>0) {
					System.out.print(st.pop());
				}
			}
		}
		st.push(num);
		while(st.size()>0) {
			System.out.print(st.pop());
		}
		
	}

}
