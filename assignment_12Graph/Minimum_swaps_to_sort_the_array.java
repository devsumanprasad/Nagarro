/*
 Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.

Input Format
N
N elements

Constraints
N<=10^7

Output Format
Minimum steps

Sample Input
4
2 8 5 4
Sample Output
1
Explanation
swap 8 with 4.
 */

package assignment_12Graph;
import java.util.*;
public class Minimum_swaps_to_sort_the_array {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(arr[i], i);
             
        Arrays.sort(arr);  
         
        boolean[] isVisited = new boolean[n];
        Arrays.fill(isVisited, false);
         
        int ans = 0;
        for(int i=0;i<n;i++) {
           
            if(isVisited[i] || map.get(arr[i]) == i)
                continue;
                 
            int j = i, size = 0;
            while(!isVisited[j]) {
                isVisited[j] = true;
                 
                j = map.get(arr[j]);
                size++;
            }
             
            if(size > 0) {
                ans = ans+(size - 1);
            }
        }
        System.out.println(ans);

    }

}
