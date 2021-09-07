/*
Check if a linked list is a palindrome.( Boolean return type )

Input Format
Add N space separated elements in the list

Constraints
None

Output Format
Boolean answer( true or false)

Sample Input
5
1 2 3 6 8
Sample Output
false
 */

package Assignment8;
import java.util.*;
public class Palindrome_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i=0; i<n;i++) {
			ll.add(sc.nextInt());
		}
		System.out.println();
		System.out.println(checkPalindrome(ll));
	}

	private static boolean checkPalindrome(LinkedList<Integer> ll) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll2 = new LinkedList<>();
		for(int i=0; i<ll.size();i++) {
			ll2.add(ll.get(i));
		}
		
		Collections.reverse(ll2);
		if(ll.equals(ll2)) {
			return true;
		}
		else {
			return false;
		}
	}

}
