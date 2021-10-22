/*
In this problem, you are given a set of items, each with a weight and a value, 
and we need to determine the number of each item to include in a collection so that the total weight is less than or 
equal to a given limit and the total value is as large as possible. NOTE: The items are indivisible, we can either take an item or not.

Input Format
Input an integer n representing number of items. An array representing value of ith item. An array representing weight of ith item. 
An integer W which is the total weight.

Constraints
1<=n<=1000
1<=weight[i]<=100
1<=value[i]<=100
1<=W<=1000

Output Format
An integer representing total value grabbed.

Sample Input
6
20 5 10 40 15 25
1 2 3 8 7 4
10
Sample Output
60
Explanation
value = 20 + 40 = 60 weight = 1 + 8 = 9 < W
 */

package assignment_12Graph;
import java.util.*;
public class Zero_One_Knapsack_Problem {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val[] = new int[n];
        for(int i=0; i<n;i++){
            val[i]=sc.nextInt();
        }
        int wt[] = new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        int w=sc.nextInt();
        int dp[][]=new int[n+1][w+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<w+1;j++){
                dp[i][j]=-1;
            }

        }

        int ans = calc(n,val,wt,w, dp);
        System.out.println(ans);

    }
    public static int calc(int n, int[] val, int[] wt, int w, int[][] dp){
        if(w==0 || n==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]>w){
            return dp[n][w]=calc(n-1, val, wt, w, dp);
        }
        else{
            int tmp = Math.max(val[n-1]+calc(n-1, val, wt, w-wt[n-1],dp), calc(n-1, val, wt,w,dp));
            dp[n][w]=tmp;
            return tmp;
        }
    }

}
