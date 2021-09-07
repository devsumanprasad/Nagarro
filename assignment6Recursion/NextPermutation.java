/*
Given an array Arr[], Treat each element of the array as the digit and whole array as the number. 
Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

Note: The replacement must be in-place, do not allocate extra memory.

Input Format
The First Line contains the Number of test cases T.
Next Line contains an Integer N, number of digits of the number.
Next Line contains N-space separated integers which are elements of the array 'Arr'.

Constraints
1 <= T <= 100
1 <= N <= 1000
0 <= Ai <= 9

Output Format
Print the Next Permutation for each number separated by a new Line.

Sample Input
2
3
1 2 3 
3
3 2 1

Sample Output
1 3 2
1 2 3

Explanation
Possible permutations for {1,2,3} are {1,2,3} , {1,3,2} , {2,1,3} , {2,3,1}, {3,1,2} and {3,2,1}. {1,3,2} is 
the immediate next permutation after {1,2,3}.
For the second testcase , {3,2,1} is the last configuration so we print the first permutation as its next permutation.
 */

package assignment6Recursion;
import java.util.*;
public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0) {
			
			int n=sc.nextInt();
			int[] ar = new int[n];
			for(int i=0; i<n;i++)
				ar[i]=sc.nextInt();
			nextPermutation(ar);
			for(int i=0;i<n;i++)
				System.out.print(ar[i]+" ");
			System.out.println();
		}
		

	}
	
	public static void nextPermutation(int[] ar) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<ar.length;i++)
            nums.add(ar[i]);
        int idx=-1;
        int n = nums.size();
        for(int i=n-1;i>0;i--){
            if(nums.get(i)>nums.get(i-1)){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            
            Collections.reverse(nums);
            for(int i=0;i<n;i++)
                ar[i]=nums.get(i);
        }
        else{
            int prev = idx;
            for(int i=idx+1;i<n;i++){
                if((nums.get(i) > nums.get(idx-1)) && (nums.get(i)<=nums.get(prev))){
                    prev=i;
                }
            }
            Collections.swap(nums, idx-1, prev);
            Collections.reverse( nums.subList(idx , n )) ;
            for(int i=0;i<n;i++)
                ar[i]=nums.get(i);
        }
    }

}
