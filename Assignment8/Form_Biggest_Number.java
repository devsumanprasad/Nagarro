/*
You are provided an array of numbers. You need to arrange them in a way that yields the largest value.

Input Format
First line contains integer t which is number of test case.
For each test case, you are given a single integer n in the first line which is the size of array A[] 
and next line contains n space separated integers denoting the elements of the array A .

Constraints
1<=t<=100

1<=m<=100

1<=A[i]<=10^5

Output Format
Print the largest value.

Sample Input
1
4
54 546 548 60
Sample Output
6054854654
Explanation
Upon rearranging the elements of the array , 6054854654 is the largest possible number that can be generated.
 */

package Assignment8;
import java.util.*;
public class Form_Biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0) {
			int n = sc.nextInt();
			int arr [] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			String ans = largestNumberForm(arr);
			System.out.println(ans);
			System.out.println();
		}
		

	}
	public static String largestNumberForm(int[] arr) {
		if(arr.length==0) {
			return "";
		}
		String ans="";
		String sa[] = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			sa[i] = Integer.toString(arr[i]);
		}
		Arrays.sort(sa, new Comparator<String>() {
			public int compare(String a, String b) {
				String s1 = a+b;
				String s2 = b+a;
				return s2.compareTo(s1);
			}
		});
		if(sa[0].equals("0")) {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		for(String s : sa) {
			sb.append(s);
		}
		
		return ans=sb.toString();
	} 

}
