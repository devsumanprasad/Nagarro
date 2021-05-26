/*
 * For the given 2 dimensional matrix mat with r rows and c columns print the upper and the lower triangle of the matrix. Where,
Lower triangular matrix is a matrix of elements below the principle diagonal including the principle diagonal elements , 
rest elements are 0.
Upper triangular matrix is a matrix of elements above the principle diagonal including the principle diagonal elements , 
rest elements are 0.

Input Format
First line of the input contains two integers r,c denoting number of rows and number of columns. 
Next r*c line contains elements of the matrix.

Constraints
0<=r,c<=10
0<=mat[i][j]<=100

Output Format
2-D matrix representing Lower Triangular Matrix 2-D matrix representing Upper Triangular Matrix.

Sample Input
3 3
1 2 3
4 5 6 
7 8 9
Sample Output
1 2 3
0 5 6
0 0 9


1 0 0 
4 5 0
7 8 9

Explanation
None.
 */
package assignment5;
import java.util.*;


public class PrintUpperAndLowerTriangleMatrixOfTheGivenMatrix {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int m= s.nextInt();
		int n= s.nextInt();

		int [] [] mat = new int[m][n];
		
		int [][]  lower = new int[m][n];
		int [][] upper = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0; j<n;j++) {
				mat[i][j]=s.nextInt();
			}
		}
		upper = printUpper(mat);
		lower = printLower(mat);
		/*
		 * for(int i=0;i<n;i++) System.out.println(Arrays.toString(mat[i]));
		 */
		
		//System.out.println();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(upper[i][j]+" ");
			}
			System.out.println();
		}
			
		
		System.out.println();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(lower[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static int[][] printUpper(int [][] mat) {
		int ans[][] = new int[mat.length][mat[0].length];
		//int count=0;
		for(int row=0;row<mat.length;row++) {
			for(int col=row;col<mat[0].length;col++) {
				ans[row][col]=mat[row][col];
				//count++;
			}
		}
		return ans;
	}
	
	public static int[][] printLower(int [][] mat) {
		int ans[][] = new int[mat.length][mat[0].length];
		//int count=0;
		for(int col=0;col<mat[0].length;col++) {
			for(int row=col;row<mat.length;row++) {
				ans[row][col]=mat[row][col];
				//count++;
			}
		}
		return ans;
	}

}
