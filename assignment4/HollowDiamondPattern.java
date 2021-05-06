/*
 * 

Take N (number of rows), print the following pattern (for N = 5).

     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *

Input Format

Constraints

0 < N < 10 (where N is an odd number)
Output Format

Sample Input

5

Sample Output

*	*	*   *   *		  
*	*	    *   *
* 	            *
* 	*       *   *
* 	*	*   *   *	

Explanation

Each '*' is separated from other by a tab.

 */

package assignment4;

import java.util.Scanner;

public class HollowDiamondPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = (n/2)+1;
		int nsp = -1;
		int row = 1;
		while(row<=n) {
			for(int cst=1;cst<=nst; cst++) {
				System.out.print("*\t");
			}
			for(int csp=1; csp<=nsp;csp++) {
				System.out.print("\t");
			}
			int cst=1;
			if(row==1 || row==n) {
				cst++;
			}
			for(;cst<=nst; cst++) {
				
				System.out.print("*\t");
			}
			System.out.println();
			if(row<=n/2) {
				nst--;
				nsp+=2;
			}
			else {
				nst++;
				nsp-=2;
			}
			row++;
		}

	}

}
