/*
 * 

Given an integer N, print Pascal Triangle upto N rows.
Input Format

Single integer N.
Constraints

N <= 10
Output Format

Print pascal triangle.
Sample Input

4

Sample Output

           1
         1   1
       1   2   1
     1   3   3   1


 */

package assignment4;

import java.util.Scanner;

public class PascalTriangleOne {

	public static void main(String[] args) {
		int row,col,n,totrow,space;
        Scanner scn = new Scanner(System.in);
        totrow = scn.nextInt();
        space=totrow-1;
		for(row=1;row<=totrow;row++) {
			for(int j=0; j<=totrow-row;j++) {
				System.out.print(" ");
				
			}
			n=1;
			for(col=1;col<=row;col++) {
				System.out.print(n+" ");
				n=(n*(row-col))/(col);
			}
			System.out.println();
		}

	}

}
