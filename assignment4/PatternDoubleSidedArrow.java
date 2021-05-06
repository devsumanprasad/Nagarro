/*
 * 

Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 

Input Format

Take N as input.
Constraints

N is odd number.
Output Format

Pattern should be printed with a space between every two values.
Sample Input

7

Sample Output

            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 

Explanation

Catch the pattern and print it accordingly.
 */

package assignment4;
import java.util.*;
public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		Scanner scn;
		scn = new Scanner(System.in);
		int n = scn.nextInt();
		int allrow = n;
		int nst = 1;
		int nsp=n-1;
		int nsp2 = -1;
		int next = 1;
		int csp=0;
		int col=0;
		int isp=0;
		int osp=0;
		int j=0;
		int row=0;
		for(row=0; row<allrow;row++) {
			for(csp=0;csp<nsp;csp++) {
				System.out.print("  ");
			}
			int nextterm = next;
			for(col=0;col<nst;col++) {
				System.out.print(nextterm--+" ");
			}
			for(isp=0;isp<nsp2;isp++) {
				System.out.print("  ");
			}
			if(row==0 || row==allrow-1) {
				for(osp=0;osp<nst-1;osp++) {
					System.out.print(++nextterm+" ");
				}
			}else 
			{
				for(osp=0;osp<nst;osp++) {
					System.out.print(++nextterm+" ");
				}
			}
			
			System.out.println();
			if(row<allrow/2) {
				nst++;
				nsp-=2;
				nsp2+=2;
				next++;
			}else {
				nst--;
				nsp+=2;
				nsp2-=2;
				next--;
			}
			
							
			
		}
		
	}

}
