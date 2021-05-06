/*

Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
Input Format

Constraints

0 < N < 100
Output Format

Sample Input

6

Sample Output

1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1

Explanation

Each number is separated from other by a tab.

 */

package assignment4;
import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		int row,col,n,totrow;
        Scanner scn = new Scanner(System.in);
        totrow = scn.nextInt();
		for(row=1;row<=totrow;row++) {
			n=1;
			for(col=1;col<=row;col++) {
				System.out.print(n+"\t");
				n=(n*(row-col))/(col);
			}
			System.out.println();
		}

	}

}
