/*
 Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars.


Input Format
First line contains a single integer N, denoting the number of bars in th histogram.
Next line contains N integers, ith of which, denotes the height of ith bar in the histogram.

Constraints
1<=N<=10^6
Height of each bar in histogram <= 10^9

Output Format
Output a single integer denoting the area of the required rectangle.

Sample Input
5
1 2 3 4 5
Sample Output
9
Explanation
The largest rectangle can be obtained of breadth=3 and length=3. Its starting index is 2 and ending index is 4 and it has a height of 3. Hence area = 3*3 = 9
 */
package Assignment8;
import java.util.*;
public class HISTOGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextLong();
		}
		long ans = largestRectArea(arr);
		System.out.println(ans);

	}
	static long largestRectArea(long arr[]) {
		
		if(arr.length==0) {
			return 0;
		}
		if(arr.length==1) {
			return arr[0];
		}
		
		long maxArea = Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<>();
		stack.add(0);
		for (int i = 1; i < arr.length; i++) {
			long curr = arr[i];
			if(curr >= arr[stack.peek()]) {
				stack.add(i);
			}else {
				while(stack.size()>0 && curr<arr[stack.peek()]) {
					long tmp = arr[stack.pop()];
					if(stack.isEmpty()) {
						maxArea = Math.max(maxArea, tmp*i);
					}else {
						maxArea = Math.max(maxArea, tmp*(i-stack.peek()-1));
					}
				}
				stack.add(i);
			}
		}
		if (stack.size()>0) {
			int i=arr.length;
			while(stack.size()>0) {
				long tmp = arr[stack.pop()];
				if(stack.isEmpty()) {
					maxArea = Math.max(maxArea, tmp*i);
				}else {
					maxArea = Math.max(maxArea, tmp*(i-stack.peek()-1));
				}
			}
		}
		return maxArea;
	}

}
