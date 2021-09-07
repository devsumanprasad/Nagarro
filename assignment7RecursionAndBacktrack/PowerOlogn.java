/*
Take as input x and n, two numbers. Write a function to calculate x raise to power n. Target complexity is O(logn). 
NOTE: Try both recursive and bitmasking approach.

Input Format
Enter the number N and its power P

Constraints
None

Output Format
Display N^P

Sample Input
2
3
Sample Output
8
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class PowerOlogn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int ans = powerLogn(N, P);
		System.out.println(ans);
	}
	
	static int powerLogn(int x, int y){
        int temp;
        if( y == 0)
            return 1;
        temp = powerLogn(x, y/2);
         
        if (y%2 == 0)
            return temp*temp;
        else
        {
            if(y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

}
