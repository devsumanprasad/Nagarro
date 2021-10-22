/*
 Reaching to the top of a staircase, it takes n steps.
The task can be accomplished either by climbing 1 step or 2 steps at a time.
In how many different ways can you climb to the top.
Note: n will be a positive integer.

Input Format
First line contains an integer n.

Constraints
None

Output Format
Print the total number of distinct ways you can climb to top.

Sample Input
2
Sample Output
2
Explanation
None
 */

package Assignment_11DP;
import java.util.*;
public class Climbing_Stairs {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp=n;
        int [] dp = new int[tmp+1];
        n=n+1;
        int dpAns = recDP(0, tmp, dp); //DP Approach called
        System.out.println(stair(n)); //recursive approach called
        System.out.println(dpAns);
    }
    public static int stair(int n)
    {
        if (n <= 1)
            return n;
        return stair(n - 1) + stair(n - 2);
    }
    
    //DP Approch
    public static int recDP(int curr, int n, int dp[]){
        if(curr==n){
            return 1;
        }
        if(curr>n){
            return 0;
        }
        if(dp[curr] !=0){
            return dp[curr];
        }
        
        int sp1 = recDP(curr+1, n, dp);
        int sp2 = recDP(curr+2, n, dp);
        dp[curr]=sp1+sp2;
        return sp1+sp2;
    }

}
