/*
Given a string you need to print the size of the longest possible substring that has exactly k unique characters.
Note:- If there is no possible substring print -1.

Input Format
The first line of input contains an integer T denoting the no of test cases .Each test case contains two lines . 
The first line of each test case contains a string s and the next line conatains an integer k.

Constraints
1<=T<=100
1<=k<=10

Output Format
For each test case in a new line print the required output.

Sample Input
2
aaaa
1
qmb
6
Sample Output
4
-1
 */

package assignment6Recursion;
import java.util.*;
public class LongestKUniqueCharacterSubstrings {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            String str = sc.next();
            int k=sc.nextInt();
            int ans = longestKUniqCh(str, k);
            System.out.println(ans);
            System.out.println();
        }
    }

    public static int longestKUniqCh(String str, int k){
        int ans=0;
        int i=-1;
        int j=-1;
        HashMap<Character, Integer> map = new HashMap<>();
        while(true){
            boolean f1=false;
            boolean f2=false;

            while(i<str.length()-1){
                f1=true;
                i=i+1;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
                if(map.size()<k){
                    continue;
                }
                else if(map.size()==k){
                    int ln = i-j;
                    if(ln>ans){
                        ans=ln;
                    }
                }
                else{
                    break;
                }
            }
            while(j<i){
                f2=true;
                j=j+1;
                char ch = str.charAt(j);
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1);

                }
                if(map.size()>k){
                    continue;
                }
                else if(map.size()==k){
                    int ln = i-j;
                    if(ln>ans){
                        ans=ln;
                    }
                    break;
                }
                
                
            }
            if(f1==false && f2==false){    
                break;
            }
        
        }
        if(ans==0){ans=-1;}
        return ans;
        
    }

}
