/*

	Write a program to print given pattern by taking input N.
	Input Format
	
	The first line contains an integer N.
	Constraints
	
	Output Format
	
	Display the pattern as result.
	Sample Input
	
	5
	
	Sample Output
	
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	
	Explanation

 */

package assignment4;
import java.util.*;

public class HalfPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		for(int i = 1; i<=n; i++) {
			int count = 0;
			for(int j = 1; j<=i; j++) {
				count=count+1;
				System.out.print(count);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
