/*
 * Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

	Input Format
	Constraints
	2 < N <= 1000000000
	
	Output Format
	Sample Input
	3
	Sample Output
	Prime
	Explanation
	The output is case specific
 */

package assignment3;
import java.util.*;
public class CheckPrime {
	public static void main(String[] args) {
		long n = 0;
	    Scanner scn = new Scanner(System.in);
	    n = scn.nextLong();
		long div = 2; 
		long count =0;
		while(div<=Math.sqrt(n)) { 
			if (n%div==0) {
				count = count+1;
			}
			div=div+1; 
		}
		if(count ==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime" );
		}
		
	}
}
