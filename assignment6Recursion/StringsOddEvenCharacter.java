/*
Take as input S, a string. Write a function that replaces every odd character with the character having 
just higher ascii code and every even character with the character having just lower ascii code. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abcg
Sample Output
badf
 */

package assignment6Recursion;
import java.util.*;
public class StringsOddEvenCharacter {

	static String ans="";
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        replaceChar(str);
        System.out.println(ans);
    }

    public static void replaceChar(String str){
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(i==0 || i%2==0){
                ans+=(char) (c+1);
            }
            else{
                ans+=(char)(c-1);
            }
        }
        
    }

}
