/*
Take as input N, a number. N represents the size of a chess board. We’ve a piece standing in top-left corner and it must reach the bottom-right corner. The piece moves as follows –

a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, only the positive ones are valid 
i.e. both row and column must increase in a move.

b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves). But, only the positive moves are allowed 
i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner, such that row or column must increase.

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
Display the total number of valid paths and print all the valid paths in a space separated manner

Sample Input
3
Sample Output
{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
18
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class Chessboard_Problem_Count_Print {

	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = chess_board(0,0,n,n);
        chess_board(0,0,n,n,"");
        System.out.println();
        System.out.println(ans);
    }
    public static void chess_board(int cr, int cc, int er, int ec, String ans) {

		// Positive Base Case

		if (cr == er - 1 && cc == ec - 1) {

			System.out.print(ans + "{" + cr + "-" + cc + "} ");

			return;

		}

		// Negative Base case

		if (cr >= er || cc >= ec) {

			return;

		}

		// Knight

		chess_board(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");

		chess_board(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		// Rook

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

			for (int moves = 1; moves < ec; moves++)

				chess_board(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");

			for (int moves = 1; moves < er; moves++)

				chess_board(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");

		}

		if (cr == cc || cr + cc == er - 1) {

			for (int moves = 1; moves < er; moves++) {

				chess_board(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");

			}

		}

	}

	public static int chess_board(int cr, int cc, int er, int ec) {

		// Positive Base Case

		if (cr == er - 1 && cc == ec - 1) {

			return 1;

		}

		// Negative Base case

		if (cr >= er || cc >= ec) {

			return 0;

		}

		int cnt = 0;

		// Knight

		cnt += chess_board(cr + 2, cc + 1, er, ec);

		cnt += chess_board(cr + 1, cc + 2, er, ec);

		// Rook

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

			for (int moves = 1; moves < ec; moves++)

				cnt += chess_board(cr, cc + moves, er, ec);

			for (int moves = 1; moves < er; moves++)

				cnt += chess_board(cr + moves, cc, er, ec);

		}
		if (cr == cc || (cr + cc == er - 1)) {

			for (int moves = 1; moves < er; moves++) {

				cnt += chess_board(cr + moves, cc + moves, er, ec);

			}

		}

		return cnt;

	}

}
