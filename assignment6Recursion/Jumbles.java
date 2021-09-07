/*
Aisha and Ayush were playing word games. They both wrote two words randomly. 
Now you have to check if one word can be formed by jumbling the letters of another word. 
If possible, then print "True", otherwise print "False".

Input Format
First line contains word written by Aisha and second line contains word written by Ayush.

Constraints
You may assume the string contains only lowercase alphabets.

Output Format
Print True, if possible, else print False.

Sample Input
hello
holle
Sample Output
True
Explanation
Second string "holle` can be arranged to form "holle".
 */

package assignment6Recursion;
import java.util.*;
public class Jumbles {
	
	static String b="False";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=1;
		String s1=sc.next();
		String s2= sc.next();
		
		String ans = jumble(s1,s2);
		System.out.println(ans);

	}
	
	static String jumble(String s1,String s2) {
		char[] c1= s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String a1 = new String(c1);
		String a2 = new String(c2);
		//System.out.println(a1);
		//System.out.println(a2);
		
		if(a1.equals(a2))
			b="True";
		
		
		return b;
	}

}
