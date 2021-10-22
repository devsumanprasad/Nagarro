/*
Find the kth largest element in an unsorted array.
Note:It is the kth largest element in the sorted order, not the kth distinct element.

Input Format
First line contains integer n as size of array. Second line contains the value of k. Third line contains n integers as element of array.

Constraints
1 ≤ k ≤ array's length.

Output Format
Print the kth largest element as output.

Sample Input
6
2
3 2 1 5 6 4
Sample Output
5
 */

package Assignment_10Heap_HashMap;
import java.util.*;
public class Find_kth_Largest_Number {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k =  sc.nextInt();
        int arr [] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        
        int c=0;

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<n; i++){
            if(i<k){
                q.add(arr[i]);
            }else{
                if(arr[i]>q.peek()){
                    q.remove();
                    q.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(q.size()>0){
            al.add(q.remove());
            //System.out.println(q.remove());
        }
        Collections.reverse(al);
        System.out.println(al.get(k-1));
            //q.remove();
           // System.out.println(q.remove());
    }

}
