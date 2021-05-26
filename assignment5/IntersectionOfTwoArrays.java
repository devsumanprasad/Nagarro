/*
 *Given two integer arrays of length n and m.You have to write a function which returns 
 *the list of distinct numbers which are present in both the arrays.

Input Format
First line of input contains n denoting the size of the first array. 
Second line of input contains m denoting the size of the second array. Third line contains n space separated integers elements 
of the first array. fourth line contains m space separated integers elements of the second array.

Constraints
1<=arr1.length<=10^5
2<=arr2.length<=10^5

Output Format
Return intersection of both the array

Sample Input
4
5
1 2 3 4
2 4 5 6 1
Sample Output
2 4 1
Explanation
2 , 4 , 1 these elements are present in both the arrays.
 */
package assignment5;

import java.util.*;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int [] arr1 = new int[n];
		int [] arr2 = new int[m];
		for(int i=0;i<n;i++)
			arr1[i]=s.nextInt();
		for(int i=0;i<m;i++)
			arr2[i]=s.nextInt();
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		ans = intersect(arr1, arr2);
		for(int c=0;c<ans.size();c++){
            System.out.print(ans.get(c)+" ");
        }

	}
	
	public static ArrayList<Integer> intersect(int [] arr1, int [] arr2){
		int i=0,j=0;
		int [] temp = new int[arr2.length];
		for(int c=0;c<arr2.length;c++)
			temp[c]=arr2[c];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> ans = new ArrayList<>();
		ArrayList<Integer> ans2 = new ArrayList<>();
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
		
		for(int c=0;c<temp.length;c++) {
			for(int d=0;d<ans.size();d++) {
				if(temp[c]==ans.get(d)) {
					ans2.add(temp[c]);
					ans.remove(d);
					break;
				}
			}
		}
		
		
		return ans2;
	}

}
