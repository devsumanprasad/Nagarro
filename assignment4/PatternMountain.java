/*
 * 

Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   

Input Format

Constraints

0 < N < 10
Output Format

Sample Input

4

Sample Output

1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1

Explanation

Each number is separated from other by a tab.

 */

package assignment4;
import java.util.*;

public class PatternMountain {

	public static void main(String args[]) {
        int totalrow,row,highest=1;
        Scanner scn = new Scanner(System.in);
        totalrow = scn.nextInt();
        for(row=1;row<=totalrow;row++){
        	int val=1;
            for(int i=1;i<=2*totalrow-1;i++){
            	if(val<=highest) {
            		System.out.print(val+"\t");
            	}
            	else
            		System.out.print("\t");
                
                if(i<totalrow) {
                	val++;
                }
                else
                	val--;
            }
            
            highest++;
            System.out.println();
        }

    }

}
