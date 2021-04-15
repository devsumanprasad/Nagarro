/*
 Take N as input. Print all prime numbers from 2 to N.

	Input Format
	Constraints
	1 <= N <= 1000

	Output Format
	Sample Input
		10
	Sample Output
		2
		3
		5
		7
	Explanation
	Each output should be on separate line. A prime number is that number which is divisible by one or itself.

 */

package assignment3;

import java.util.*;
import java.lang.*;
public class PrintPrime {
    
    public static void main(String args[]) {
        // Your Code Here
        
        int count = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<=n;i++){
            int div=2;
            if (i == 1 || i == 0)
                continue;
            count = 1;
            for(;div<=Math.sqrt(i);div++){
                if(i%div==0){
                    count=0;
                    break;
                }
                    
            }
            if(count==1){
                System.out.println(i);
            }

        }
    }
}
