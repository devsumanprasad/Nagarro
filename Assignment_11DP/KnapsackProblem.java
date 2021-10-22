/*
You are packing for a vacation on the sea side and you are going to carry only one bag with capacity S (1 <= S <= 1000). You also have N (1<= N <= 1000) items that you might want to take with you to the sea side. Unfortunately you can not fit all of them in the knapsack so you will have to choose. For each item you are given its size and its value. You want to maximize the total value of all the items you are going to bring. What is this maximum total value?

Input Format
On the first line you are given N and S.
Second line contains N space separated integer where ith integer denotes the size of ith item. Third line contains N space seperated integers where ith integer denotes the value of ith item.

Constraints
1 <= S,N <= 1000

Output Format
Output a single integer showing the maximum value that can be obtained by optimally choosing the items.

Sample Input
5 4
1 2 3 2 2 
8 4 0 5 3
Sample Output
13
Explanation
Total capacity = 4.
Pick size 1 with value 8 and size 2 with value 5.
 */

package Assignment_11DP;
import java.util.*;
public class KnapsackProblem {

	public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int wt[] = new int[m];
        for(int i=0; i<m; i++){
            wt[i]=sc.nextInt();
        }
        int cost[] = new int[m];
        for(int i=0; i<m; i++){
            cost[i]=sc.nextInt();
        }
        int dp[][] = new int[n+1][m];
        System.out.println(_01Knapsack(wt, cost, n, 0, dp));

    }
    public static int _01Knapsack(int [] wt, int[] cost, int cp, int idx, int[][] dp){
        if(idx==wt.length || cp==0){
            return 0;
        }
        if(dp[cp][idx]!=0){
            return dp[cp][idx];
        }
        int sp1=0;
        if(cp>=wt[idx]){
            sp1= _01Knapsack(wt, cost, cp-wt[idx], idx+1, dp)+cost[idx];
        }
        int sp2=_01Knapsack(wt, cost,cp,idx+1, dp);
        dp[cp][idx]= Math.max(sp1, sp2);
        return Math.max(sp1, sp2);
    }

}
