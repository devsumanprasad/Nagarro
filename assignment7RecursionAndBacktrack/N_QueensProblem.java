/*
Take as input N, the size of a chess board. We are asked to place N number of queens in it, so that no queen can kill other.

a. Write a recursive function which returns the count of different distinct ways the queens can be placed across the board. Print the value returned.

b. Write a recursive function which prints all valid configurations (void is the return type for function).

Input Format
Enter the number N(Size of the chessboard)

Constraints
None

Output Format
Display the number of possible ways of arranging N queens and print all the possible arrangements in a space separated manner

Sample Input
4
Sample Output
{1-2} {2-4} {3-1} {4-3}  {1-3} {2-1} {3-4} {4-2}
2
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class N_QueensProblem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
        output(new boolean[n][n], 0, "");
        System.out.println();
        System.out.println(Nqueens(new boolean[n][n], 0, ""));
        
	}
	public static int Nqueens(boolean[][] board, int row, String ans) {
	int count=0;
	if(row==board.length) {
		
		return 1;
	}
	for(int col=0; col<board[0].length; col++) {
		if(isItSafe(board, row, col)) {
		board[row][col]=true;
		
		count+=Nqueens(board, row+1, ans+ "{"+row+"-"+col+"} ");
		}
	
		board[row][col]=false;
	}
	return count;
	}
		public static void output(boolean[][] board, int row, String ans) {
		if(row==board.length) {
			System.out.print(ans+" ");
			return ;
		}
		for(int col=0; col<board[0].length; col++) {
			if(isItSafe(board, row, col)) {
			board[row][col]=true;
			output(board, row+1, ans+ "{"+(row+1)+"-"+(col+1)+"} ");
			}
		
			board[row][col]=false;
		}
	}
	public static boolean isItSafe(boolean[][] board, int row, int col) {
		int r=row-1;
		int c=col;
		while(r>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
		}
		r=row-1;
		c=col-1;
		while(r>=0 && c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		r=row-1;
		c=col+1;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}
