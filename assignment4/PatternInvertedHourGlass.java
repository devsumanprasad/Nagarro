/*
 * 

Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 

Input Format

Take N as input.
Constraints

Output Format

Pattern should be printed with a space between every two values.
Sample Input

5

Sample Output

5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5 


 */

package assignment4;
import java.util.*;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		int nsp, n=0, high, row;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		nsp = (2*n)-1;
		row = (2*n)+1;
		high=n;
		for(int i=1; i<=row; i++) {
			int cst = n;
			while(cst>=high) {
				System.out.print(cst+" ");
				cst--;
				
			}
			
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			cst = high;
			if(high==0) {
				cst=1;
			}
			
			while(cst<=n) 
			{ 
				System.out.print(cst+" ");
				cst++; 
			}
			 
			if(i<n+1) {
				high--;
				nsp=nsp-2;
			}
			else {
				high++;
				nsp=nsp+2;
			}
			
			System.out.println();
			
		}
	}

}
