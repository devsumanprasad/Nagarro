//pending

/*
Given a singly linked list delete all nodes which are having a greater value among any of the nodes residing on the right side.

Input Format
First line contains N, the number of nodes in the linked list.
Next line contains the N nodes data .

Constraints
0<N<10^9

Output Format
Print the linked list after deleting the nodes which are having a greater value on right side.

Sample Input
8
12 15 10 11 5 6 2 3
Sample Output
15 11 6 3 
Explanation
In the given case 12 is having right node greater than itself i.e. 12<15 so delete it.
Similarly, 10<11, 5<6 and 2<3 so delete 10, 5 and 2 as well.
Thus, linked list becomes 15->11->6->3.
 */
package Assignment8;
import java.util.*;
public class Delete_Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		LinkedList<Long> ll = new LinkedList<>();
		long mx = -5000;
		for(int i=0; i<n; i++) {
			ll.add(sc.nextLong());
		}
		Collections.reverse(ll);
		for(int i=0; i<ll.size(); i++) {
			if(mx<ll.get(i))
				mx=ll.get(i);
			else {
				ll.remove(i);
				i--;
			}
		}
		Collections.reverse(ll);
		for(int i=0;i<ll.size();i++)
			System.out.print(ll.get(i)+" ");
	}

}
//-----------------------------------------------------------


