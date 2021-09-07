/*
Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.

Input Format
The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and ‘b’ as the characters.

Constraints
2 ≤ N ≤ 10^6

Output Format
A single integer denoting the maximum perfectness achievable.

Sample Input
2
abba
Sample Output
4
Explanation
We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.
 */

package Assignment8;
import java.util.*;
public class Perfect_String_with_kartikBhaiya {

	//Function to count the length of window which can be made of char ch with <= k swaps
	static int countMaxWindowSize(String s, char ch, int k)
	{
	    int i = 0; //Left pointer
	    int j = 0; //Right pointer

	    //First move the right pointer forward by k steps.
	    //If the character is already ch , do not count a swap and move freely

	    int c = 0; //Variable to count the swaps so far

	    int ans = 0; //Variable to store the final answer

	    for (; c < k && j < s.length() - 1; j++)
	    {
	        if (s.charAt(j) != ch)
	        {
	            //If s[j] is not ch then count it as a swap and move forward
	            c++;
	        }
	        if (c == k)
	        {
	            //If no of swaps has reached k, stop moving j any more forward
	            break;
	        }
	    }

	    while (i < j)
	    {

	        //Move j ahead if next element is ch as it doesn't count as a swap
	        while (j < s.length() - 1 && s.charAt(j + 1) == ch)
	        {
	            j++;
	        }

	        //Store the maximum length of all windows
	        int currentLength = j - i + 1;
	        ans = Math.max(ans, currentLength);

	        //Move left pointer by one to slide the window
	        i++;

	        //If the char at previous position of left pointer was not ch, then that position must
	        //have counted as a swap earlier. Now we have a free swap available.
	        //Iterate right pointer forward to use that one free swap
	        if (j < s.length() - 1 && s.charAt(i - 1) != ch)
	        {
	            j++;
	        }
	    }

	    return ans;
	}

	public static void main(String arg[])
	{
	    Scanner sc= new Scanner(System.in);
	    int k;
	    k=sc.nextInt();
	    String s;
	    s=sc.next();

	    if (k >= s.length())
	    {
	        //If k is larger than s.length() then we can swap all the elements to either A or B
	        //and obtain the answer equal to length of string
	       
	        //System.out.println(s.length());
	        
	    }

	    //First let us check for longest perfect string of A's then we will find the same for B's and compare
	    int ansForA = countMaxWindowSize(s, 'a', k);

	    //Now we do the same for B's
	    int ansForB = countMaxWindowSize(s, 'b', k);

	    //Final answer is max of the two answers obtained above
	    System.out.println(Math.max(ansForA, ansForB));

	    
	}

}
