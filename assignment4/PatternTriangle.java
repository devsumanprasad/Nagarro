/*
 * 

Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4

Input Format

Constraints

0 < N < 10
Output Format

Sample Input

4

Sample Output

            1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4

Explanation

Each number is separated from other by a tab.

 */

package assignment4;
import java.util.*;

public class PatternTriangle {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = 0;
		int nsp = n-1;
		for(int i = 1; i<=n; i++) {
			num=i;
			for(int csp=1; csp<=nsp; csp++) {
				System.out.print("\t");
			}
			for(int cst=1;cst<=i; cst++) {
				System.out.print(num+"\t");
				num++;
			}
			num-=2;
			for(int k=1;k<i;k++) {
				System.out.print(num+"\t");
				num--;
			}
			System.out.println();
				nsp--;
        }	
    }

}
