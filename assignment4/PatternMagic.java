/*
 * 

You will be given a number N. You have to code a hollow diamond looking pattern.

The output for N=5 is given in the following image.

*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
Input Format

The input has only one single integer N.
Constraints

Output Format

Output the given pattern.
Sample Input

Sample Output
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********

Explanation

Write a code to print above given pattern. No space between any two characters.

 */

package assignment4;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = -1;
		int row = 1;
		while(row<=(2*n)-1) {
			for(int cst=1;cst<=nst; cst++) {
				System.out.print("*");
			}
			for(int csp=1; csp<=nsp;csp++) {
				System.out.print(" ");
			}
			int cst=1;
			if(row==1 || row==2*n-1) {
				cst++;
			}
			for(;cst<=nst; cst++) {
				
				System.out.print("*");
			}
			System.out.println();
			if(row<n) {
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
