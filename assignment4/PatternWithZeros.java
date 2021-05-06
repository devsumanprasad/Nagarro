/*
 * 

Take N (number of rows), print the following pattern (for N = 5)
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5
Input Format

There will be an integer in input.
Constraints

0 < N < 100
Output Format

Print the pattern.
Sample Input

5

Sample Output

1  
2	2  
3	0	3    
4	0	0	4  
5	0	0	0	5

Explanation

Each number is separated from other by a tab.If row number is n (>1), total character is n. First and last character is n and rest are 0.

 */

package assignment4;
import java.util.*;

public class PatternWithZeros {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int subrow = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i)
					System.out.print(row+"\t");
				else
					System.out.print(subrow-1+"\t");
			}
			
			System.out.println();
			row++;
		}

	}

}
