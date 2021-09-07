/*
Given a list, modify it such that all odd elements appear before the even ones. The order of odd elements and even shall remain intact.

See explantaion for more info.

Input Format
The first line contains an integer N, the number of elements in the list.

The next line contains N space separated integral elements of the list.

Constraints
1 <= T <= 1000 0 <= N <= 10^6

Output Format
T lines of output

Sample Input
5
1 2 3 4 5
Sample Output
1 3 5 2 4 
Explanation
Input : 1 -> 2 -> 3 -> 4 -> 5

The order of odd elements and even does not change. For instance 3 comes before 5 in the input, so comes in the output.

Output: 1 -> 3 -> 5 -> 2 -> 4
 */

package Assignment8;
import java.util.*;
public class LL_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		Queue<Integer> qOdd = new LinkedList<>();
		Queue<Integer> qEven = new LinkedList<>();
		for(int i=0; i<n; i++) {
			ll.add(sc.nextInt());
		}
		/*
		 * ll.add(1); ll.add(2); ll.add(3); ll.add(4); ll.add(5);
		 */
		
		for(int i=0; i<ll.size();i++) {
			if(ll.get(i)%2!=0) {
				qOdd.add(ll.get(i));
			}
			else {
				qEven.add(ll.get(i));
			}
		}
		
		//System.out.println(qOdd);
		//System.out.println(qEven);
		
		Queue<Integer> qAns = new LinkedList<>();
		while(qOdd.size()>0)
			qAns.add(qOdd.poll());
		while(qEven.size()>0)
			qAns.add(qEven.poll());
		
		while(!qAns.isEmpty()) {
			System.out.print(qAns.poll()+" ");
		}

	}

}
