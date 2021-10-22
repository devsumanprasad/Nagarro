/*
Kaleen bhaiya is a big gangster in mirzapur and runs his own gang.

Guddu bhaiya wants to join Kaleen bhaiya's gang. Kaleen bhaiya has many enemies. 
So to defeat those enemies Kaleen bhaiya wants to recruit someone who is logically strong.

So if Guddu bhaiya wants to join the gang he has to pass a test.

In the test he will be given an enemy name, and he has to spoil that name by performing a special operation query.

The operation query involves moving the last letter to the place of the first letter and shifting all other letters one position ahead.

He has to perform the operation on part of the name which starts with index I and ends with index j.

He has to perform this operation query on the part k number of times.

He will be given n such operation queries.

And then he will give back the spoiled name to Kaleen bhaiya after performing all n operation queries.

You have to help Guddu bhaiya to do the task.

Input Format
First line will contain the enemy name in the form string name
Second line will contain an integer n denoting number of operation queries Guddu bhaiya has to perform.
Each of the next n lines will contain three integers i, j and k.

Constraints
Output Format
Print the spoiled name after performing all n operation queries.

Sample Input
dedfded
2
3 6 1
1 4 2
Sample Output
eddefdd
Explanation
For the name "dedfded",

After performing 1st operation query Guddu bhaiya will get "deedfdd".

After performing 2nd operation query he will get "eddefdd"
 */

package assignment_12Graph;
import java.util.*;
public class GudduBhaiyaJoinsKaleenBhaiyaGang {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int t = sc.nextInt();
        while(t>0){
            int start = sc.nextInt();
            start--;
            int end = sc.nextInt();
            end--;
            int rot = sc.nextInt()%(end-start+1);
            str = str.substring(0, start) + str.substring(end - rot + 1, end + 1) + str.substring(start, end - rot + 1)
					+ str.substring(end + 1);
            t--;
        }
        System.out.println(str);

    }

}
