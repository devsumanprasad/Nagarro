/*
Take as input N, a number. N represents the size of a chess board. The cells in board are numbered. The top-left cell is numbered 1 and numbering increases from left to right and top to bottom. E.g. The following is the chessboard for a value of n=4.

1     2    3    4

5     6    7    8

9     10   11   12

13    14   15   16
Prime numbers act as mines and ports alternately i.e. first prime number is a mine while second is a port and so on. Piece can go over a mine but cannot stop on it. Piece can directly move from a port to the destination (but may not chose to).

We’ve a piece standing in top-left corner and it must reach the bottom-right corner. The piece moves as follows –

a. In any cell, the piece moves like a knight. 
But out of the possible 8 moves for a knight, only the positive ones are valid i.e. both row and column must increase in a move.

b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves). 
But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner, 
such that row or column must increase.

c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well (in addition to the knight and possibly rook moves). 
But, only the positive moves are allowed i.e. as a bishop, piece can move in a way such that row and column must increase.

You are supposed to write the following functions

a. Write a recursive function which returns the count of different distinct ways this board can be crossed. Print the value returned.

b. Write a recursive function which prints all valid paths (void is the return type for function).

Input Format
Enter the size of the chessboard N

Constraints
None

Output Format
Display the total number of ways to cross the board and display all the possible paths in a space separated manner

Sample Input
3
Sample Output
{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-2}P{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}P{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}P{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{2-2}
14
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class Chessboard_Problem_2Count_Print {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		chessboard(0, 0, n, "{0-0}");
		System.out.println();
		System.out.println(count);
	}
	static int count = 0;
	public static void chessboard(int cr, int cc, int n, String ans) {
		if (cr == n - 1 && cc == n - 1) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (cr > n - 1 || cc > n - 1) {
			return;
		}
		if (prime1(cr, cc, n)) {
			if (n * cr + cc + 1 > 1) {
				if (prime(cr, cc, n) % 2 == 1) {
					return;
				}
				if (prime(cr, cc, n) % 2 == 0) {
					chessboard(n - 1, n - 1, n, ans + "P{" + (int) (n - 1) + "-" + (int) (n - 1) + "}");
				}
			}
		}
		chessboard(cr + 2, cc + 1, n, ans + "K{" + (int) (cr + 2) + "-" + (int) (cc + 1) + "}");
		chessboard(cr + 1, cc + 2, n, ans + "K{" + (int) (cr + 1) + "-" + (int) (cc + 2) + "}");
		if (cr == n - 1 || cc == n - 1 || cr == 0 || cc == 0) {
			for (int i = 1; i < n; i++) {
				chessboard(cr, cc + i, n, ans + "R{" + (int) (cr) + "-" + (int) (cc + i) + "}");
			}
			for (int i = 1; i < n; i++) {
				chessboard(cr + i, cc, n, ans + "R{" + (int) (cr + i) + "-" + (int) (cc) + "}");
			}
		}
		if (cr == cc || cr + cc == n - 1) {
			for (int i = 1; i < n; i++) {
				{
					chessboard(cr + i, cc + i, n, ans + "B{" + (int) (cr + i) + "-" + (int) (cc + i) + "}");
				}
			}
		}
	}
	public static boolean prime1(int cr, int cc, int y) {
		int n = (y * cr) + cc + 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int prime(int cr, int cc, int y) {
		int n = (y * cr) + cc + 1;
		int x = 0;
		int u = 0;
		if (n == 1) {
		}
		else {
			for (int i = 2; i <= n; i++)
			{
				if (i == 2) {
					u++;
				}
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						x = 0;
						break;
					} else {
						x = 1;
					}
				}
				if (x == 1) {
					u++;
				}
			}
		}
		return u;
	}

}
