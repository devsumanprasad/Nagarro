/*
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Input Format
First Line Contains 2 strings of length not more than 10^5

Constraints
1<=|S|<=10^5

Output Format
A single Line a containing String

Sample Input
ADOBECODEBANC ABC
Sample Output
BANC
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class MinimumWindowSizeSubstring {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		String ans = tempFun(s1, s2);
		System.out.println(ans);

	}
	
	public static String tempFun(String s1, String s2) {
		String ans="";
		
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(int i=0; i<s2.length();i++) {
			char ch = s2.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
		}
		
		int matchCount = 0;
		int desiredMatchCount = s2.length();
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		int i=-1;
		int j=-1;
		
		while(true) {
			boolean flg1=false;
			boolean flg2=false;
			//acquire
			while(i<s1.length()-1 && matchCount<desiredMatchCount) {
				i++;
				char ch = s1.charAt(i);
				map1.put(ch, map1.getOrDefault(ch, 0)+1);
				
				if(map1.getOrDefault(ch, 0)<=map2.getOrDefault(ch, 0)) {
					matchCount++;
				}
				flg1=true;
			}
			
			//take ans and release
			while(j<i && matchCount == desiredMatchCount) {
				String pans = s1.substring(j+1, i+1);
				if(ans.length()==0 || pans.length()< ans.length()) {
					ans=pans;
				}
				
				j++;
				char ch = s1.charAt(j);
				if(map1.get(ch)==1) {
					map1.remove(ch);
				} else {
					map1.put(ch, map1.get(ch)-1);
				}
				
				if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch, 0)) {
					matchCount--;
				}
				flg2=true;
			}
			if(flg1==false && flg2==false) {
				break;
			}
		}
		
		return ans;
		
		
	}

}
