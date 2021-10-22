/*
Given n friends, each one can remain single or can be paired up with some other friend. 
Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

Input Format
First line contains an integer t denoting the number of test cases. Next t lines contain an integer n each.

Constraints
1<= n < 30

Output Format
Output t lines each line describing the answer.

Sample Input
1
3
Sample Output
4
Explanation
{1}, {2}, {3} : all single {1}, {2,3} : 2 and 3 paired but 1 is single. 
{1,2}, {3} : 1 and 2 are paired but 3 is single. {1,3}, {2} : 1 and 3 are paired but 2 is single. Note that {1,2} and {2,1} are considered same.
 */
package assignment_12Graph;
import java.util.*;
public class Friends_Pairing_Problem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n=sc.nextInt();
			long ans = frinds(n);
			System.out.println(ans);
		}

    }

	static long frinds(int n){
		if(n<=2){
			return n;
		}

		long sp1 = frinds(n-1);
		long sp2 = (n-1)*frinds(n-2);

		return sp1+sp2;
	}
}
