/*
 You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from position (i,j), down or right on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M). Find the rightmost path through which, 
rat can reach this position. A path is rightmost, if the rat is at position (i,j), it will always move to (i,j+1), 
if there exists a path from (i,j+1) to (N,M).

Input Format
First line contains 2 integers, N and M, denoting the rows and columns in the grid. Next N line contains. M characters each. 
An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

Constraints
1<=N,M<=1000 GRID(i,j)='X' or 'O'

Output Format
If a solution exists: Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is 
covered in the path and a 0 denotes that the cell is not covered in the path.
If solution doesn't exist, just print "-1".

Sample Input
5 4
OXOO
OOOX
OOXO
XOOO
XXOO
Sample Output
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 1 
0 0 0 1 
 */
package assignment7RecursionAndBacktrack;
import java.util.*;
public class Rat_In_The_Maze {
	static int tmp = 0;
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		// TODO Auto-generated method stub
		char [][] grid = new char[m][n];
		for(int i=0; i<m; i++) {
			String st = sc.next();
			for(int j=0; j<n;j++) {
				grid[i][j]=st.charAt(j);
			}
		}
		
		int visited[][] = new int[m][n];
		final int Arow = m;
		final int Acol = n;
		Maze(grid,0,0, visited, Arow, Acol);
		if(tmp!=1) {
			System.out.println(-1);
		}
		

	}
	
	public static void Maze(char grid[][], int row, int col,  int [][] visited, int Arow, int Acol) {
		
		if(cnt== Arow*Acol) {
			System.exit(0);
		}
		if(row==grid.length-1 && col==grid[0].length-1) {
			visited[row][col]=1;
			tmp=1;
			for (int i=0;i<visited.length;i++){
	               for (int j=0;j<visited[0].length;j++){
	                   System.out.print(visited[i][j]+" ");
	                   cnt++;
	               }
	               System.out.println();
	           }
			return;
		}
		
		
		if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || visited[row][col]==1 || grid[row][col]=='X' ) {
			return;
		}
		
		visited[row][col]=1;
		
		Maze(grid, row, col+1, visited, Arow, Acol);
		Maze(grid, row+1, col, visited,Arow, Acol);
		//Maze(grid,row-1,col, visited);
		//Maze(grid, row, col-1, visited);
		visited[row][col]=0;
		
	}

}
