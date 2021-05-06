/*
 * Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct , Real and Equal or Imaginary) and the roots.
	If Real and Distinct , print the roots in increasing order.
	If Real and Equal , print the same repeating root twice
	If Imaginary , no need to print the roots.
	
	Note : Print only the integer part of the roots.
	
	Input Format
	First line contains three integer coefficients a,b,c for the equation ax^2 + bx + c = 0.
	
	Constraints
	-100 <= a, b, c <= 100
	
	Output Format
	Output contains one/two lines. First line contains nature of the roots .The next line contains roots(in non-decreasing order) separated by a space if they exist. If roots are imaginary do not print the roots. Output the integer values for the roots.
	
	Sample Input
	1 -11 28
	Sample Output
	Real and Distinct
	4 7
	Explanation
	The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a
 */

package assignment3;

import java.util.*;
public class RevisingQuadraticEquation {
    public static void main(String args[]) {
        int a=0,b=0,c=0;
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        if(a==0)
            System.exit(0);
        int x1=0,x2=0,d=0;
        
            d = b*b - (4*a*c);
            if(d>0){
                 System.out.println("Real and Distinct");
                 double det=Math.sqrt(d);
                 x2 = (int)(-b + det)/(2*a);
                 x1 = (int)(-b - det)/(2*a);
            }
            else if(d==0){
                 System.out.println("Real and Equal");
                x1 = x2 = (-b)/(2*a);
            }
            else{
                System.out.println("Imaginary");
                return;
            }
           
            System.out.println(Math.min(x1,x2)+" "+Math.max(x1,x2));
        
    }
}
