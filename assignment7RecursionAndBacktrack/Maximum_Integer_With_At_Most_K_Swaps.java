/*
Given a positive integer, find maximum integer possible by doing at-most K swap operations on its digits.

Input Format
Two positive integers N and K where N denotes the number on which swaps are supposed to be performed and K denotes the maximum swaps available.

Constraints
0 <= N <= 10^12 0 <= K <= 10

Output Format
Single Maximum integer possible by doing at-most K swap operations on digits of N

Sample Input
254 1
Sample Output
524
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class Maximum_Integer_With_At_Most_K_Swaps {

	static String max = "";
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		String str = in.next();
		int k = in.nextInt();
		max = str;
		findMaximumNum(str.toCharArray(), k);
		System.out.println(max);
	}
	public static void findMaximumNum(char ar[], int k)
	{
		if (k == 0)
			return;
		int n = ar.length;
		for (int i = 0; i < n - 1; i++) 
        {
			for (int j = i + 1; j < n; j++) 
            {
				if (ar[j] > ar[i]) 
                {
					char temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
					String st = new String(ar);
					if (max.compareTo(st) < 0)
						max = st;
					findMaximumNum(ar, k - 1);
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
        }
	}

}
