/*
 * Given an array of M x N elements (M rows, N columns), return all elements of the array in diagonal order .

Input Format
Two integers M(row) and N(column) and Second line contains N*M space separated integers denoting the elements of Array.

Constraints
The total number of elements of the given array will not exceed 10,000.

Output Format
display Diagonal

Sample Input
3 3
1 2 3 4 5 6 7 8 9
Sample Output
1 2 4 7 5 3 6 8 9 
 */

package assignment5;
import java.util.*;
public class DiagonalTraversal {

	public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int [] [] arr = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }

        int [] ans = new int[m*n];
        ans = diagonallyTraverse(arr, m, n);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");

    }
    public static int [] diagonallyTraverse(int[][] arr, int m, int n){
        int ans[] = new int[m*n];
        int r=0, c=0;
        for(int i=0; i<ans.length;i++){
            ans[i]=arr[r][c];
            if((r+c)%2==0){
                if(c==n-1){
                    r++;
                }
                else if(r==0){
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    c++;
                }
                else if(c==0){
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }

}
