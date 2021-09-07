/*
Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. 
Our player starts in top-left corner of the board and must reach bottom-right corner. 
In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).

Input Format
Enter the number of rows N1 and number of columns N2

Constraints
None

Output Format
Display the total number of paths and print all the possible paths in a space separated manner

Sample Input
3
3
Sample Output
VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
13
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class Mazepath_D_Count_Print {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		
		ArrayList ans = getmazepath(0, 0, N1 - 1, N2 - 1);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
        System.out.println();
        System.out.println(output(0, 0, N1 - 1, N2 - 1));

	}

	public static ArrayList<String> getmazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> bRes = new ArrayList<>();
			bRes.add("");
			return bRes;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> bRes = new ArrayList<>();
			return bRes;
		}
		ArrayList<String> myres = new ArrayList<>();

		ArrayList<String> resultv = getmazepath(cr + 1, cc, er, ec);

		for (String val : resultv) {
			myres.add("V" + val);
		}

		ArrayList<String> resulth = getmazepath(cr, cc + 1, er, ec);

		for (String val : resulth) {
			myres.add("H" + val);
		}
		
		ArrayList<String> resultd = getmazepath(cr+1, cc+1, er, ec);
		
		for(String val: resultd) {
			myres.add("D" + val); 
		}

		return myres;

	}

	public static int output(int cr, int cc, int er, int ec) {
		int count = 0;
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		count = count + output(cr + 1, cc, er, ec);
		count = count + output(cr, cc + 1, er, ec);
		count = count + output(cr+1, cc+1, er, ec);

		return count;
	}

}
