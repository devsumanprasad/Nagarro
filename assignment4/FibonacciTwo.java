/*
 * 

Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34
Input Format

Constraints

0 < N < 100
Output Format

Sample Input

4

Sample Output

0 
1    1 
2    3     5 
8   13    21    34

Explanation

Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers. Kth row contains , next k fibonacci numbers.

 */

package assignment4;

import java.util.Scanner;

public class FibonacciTwo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=0;
		int c =0;
		int i = 0;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		while(i<n) {
			for(int j=0;j<=i;j++) {
				System.out.print(c+"\t");
				
				a=b;
				b=c;
				c=a+b;
				
			}
			System.out.println();
			i++;
		}

	}

}
