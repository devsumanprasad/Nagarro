/*
Anmol has an array of integers of length n. He considers an array good if, for every non-empty subarray of that array, 
the sum of elements in the subarray is non-zero.
For example, array [−1,2,−3] is good, as all subarrays [−1], [−1,2], [−1,2,−3], [2], [2,−3], [−3] have nonzero sums of elements. 
However, array [−1,2,−1,−3] isn't good, 
as his subarray [−1,2,−1] has sum of elements equal to 0.
He wants you to find the number of nonempty good subarrays of the array he has.
An array c is a subarray of an array b if c can be obtained from b by deletion of several (possibly, zero or all) elements from the 
beginning and several (possibly, zero or all) elements from the end.

Input Format
The first line contains a integer n - the number of elements in the array.
The next line contains n space separated integers - elements of array.

Constraints
1 <=n <=10^5

Output Format
Print a single integer equal to number of good subarrays.

Sample Input
3
1 2 -3
Sample Output
5
Explanation
The following subarrays are good: [1], [1,2], [2], [2,−3], [−3]. However, the subarray [1,2,−3] isn't good, as its subarray [1,2,−3] has 
sum of elements equal to 0.
 */
package assignment_12Graph;
import java.util.*;
public class Anmol_and_Good_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
