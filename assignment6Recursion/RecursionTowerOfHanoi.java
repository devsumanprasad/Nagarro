/*
Google Tower of Hanoi.

Using a helper stick (peg), shift all rings from peg A to peg B using peg C. All rings are initally placed in ascending order, smallest being on top.

No bigger ring can be placed over a smaller ring.

a. Write a recursive function which prints the steps required to solve the tower of Hanoi problem for N discs.

b. Write a recursive function which returns number of steps required to solve the tower of Hanoi problem for N discs.

Let T1 be the Source Tower, T2 be the Destination Tower and T3 be the Auxillary Tower.

Input Format
Enter the number of discs

Constraints
None

Output Format
Display the steps required to solve the tower and also print the total number of steps required

Sample Input
2
Sample Output
Move 1th disc from T1 to T3
Move 2th disc from T1 to T2
Move 1th disc from T3 to T2
3
 */

package assignment6Recursion;
import java.util.*;
public class RecursionTowerOfHanoi {
	static int cnt=0;
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
		// TODO Auto-generated method stub
        int n = sn.nextInt();
        String T1="T1";
        String T2 = "T2";
        String T3 = "T3";
		TOH(n,T1,T2,T3);
		System.out.println(cnt);

	}
	
	public static void TOH(int n, String s, String d, String h) {
		
		if(n==0)
			return;
		TOH(n-1, s, h, d);
		System.out.println("Move "+n+"th disc from "+s+" to "+d);
		cnt=cnt+1;
		TOH(n-1, h,d,s);
	}

}
