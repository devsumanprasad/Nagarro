/*
Given a string ‘str’ of digits, find the length of the longest substring of ‘str’, 
such that the length of the substring is 2k digits and sum of left k digits is equal to the sum of right k digits.

Input Format
The first line of input contains an integer T denoting the number of test cases Each test case contains a string 
string of length N.

Constraints
Output Format
Print length of the longest substring of length 2k such that sum of left k elements is equal to right k elements 
and if there is no such substring print 0.

Sample Input
1
1538023
Sample Output
4
 */

package assignment6Recursion;
import java.util.*;
public class LongestEvenLengthSubstring {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            String str = sc.next();
            int ans = findEvenLength(str);
            System.out.println(ans);
            System.out.println();
        }
        
    }

    public static int findEvenLength(String str){
        int n=str.length();
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j=2+j){
                int len = j+1-i;
                int lsum=0;
                int rsum=0;
                for(int k=0;k<=(len/2)-1;k++){
                    lsum=lsum+(str.charAt(k+i)-'0');
                    rsum=rsum+(str.charAt(k+(len/2)+i)-'0');
                }

                if(lsum==rsum){
                    if(max<len){
                        max=len;
                    }
                }
            }
            
        }
        return max;

    }

}
