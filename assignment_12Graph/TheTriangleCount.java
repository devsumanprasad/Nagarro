/*
Martin recently read about triangles. So, John decided to test his knowledge by asking a question which goes like:
Martin is given an array of positive integers. He must answer the number of possible triangles with 3 different array elements 
as lengths of 3 sides of triangles.

Input Format
First line contains an integer N that denotes the size of the array,
The next line contains N space separated integers

Constraints
3 <= N <= 10^4
1 <= arr[i] <= 10^4

Output Format
Number of possible triangles

Sample Input
3
3 5 4
Sample Output
1
 */
package assignment_12Graph;
import java.util.*;
public class TheTriangleCount {

	static int cnt=0;
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++)
            arr[i]=sc.nextInt();
        int ans = calc(arr);
        System.out.print(ans);
    }
    public static int calc(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            int k=i+2;
            for(int j=i+1; j<n;j++){
                while(k<n && arr[i]+arr[j]>arr[k]){
                    k++;
                
                }
                if(k>j){
                     cnt=cnt+k-j-1;
                }
            }
            
        }
        return cnt;
        
    }

}
