/*
Jon Snow has to fight the army of the dead lead by the Night King. His army has y soldiers while the army of the dead consists of x soldiers. It is given that x>y.
He goes to Melisandre, the Red Lady to get some magic to win the war. 
Melisandre says John can choose any prime number p and subtract it any number of times from x. 
If he is able to make x=y by the process explained, he will win the war.
John Snow obviously wants to win the war but is a little weak in Maths. Can you help him out to defeat the army of the dead.

Input Format
The first line of input contains t, number of test cases. Then t lines follow, each describing a test case. 
Each line contains two integers x and y (1 ≤ y < x ≤ 10^18).

Constraints
Output Format
For each test case, print YES if John will win the war, print NO if he will loose in a separate line.

Sample Input
4
100 98
42 32
100 1
41 40
Sample Output
YES
YES
YES
NO
 */

package assignment_12Graph;
import java.util.*;
public class Jon_Snow_and_theRed_Lady {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
			while(t--!=0){
				long x = sc.nextLong();
				long y = sc.nextLong();

				if(x-y != 1 && x>y){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		

    }

}
