/*
 * Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

	Input Format
	Single integer N.
	
	Constraints
	N <= 20
	
	Output Format
	Print pattern.
	
	Sample Input
	5
	Sample Output
	    *****
	   *   *
	  *   *
	 *   *
	*****
	Explanation
	For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
 */

package assignment4;
import java.util.*;

public class HollowRhombusPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = n-1;
		for(int i = 1; i<=n; i++) {
			for(int csp=1;csp<=nsp; csp++ ) {
				System.out.print(" ");
			}
			for(int cst=1; cst<=nst; cst++) {
				if(i==1 || i==n) {
					System.out.print("*");
				}
				else if(cst==1 || cst==nst) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			nsp--;
		}

	}

}
