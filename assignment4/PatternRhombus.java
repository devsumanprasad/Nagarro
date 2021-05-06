/*
 * 

Take N (number of rows), print the following pattern (for N = 3).

                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1

Input Format

Constraints

0 < N < 10
Output Format

Sample Input

3

Sample Output

        1
	2	3	2
3	4	5	4	3
	2	3	2
		1

Explanation

Each number is separated from other by a tab.

 */

package assignment4;
import java.util.*;

public class PatternRhombus {

	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int num = 0;

    int nsp = n-1;

    int nst=1;

    for(int i = 1; i<=(2*n)-1; i++) {

    // for initializing num

    	if(i<=n){

    		num=i;

        }
    	else{

        	num = 2*n-1-i+1;

        }

        for(int csp=1; csp<=nsp; csp++) {

        	System.out.print(" \t");

        }

         for(int cst=1;cst<=nst; cst++) {

        	 System.out.print(num+"\t");

             if(cst<nst/2+1){

            	 num++;

             }
             else{

            	 num--;
             }

         }

         System.out.println();

         if(i<n) {

        	 nsp--;

        	 nst+=2;

         }

         else 
         {  

        	 nsp++;
        	 nst-=2;

         }
    	
    	}


  
	}
}
