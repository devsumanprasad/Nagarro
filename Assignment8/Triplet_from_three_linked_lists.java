/*
Given three linked lists, say a, b and c, find one node from each list such that the sum of the values of the nodes is equal to a given number say, 
Target. As any number of answers can be possible return the first one you get while traversing.

Input Format
The First Line contains 3 Integers n, m and k as the Size of the Three LinedLists. 
Next 3 Lines contains n, m and k integers Respectively as the elements of Linked Lists. Next Line contains the an Integer as Target.

Constraints
The Size of the Lists can be different.

Output Format
Display the 3 elements from each of the Lists whose sum is equals to the target separated by space.

Sample Input
3 3 3
12 6 29
23 5 8
90 20 59
101
Sample Output
6 5 90
Explanation
In the Given Sample Input, 6, 5 and 90 from lists 1, 2 and 3 respectively add to give 101.
 */

package Assignment8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Triplet_from_three_linked_lists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int o=sc.nextInt();
		// TODO Auto-generated method stub
		LinkedList<Long> ll1 = new LinkedList<>();
		LinkedList<Long> ll2 = new LinkedList<>();
		LinkedList<Long> ll3 = new LinkedList<>();
		
		for(int i=0; i<m; i++)
			ll1.add(sc.nextLong());
		for(int i=0; i<n; i++)
			ll2.add(sc.nextLong());
		for(int i=0; i<o; i++)
			ll3.add(sc.nextLong());
		
		/*
		Collections.sort(ll2);
		Collections.sort(ll3);
		Collections.reverse(ll3);
		*/
		/*
		ll1.add(10);
		ll1.add(11);
		ll1.add(12);
		
		ll2.add(25);
		ll2.add(26);
		ll2.add(27);
		ll2.add(28);
		
		ll3.add(20);
		ll3.add(21);
		ll3.add(22);
		ll3.add(23);
		ll3.add(24);
		*/
		
		Long key=sc.nextLong();
		
		for(int i=0; i<ll1.size(); i++) {
			//int j=0, k=0;
			for(int j=0;j<ll2.size();j++ ) {
				if(ll1.get(i)+ll2.get(j)>key)
					continue;
				for(int k=0; k<ll3.size();k++){
					if(ll1.get(i)+ll2.get(j)+ll3.get(k)==key){
						System.out.print(ll1.get(i)+" "+ll2.get(j)+" "+ll3.get(k));
						System.exit(0);
					}
				}
			}
		}
	}

}
