/*
 * Take as input a two-d array. Wave print it row-wise.

Input Format
Two integers M(row) and N(column) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers are seperated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
 */

package assignment5;
import java.util.*;
public class ArraysWavePrintRowWise {

	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int m=s.nextInt();
			int n=s.nextInt();
			int [][] arr=new int[m][n];
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=s.nextInt();
				}
			}
			
			wavePrintRowWise(arr); 

		}
		public static void wavePrintRowWise(int [][] arr) {
			for(int row=0; row<arr.length;row++) {
				if(row%2==0) {
					for(int col=0; col<arr[0].length;col++) {
						System.out.print(arr[row][col]);
	                    if(row<arr.length-1 || col<arr[0].length-1)
	                        System.out.print(", ");
	                    else if(col==arr[0].length-1 && row==arr.length-1)
	                        System.out.print(", END");
					}
				}
				else {
					for(int col=arr[0].length-1; col>=0;col--) {
						System.out.print(arr[row][col]);
	                    if(col>0 || row<arr.length-1)
	                        System.out.print(", ");
	                    else if(col==0 && row==arr.length-1)
	                        System.out.print(", END");
					}
				}
				
			}
		}

}
