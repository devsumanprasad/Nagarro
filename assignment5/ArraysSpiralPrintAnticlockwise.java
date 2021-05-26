/*
 * Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

Input Format
Two integers M(row) and N(column) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers separated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
Explanation
For spiral level anti-clockwise traversal, Go for first column-> last row ->last column-> 
first row and then do the same traversal for the remaining matrix .
 */

package assignment5;
import java.util.*;
public class ArraysSpiralPrintAnticlockwise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*m rows n columns*/
		int m = s.nextInt();
		int n = s.nextInt();
		int [][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		spiralPrintAntiClock(arr,m,n);
	}
	
	public static void spiralPrintAntiClock(int[][] arr, int m, int n) {
		int minCol=0;
		int maxCol=n-1;
		int minRow=0;
		int maxRow=m-1;
		int count=0;
		
		while(count<m*n) {
			for(int i=minRow;i<=maxRow && count<m*n;i++) {
				System.out.print(arr[i][minCol]+", ");
				count++;
			}
			minCol+=1;
			
			for(int i=minCol;i<=maxCol && count<m*n;i++) {
				System.out.print(arr[maxRow][i]+", ");
				count++;
			}
			maxRow-=1;
			
			for(int i=maxRow;i>=minRow && count<m*n;i--) {
				System.out.print(arr[i][maxCol]+", ");
				count++;
			}
			maxCol-=1;
			
			for(int i=maxCol;i>=minCol && count<m*n;i--) {
				System.out.print(arr[minRow][i]+", ");
				count++;
			}
			minRow+=1;
			if(count==m*n)
				System.out.println("END");
		}
		
		
	}

}
