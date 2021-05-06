/*
 * Take the following as input.

	A number (N1)
	A number (N2)
	Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
	
	Input Format
	Constraints
	0 < N1 < 100 0 < N2 < 100
	
	Output Format
	Sample Input
	10 
	4
	Sample Output
	5 
	11 
	14 
	17 
	23 
	26 
	29 
	35 
	38 
	41
	Explanation
	The output will've N1 terms which are not divisible by N2.
 */

package assignment3;

import java.util.*;
public class Series3Nplus2 {
    public static void main(String args[]) {

        int N1=0;
        int N2=0;
        int outcome=0;
        Scanner scn = new Scanner(System.in);
        N1 = scn.nextInt();
        N2 = scn.nextInt();
        
        
        int n=1;
        while(n<=N1){
            outcome = (n * 3) + 2;
            if(outcome % N2 != 0){
                System.out.println(outcome);  
            }
            
            else{
                N1++;
            }
            n++;         
            
        }
                   
    }
    
}
