/*
 * Procedure to find GCD or HCF of two numbers,
1) Take two numbers
2) Find the largest & smallest number among them
3) Subtract the smallest number value from the largest number
4) Repeat this process until both numbers become equal

Given N positive numbers, your task is to calculate their HCF.

Input Format
First line of input contains a single integer N, 
second line contains N space separated positive integers whose HCF is to be computed.

Constraints
N <= 10 and all the numbers lie between 1 and 100.

Output Format
Print HCF of N numbers.

Sample Input
3
2 4 6
Sample Output
2
 */

package assignment5;

import java.util.*;

public class SimpleHCF {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int gcd = arr[0];
		for(int i=0;i<n;i++)
			gcd = methodGCD(gcd, arr[i]);
		System.out.println(gcd);
		

	}
	
	public static int methodGCD(int gcd, int arr) {
		
		while(gcd!=arr) {
			if(gcd>arr) {
				gcd = gcd-arr;
			}
			else {
				arr = arr-gcd;
			}
		}
		return gcd;
	}

}
