/*
Take as input N, the size of array. Take N more inputs and store that in an array. 
Take N more inputs and store that in another array. 
Write a function which gives the intersection of two arrays in an ArrayList of integers and Print the ArrayList.

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

package assignment5;
import java.util.*;
public class ArraysIntersectionOfTwoArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr1 = new int[n];
		int [] arr2 = new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=s.nextInt();
		for(int i=0;i<n;i++)
			arr2[i]=s.nextInt();
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		ans = intersect(arr1, arr2);
		System.out.println(ans);

	}
	
	public static ArrayList<Integer> intersect(int [] arr1, int [] arr2){
		int i=0,j=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> ans = new ArrayList<>();
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]==arr2[j]) {
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else
				j++;
			
		}
		
		
		return ans;
	}

}
