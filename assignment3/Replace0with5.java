/*
 * Given a integer as a input and replace all the '0' with '5' in the integer

	Input Format
	Enter an integer n
	
	Constraints
	0<=n<=1000000000000
	
	Output Format
	All zeroes are replaced with 5
	
	Sample Input
	102
	Sample Output
	152
	Explanation
	Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.
 */

package assignment3;

import java.util.*;
public class Replace0with5 {
    static long replaceNum(long number)
    {
        return number = number + calculation(number);
    }
 
    private static long calculation(long number)
    {
 
        long result = 0l;
        long place = 1l;
 
        if (number == 0) {
            result = result + (5 * place);
        }
 
        while (number > 0) {
            if (number % 10 == 0)
                result = result + (5 * place);
 
            number = number / 10;
            place = place * 10;
        }
        return result;
    }
 
    public static void main(String[] arg)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        if(n>=0)
            System.out.print(replaceNum(n));
    }
}
