/*
 * Take the following as input.

	A number (N1)
	A number (N2)
	Write a function which returns the LCM of N1 and N2. Print the value returned.
	
	Input Format
	Constraints
	0 < N1 < 1000000000 0 < N2 < 1000000000
	
	Output Format
	Sample Input
	4 
	6
	Sample Output
	12
	Explanation
	The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.
 */

package assignment3;

import java.util.*;
public class LCMOfTwoNumbers {
    public static void main(String args[]){
      long a, b, max, count, lcm = 0l;
      Scanner sc = new Scanner(System.in);
      a = sc.nextLong();
      b = sc.nextLong();

      if(a > b){
         max = count = a;
      }
      else{
         max = count = b;
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
            break;
         }
         max = max + count;
      }
      System.out.println(lcm);
   }
}

