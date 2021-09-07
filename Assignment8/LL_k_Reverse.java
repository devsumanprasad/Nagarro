/*
Given a head to Linked List L, write a function to reverse the list taking k elements at a time. Assume k is a factor of the size of List.

You need not have to create a new list. Just reverse the old one using head.

Input Format
The first line contains 2 space separated integers N and K

The next line contains N space separated integral elements of the list.

Constraints
0 <= N <= 10^6 0 <= K <= 10^6

Output Format
Display the linkedlist after reversing every k elements

Sample Input
9 3
9 4 1 7 8 3 2 6 5
Sample Output
1 4 9 3 8 7 5 6 2
Explanation
N = 9 & K = 3

Original LL is : 9 -> 4 -> 1 -> 7 -> 8 -> 3 -> 2 -> 6 -> 5

After k Reverse : 1 -> 4 -> 9 -> 3 -> 8 -> 7 -> 5 -> 6 -> 2
 */

package Assignment8;
import java.util.*;
public class LL_k_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i=0;i<n;i++) {
			ll.add(sc.nextInt());
		}
		
		
		
		Queue<Integer> qu = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		while(!ll.isEmpty()) {
			if(ll.size()>=k) {
				for(int i=0; i<k; i++) {
					st.add(ll.removeFirst());
				}
				for(int i=0; i<k; i++) {
					qu.add(st.pop());
				}
			}else {
				for(int i=0; i<ll.size(); i++) {
					qu.add(ll.removeFirst());
				}
			}
			
		}
		for(int i=0;i<n;i++)
			System.out.print(qu.poll()+" ");
			
	}

}

