/*
 Given a square matrix, print its transpose.

Input Format
First line contains the N ,size of the square matrix. Next N lines contains N integers each denoting the elements of the matrix

Constraints
1 <= N <= 10^3

Output Format
Print N lines each containing N elements. These are the elements of the new matrix.

Sample Input
5
1 46 4 60 100 
28 52 97 80 59 
6 33 62 42 12 
57 31 56 89 47 
1 50 73 53 99 

Sample Output
1 28 6 57 1 
46 52 33 31 50 
4 97 62 56 73 
60 80 42 89 53 
100 59 12 47 99 
 */

package assignment5;
import java.util.*;
public class TransposeOfSquareMetrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr1[][] = new int[n][n];
		int [][] transpose = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j] = s.nextInt();
			}
		}
		
		transpose = makeTranspose(arr1, n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
			

	}
	public static int [][] makeTranspose(int [][] arr1, int n){
		int [][] transpose = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				transpose[i][j]=arr1[j][i];
			}
		}
		
		return transpose;
	}

}
