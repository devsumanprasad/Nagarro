/*
Take as input N, the size of a chess board. We are asked to place N number of Knights in it, so that no knight can kill other.

a. Write a recursive function which returns the count of different distinct ways the knights can be placed across the board. Print the value returned.

b.Write a recursive function which prints all valid configurations (void is the return type for function).

Input Format
Enter the size of the chessboard N

Constraints
None

Output Format
Display the number of ways a knight can be placed and print all the possible arrangements in a space separated manner

Sample Input
2
Sample Output
{0-0} {0-1}  {0-0} {1-0}  {0-0} {1-1}  {0-1} {1-0}  {0-1} {1-1}  {1-0} {1-1} 
6
 */

package assignment7RecursionAndBacktrack;

import java.util.Scanner;

public class N_KnightsProblem {
	static int cnt=0;
	public static void Knight_comb2D_wrt_Box(boolean[][] board, int row, int col, int placed_Q, int total_Q,
			String ans) {
		if (total_Q == placed_Q) { // +ve
			System.out.print(ans+" ");
			cnt++;
			return;
		}
		if (col == board[row].length) {
			row = row + 1;
			col = 0;
		}
		if (row == board.length) { // -ve
			return;
		}
		if (isSafe_K(board, row, col)) {
			board[row][col] = true;
			Knight_comb2D_wrt_Box(board, row, col + 1, placed_Q + 1, total_Q, ans + "{" + row + "-" + col + "} "); // Select
			board[row][col] = false;

		}
		Knight_comb2D_wrt_Box(board, row, col + 1, placed_Q, total_Q, ans); // dont place just go next GG
	}

	public static boolean isSafe_K(boolean[][] board, int row, int col) {

		int[] arr1 = { -1, -2, -2, -1 };
		int[] arr2 = { 2, 1, -1, -2 };
		// on all 4 points
		for (int i = 0; i < 4; i++) {
			int rr = row + arr1[i]; // Curr Row
			int cc = col + arr2[i]; // Curr Col

			if (rr >= 0 && cc >= 0 && cc < board[0].length && board[rr][cc]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean chess[][] = new boolean[n][n];
		Knight_comb2D_wrt_Box(chess, 0, 0, 0, n, "");
		System.out.println();
		System.out.println(cnt);

	}

}
