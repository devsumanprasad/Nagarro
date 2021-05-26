/* 
Take as input N, the size of array. Take N more inputs and store that in an array. 
Take as input M, the size of second array and take M more inputs and store that in second array. 
Write a function that returns the sum of two arrays. Print the value returned.

Input Format
Constraints
Length of Array should be between 1 and 1000.

Output Format
Sample Input
4
1 0 2 9
5
3 4 5 6 7
Sample Output
3, 5, 5, 9, 6, END
Explanation
Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and the first digit represents carry over , 
if any (0 here ) .

 */

package assignment5;
import java.util.*;
public class ArraysSumOfTwoArrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		
		int [] arr1 = new int[m];
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++)
			arr1[i]=scn.nextInt();
		
		int n = scn.nextInt();
		int [] arr2 = new int[n];
		
		for(int i=0; i<arr2.length;i++)
			arr2[i]=scn.nextInt();
		
		ans = sumIs(arr1, arr2, m, n);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i));
			if(i<ans.size()-1) {
				System.out.print(", ");
			}
			else if(i==ans.size()-1)
				System.out.print(", END");
		}
	}
	
	public static ArrayList<Integer> sumIs(int [] arr1, int [] arr2, int m, int n){
		ArrayList<Integer> ans = new ArrayList<>();
		m=m-1;
		n=n-1;
		int carry=0;
		
		while(m>=0 || n>=0) {
			int sum=carry;
			if(m>=0) {
				sum=sum+arr1[m];
			}
			
			if(n>=0) {
				sum = sum+arr2[n];
			}
			ans.add(0,sum%10);
			carry=sum/10;
			m--;
			n--;
		}
		
		if(carry>0)
			ans.add(0, carry);
		return ans;
	}

}
