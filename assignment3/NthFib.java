
/*
 * Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.
 * Input Format
 * Constraints
	0 <= N <= 1000

  *Output Format
    Sample Input
     10
    Sample Output
     55
Explanation
The 0th fibonnaci is 0 and 1st fibonnaci is 1.
 * */

package assignment3;

import java.util.*;
public class NthFib {

static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fib(n));
    }
}
