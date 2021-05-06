/*

	Write a program to print given pattern by taking input N.
	Input Format
	
	The first line contains an integer N.
	Constraints
	
	Output Format
	
	Display the pattern as result.
	Sample Input
	
	6
	
	Sample Output
	
	* * * * * * 
	 * * * * * 
	  * * * * 
	   * * * 
	    * * 
	     * 
	
	Explanation
 */

package assignment4;
import java.util.*;

public class DownwardTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = n;
		int totalCol = (2*n)-1;
		int currentRow = 1;
		int ssp = currentRow-1;
		
		while(currentRow<=row) {
			int i = 0;
			for(int cssp=1; cssp<=ssp; cssp++) {
				System.out.print(" ");
				i++;
			}
			for(int currentCol =i+1 ;currentCol<=totalCol;currentCol=currentCol+=2) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			currentRow++;
			ssp++;
			totalCol--;
		}

	}

}
