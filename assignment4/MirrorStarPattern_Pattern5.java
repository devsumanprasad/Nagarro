/*
 * Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *
Input Format
Constraints
0 < N < 10 (only odd numbers allowed)

Output Format
Sample Input
5
Sample Output
      *
    * * *
  * * * * *
    * * *
      *
Explanation
Each '*' is separated from other by a tab.
 */

package assignment4;
import java.util.*;

public class MirrorStarPattern_Pattern5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int row = 1;
	    int nst = 1;
	    int nsp = num / 2;
	    while (row <= num+1) {
	        for (int csp = 1; csp <= nsp; csp++) {
	            System.out.print(" \t");
	        }
	        for (int cst = 1; cst <= nst; cst++) {
	            System.out.print("*\t");
	        }
	        System.out.println("");
	        row = row + 1;
	        if (row <= (num / 2)+1) {
	            nst = nst + 2;
	            nsp = nsp - 1;
	        } 
            else {
	            nst = nst - 2;
	            nsp = nsp + 1;
	        }
	    }
	    
	}  

}
