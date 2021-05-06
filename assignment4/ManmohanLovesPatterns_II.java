/*
 * 

Help Manmohan to print pattern of a given number. See the output pattern for given input n = 5.
Input Format

Single integer N denoting number of lines of the pattern.
Constraints

N<=1000
Output Format

Pattern.
Sample Input

5

Sample Output

1
11
202
3003
40004

Explanation

If row number is n (>1), total character is n. First and last character is n-1 and rest are 0.

 */

package assignment4;

import java.util.Scanner;

public class ManmohanLovesPatterns_II {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int subrow = 0;
		for(int i = 1; i<=n; i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 && j==1)
					System.out.print(row);
				else if(j==1 || j==i  )
					System.out.print(subrow);
				else
					System.out.print(row-1);
				
			}
		System.out.println();
		subrow++;
		
		}

	}

}
