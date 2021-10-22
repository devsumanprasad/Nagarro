/*
You are provided three strings having length less than 100. Your task is to find the longest common sub-sequence in all three given sequences.

Input Format
First line contains integer t which is number of test case. For each test case, it contains three space separated strings.

Constraints
1<=t<=50

Output Format
Print the longest common subsequence.

Sample Input
1
abcd1e2 bc12ea bd1ea
Sample Output
3
Explanation
Longest common subsequence is ble
 */

package Assignment_11DP;
import java.util.*;
public class Longest_Common_Subsequence {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            String s1=sc.next();
            String s2=sc.next();
            String s3=sc.next();

            int x = s1.length();
            x-=1;
            int y = s2.length();
            y-=1;
            int z = s3.length();
            z-=1;
            int [][][] dp = new int[101][101][101];
            for (int i = 0; i < 100; i++){
                for (int j = 0; j < 100; j++){
                    for (int k = 0; k < 100; k++){
                        dp[i][j][k] = -1;
                    }
                }
            }
            int ans = lcsDP_3_String(s1, s2, s3, x, y, z, dp);
            System.out.println(ans);
        }
        
        
    }

    static int lcsDP_3_String(String s1, String s2, String s3, int i, int j, int k, int [][][] dp){
        if(i==-1 || j==-1 || k==-1){
            return 0;
        }
        if(dp[i][j][k] != -1){
            return dp[i][j][k];
        }
        if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j)==s3.charAt(k)){
            return dp[i][j][k]=1+lcsDP_3_String(s1, s2, s3, i-1, j-1, k-1, dp);
        }
        else{
            return dp[i][j][k] = Math.max(Math.max(lcsDP_3_String(s1, s2, s3, i-1, j, k, dp), lcsDP_3_String(s1, s2, s3, i, j-1, k, dp)), lcsDP_3_String(s1, s2, s3, i, j, k-1, dp));
        }
    }

}
