/*
 * Take N (number of rows), print the following pattern (for N = 4)

	1
	2 3
	4 5 6
	7 8 9 10
	
	Input Format
	Constraints
	0 < N < 100
	
	Output Format
	Sample Input
	4
	Sample Output
	1  
	2	3  
	4	5	6  
	7	8	9	10
	Explanation
	Each number is separated from other by a tab.
 */

package assignment4;
import java.util.*;
public class PatternNumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				count = count+1;
				System.out.print(count+"\t");
			}
			System.out.println();
		}

	}

}
