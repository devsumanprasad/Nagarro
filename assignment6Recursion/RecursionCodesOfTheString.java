/*
Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, …. z=26. 
Write a recursive function (return type Arraylist) to print all possible codes for the string. 
E.g. for “1123” possible codes are aabc, kbc, alc, aaw, kw.

Input Format
Enter a number

Constraints
None

Output Format
Display all the possible codes

Sample Input
1125
Sample Output
[aabe, aay, ale, kbe, ky]
 */

package assignment6Recursion;
import java.util.*;
public class RecursionCodesOfTheString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		ArrayList<String> ans = new ArrayList<>();
		ans = calc(str);
		//for(int i=0; i<ans.size();i++)
			System.out.println(ans);
	}
	
	public static char switchChar(int n) {
		 return (char) (n+96);
		
	}
	
	public static ArrayList<String> calc(String str){
		
		//base case
		if(str.length()==0) {
			ArrayList<String> ans = new ArrayList<String>();
			ans.add("");
			return ans;
		}
		
		ArrayList<String> op1 = new ArrayList<>();
		op1 = (calc(str.substring(1)));
		ArrayList<String> op2 = new ArrayList<>();
		int fd = (str.charAt(0)-'0');
		int ftwod = 0;
		if(str.length()>=2) {
			ftwod = (str.charAt(0)-'0')*10+(str.charAt(1)-'0');
			if(ftwod>=10 && ftwod <=26) {
				op2 = calc(str.substring(2));
			}
		}
		
		ArrayList<String> opp = new ArrayList<>();
		
		int temp=0;
		for(int i=0;i<op1.size();i++) {
			char ch = switchChar(fd);
			opp.add(i, ch+(op1.get(i)));
			temp=temp+1;
		}
	
		for(int i=0;i<op2.size();i++) {
			char ch = switchChar(ftwod);
			opp.add(temp, ch+(op2.get(i)));
			temp=temp+1;
		}
		
		return opp;
		
	}
}
