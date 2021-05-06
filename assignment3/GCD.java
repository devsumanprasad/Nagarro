/*
 * Take the following as input.

	A number (N1)
	A number (N2)
	Write a function which returns the GCD of N1 and N2. Print the value returned.
	
	
	
	Input Format
	Two integers seperated by a new line.
	
	Constraints
	0 < N1 < 1000000000
	0 < N2 < 1000000000
	
	Output Format
	Output a single integer which is the GCD of the given integers.
	
	Sample Input
	16 
	24
	Sample Output
	8
	Explanation
	The largest number that divides both N1 and N2 is called the GCD of N1 and N2.
 */

package assignment3;

import java.util.*;
public class GCD {
	public static void main(String[] args) {
		long n1 = 0l;
		long n2 = 0l;
        Scanner scn = new Scanner(System.in);
        n1 = scn.nextLong();
        n2 = scn.nextLong();
		long divisor = Math.min(n1, n2);
		long dividend = Math.max(n2, n1);
		while(true) {
			long remainder =  dividend %divisor;
			if(remainder==0) {
				break;
			}
			dividend = divisor;
			divisor = remainder;
		}
		System.out.println(divisor);
		
	}
}
