/*
You are given an N*N sudoku grid (N is a multiple of 3). Solve the sudoku and print the solution.
To learn more about sudoku, go to this link Sudoku-Wikipedia.

Input Format
First line contains a single integer N. Next N lines contains N integers each, 
where jth integer int ith line denotes the value at ith row and jth column in sudoku grid. This value is 0, if the cell is empty.

Constraints
N=9 Solution exists for input matrix.

Output Format
Print N lines containing N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid, 
such that all cells are filled.
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class Sudoku {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sz = scn.nextInt();
		int[][] board = new int[sz][sz];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = scn.nextInt();
			}
		}
		solve_sudo(board, 0, 0, sz);
	}

	public static void solve_sudo(int[][] board, int row, int col, int sz) {

		if (col == board[0].length) {
			col = 0;
			row = row + 1;
		}
		if (row == board.length) {
			// print board
			print_board(board);
			return;
		}

		if (board[row][col] == 0) {
			// 9 calls
			for (int i = 1; i <= sz; i++) {
				// i should be placed ooonly when its safe!
				if (isSafe_sudoku(board, row, col, i)) {
					board[row][col] = i;
					solve_sudo(board, row, col + 1, sz);
					board[row][col] = 0;
				}
			}
		} else {
			solve_sudo(board, row, col + 1, sz);
		}
	}

	public static void print_board(int[][] board) {
		System.out.println("---------------------");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isSafe_sudoku(int[][] board, int row, int col, int ele) {
		// row shuld have unique eles
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == ele) {
				return false;
			}
		}
		// col shuld have unique eles
		for (int i = 0; i < board[0].length; i++) {
			if (board[row][i] == ele) {
				return false;
			}
		}
		//
		int box_r = row / 3;
		int box_c = col / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[box_r * 3 + i][box_c * 3 + j] == ele) {
					return false;
				}
			}
		}

		return true;
	}

}
