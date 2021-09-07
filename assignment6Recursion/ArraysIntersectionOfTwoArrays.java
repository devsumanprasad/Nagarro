/*
 Take as input N, the size of array. Take N more inputs and store that in an array. 
 Take N more inputs and store that in another array. Write a function which gives the intersection of 
 two arrays in an ArrayList of integers and Print the ArrayList.

Input Format
First line contains N denoting the size of the two arrays. 
Second line contains N space separated integers denoting the elements of the first array. 
Third line contains N space separated integers denoting the elements of the second array.

Constraints
Length of Arrays should be between 1 to 100000.

Output Format
Display the repeating elements in a comma separated manner enclosed in square brackets. 
The numbers should be sorted in increasing order.

Sample Input
7
1 2 3 1 2 4 1
2 1 3 1 5 2 2
Sample Output
[1, 1, 2, 2, 3]
Explanation
Check which integer is present in both the arrays and add them in an array .Print this array as the ans.
 */

package assignment6Recursion;
import java.util.*;
//using ArrayList
public class ArraysIntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=0;
		n = s.nextInt();
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int temp = s.nextInt();
			ar1.add(temp);
		}
		for(int i=0; i<n; i++) {
			int temp=s.nextInt();
			ar2.add(temp);
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		ans = intersectionIs(ar1, ar2, n);
		
		//System.out.println(ar1);
		//System.out.println(ar2);
		System.out.println(ans);
		
		

	}
	public static ArrayList<Integer> intersectionIs(ArrayList<Integer> ar1, ArrayList<Integer> ar2, int n){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		Collections.sort(ar1);
		Collections.sort(ar2);
		int start=0;
		int start2=0;
		
		for(; start<n && start2<n; ) {
			if(ar1.get(start)==ar2.get(start2)) {
				ans.add(ar1.get(start));
				start++;
				start2++;
			}
			else if(ar1.get(start)<ar2.get(start2)) {
				start++;
			}
			else {
				start2++;
			}
		}
		
		return ans;
	}

}
