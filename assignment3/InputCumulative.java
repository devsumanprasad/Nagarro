/*
 * Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.

	Input Format
	A list of integers to be processed
	
	Constraints
	All numbers input are integers between -1000 and 1000.
	
	Output Format
	Print all the numbers before the cumulative sum become negative.
	
	Sample Input
	1
	2
	88
	-100
	49
	Sample Output
	1
	2
	88
 */

package assignment3;

import java.util.*;
public class InputCumulative {
    public static void main(String args[]) {
        int n, count=1, cum=0;
        Scanner sc = new Scanner(System.in);
        while(cum>=0){
            int temp = sc.nextInt();
            cum=cum+temp;
            if(cum>=0){
                System.out.println(temp);
            }
            
            else
                break;
           
            
        }

    }
}
