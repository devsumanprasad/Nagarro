/*
Given a linked list of length N and an integer K , append the last K elements of a linked list to the front. Note that K can be greater than N.

Input Format
First line contains a single integer N denoting the size of the linked list.
Second line contains N space separated integers denoting the elements of the linked list.
Third line contains a single integer K denoting the number of elements that are to be appended.

Constraints
1 <= N <= 10^4
1 <= K <= 10^4

Output Format
Display all the elements in the modified linked list.

Sample Input
7
1 2 2 1 8 5 6
3
Sample Output
8 5 6 1 2 2 1
Explanation
Initially the linked list is
1→ 2→ 3 → 4 → 5 → 6→ null
and k = 2. After appending the last two elements to the front , the new linked list looks like
5→ 6→ 1→ 2→ 3 → 4 → null
 */

package Assignment8;
import java.util.*;
public class Linked_List_K_Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			ll.add(sc.nextInt());
		}
		//int s=0;
		int k = sc.nextInt();
		k=k%n;
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<k;i++) {
			st.push(ll.removeLast());
		}
		while(!st.isEmpty()) {
			ll2.add(st.pop());
		}	
		while(!ll.isEmpty()) {
			ll2.add(ll.removeFirst());
		}	
		
		
		for(int i=0; i<ll2.size();i++) {
			System.out.print(ll2.get(i)+" ");
		}
		
	}

}
