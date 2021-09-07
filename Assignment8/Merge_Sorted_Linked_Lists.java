/*
Given 2 sorted linked lists , merge the two given sorted linked list and print the final Linked List.

Input Format
First Line contains T the number of test cases.
For each test case :
Line 1 : N1 the size of list 1
Line 2 : N1 elements for list 1
Line 3 : N2 the size of list 2
Line 4 : N2 elements for list 2

Constraints
1 <= T <= 1000
0<= N1, N2 <= 10^6
-10^7 <= Ai <= 10^7

Output Format
For each testcase , print the node data of merged linked list.

Sample Input
1
4
1 3 5 7
3
2 4 6
Sample Output
1 2 3 4 5 6 7 
Explanation
The two lists after merging give the sorted output as [1,2,3,4,5,6,7] .
 */

package Assignment8;
import java .util.*;
public class Merge_Sorted_Linked_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0) {
			int m = sc.nextInt();
			LinkedList<Integer> ll1 = new LinkedList<Integer>();
			for(int i=0;i<m;i++) {
				ll1.add(sc.nextInt());
			}
			int n = sc.nextInt();
			LinkedList<Integer> ll2 = new LinkedList<Integer>();
			for(int i=0;i<n;i++) {
				ll2.add(sc.nextInt());
			}
			LinkedList<Integer> llAns = new LinkedList<Integer>();
			for(int i=0; i<m; i++) {
				llAns.add(ll1.removeFirst());
			}
			for(int i=0; i<n; i++) {
				llAns.add(ll2.removeFirst());
			}
			
			Collections.sort(llAns);
			for(int i=0; i<llAns.size();i++)
				System.out.print(llAns.get(i)+" ");
			System.out.println();
		}
		
	}


}
