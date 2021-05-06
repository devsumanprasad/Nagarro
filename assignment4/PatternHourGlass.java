/*
 * 

Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5

Input Format

Take N as input.
Constraints

N <= 20
Output Format

Pattern should be printed with a space between every two values.
Sample Input

5

Sample Output

 5 4 3 2 1 0 1 2 3 4 5
   4 3 2 1 0 1 2 3 4 
     3 2 1 0 1 2 3 
       2 1 0 1 2 
         1 0 1 
           0 
         1 0 1 
       2 1 0 1 2 
     3 2 1 0 1 2 3 
   4 3 2 1 0 1 2 3 4 
 5 4 3 2 1 0 1 2 3 4 5


 */

package assignment4;
import java.util.*;

public class PatternHourGlass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 2*n+1;
		int nsp = 0;
		
		for(int row=1; row<=nst; row++) {
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("  ");
			}
				for(int col=n;col>=0;col--) {
					System.out.print(col+" ");
				}
				for(int col=1;col<=n;col++) {
					System.out.print(col+" ");
				}
			System.out.println();
			if(row<=nst/2) {
				nsp++;
				n--;
			}
			else {
				nsp--;
				n++;
			}
			
		}
		

	}

}
