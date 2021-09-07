//pending
/*
The Game is as follows You have given a binary array, where 1 denotes push operation and 0 denotes a pop operation in a queue. 
The task is to check if the possible set of operations are valid or not.
Print Valid if the set of Operations are Valid Otherwise Print Invalid.

Input Format
The First Line contains an Integer T, as the number of Test cases.
The Next Line contains an Integer N, as the Size of the Array.
The Next Line contains N Binary numbers separated by space.

Constraints
Output Format
Print Valid If the set of operations are valid Otherwise Print Invalid for each Test Case separated by a new Line.

Sample Input
2
5
1 1 0 0 1
5
1 1 0 0 0 
Sample Output
Valid
Invalid
 */

package Assignment8;
import java.util.*;
public class TheQueueGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n; i++) {
				arr[i]=sc.nextInt();
			}
			int flag=0;
			Queue<Integer> qu = new LinkedList<>();
			for(int i=0; i<arr.length;i++) {
				if(arr[i]==1) {
					qu.add(arr[i]);
				}
				else {
					if(!qu.isEmpty())
						qu.remove();
					else {
						flag=1;
						break;
					}
				}
			}
			if(flag==0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
			
		}
		

	}

}
