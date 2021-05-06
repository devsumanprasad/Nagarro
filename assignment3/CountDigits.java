/* 
 * Take the following as input.
	A number
	A digit
	Write a function that returns the number of times digit is found in the number. Print the value returned.
	
	Input Format
	Integer (A number) Integer (A digit)
	
	Constraints
	0 <= N <= 1000000000 0 <= Digit <= 9
	
	Output Format
	Integer (count of times digit occurs in the number)
	
	Sample Input
	5433231 
	3
	Sample Output
	3
	Explanation
	The digit can be from 0 to 9. Assume decimal numbers.In the given case digit 3 is occurring 3 times in the given number.
 */

package assignment3;

import java.util.*;
public class CountDigits {
	public static void main(String[] args) {
		long n = 0l;
        long occurance = 0l;
		long ans =0l;
        long count = 0;
        Scanner scn = new Scanner(System.in);
        n = scn.nextLong();
        occurance = scn.nextLong();
        if(occurance<=9 && occurance>=0){
            while (n!=0) {
                long digit = n%10;
                ans= ans*10+digit;

                n = n/10;
                if (digit == occurance)
                    count++;
		    }
        }
		
		System.out.println(count);
	}
}
