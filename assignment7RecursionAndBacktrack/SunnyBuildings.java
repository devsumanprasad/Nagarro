/*
The heights of certain Buildings which lie adjacent to each other are given. 
Light starts falling from left side of the buildings. If there is a building of certain Height, 
all the buildings to the right side of it having lesser heights cannot see the sun . 
The task is to find the total number of such buildings that receive light.

Input Format
First line contains the Number of Testcases T.
Next line contains the totalnumber of buildings
Next line contains the height of n buildings.

Constraints
1<=T<=100 1<=N<=100 1<=Hi<=100

Output Format
Print total Number of buildings that receive Light.

Sample Input
1
5
7 4 8 2 9
Sample Output
3
Explanation
7 is the first element, it can see the sunset.
4 can't see the sunset as 7 is hiding it.
8 can see.
2 can't see the sunset.
9 also can see the sunset.
 */

package assignment7RecursionAndBacktrack;
import java.util.*;
public class SunnyBuildings {

	public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t; i++)
        {
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int j = 0; j < n; j++)
                arr[j] = in.nextInt();
            System.out.println(count(arr));
        }
    }
    public static int count(int arr[])
    {
        int num = arr[0], count = 1;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] >= num)
            {
                num = arr[i];
                count++;
            }
        }
        return count;
    }

}
