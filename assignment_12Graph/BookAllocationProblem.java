/*
You are given number of pages in n different books and m students. 
The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. 
The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

Input Format
First line contains integer t as number of test cases. Next t lines contains two lines. 
For each test case, 1st line contains two integers n and m which represents the number of books and students 
and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.

Constraints
1 < t < 50
1< n < 100
1< m <= 50
1 <= Ai <= 1000

Output Format
Print the maximum number of pages that can be assigned to students.

Sample Input
1
4 2
12 34 67 90
Sample Output
113 
Explanation
1st students : 12 , 34, 67 (total = 113)
2nd students : 90 (total = 90)
Print max(113, 90)
 */

package assignment_12Graph;
import java.util.*;
public class BookAllocationProblem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int arr[] = new int[n];

			for(int i=0; i<n;i++){
				arr[i]=sc.nextInt();
			}
			int ans = bs(arr, n, s);
			System.out.println(ans);
		}
		

    }
	
	static int bs(int arr[], int n, int s){
		int all_books = 0;
		int start = 0, end=0;
		for(int i=0; i<n; i++){
			all_books += arr[i];
			start=Math.max(start, arr[i]);
		}
		end=all_books;
		int fAns = start;
		while(start<=end){
			int mid = (start+end)/2;
			if(isValid(arr, n,s,mid)){
				fAns=mid;
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return fAns;

	}
	static boolean isValid(int arr[], int n, int s, int mid){
		int students = 1;
		int curr=0;
		for(int i=0; i<n; i++){
			if(curr+arr[i]>mid){
				curr=arr[i];
				students++;
				if(students>s){
					return false;
				}
			}
			else{
				curr+=arr[i];
			}

		}
		return true;
	}

}
