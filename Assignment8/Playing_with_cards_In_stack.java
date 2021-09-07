/*
You are at a casino. There are N stacked cards on pile . Each card has a number written on it. Then there will be Q iterations. In ith iteration, you start picking up the cards in Ai-1th pile from the top one by one and check whether the number written on the card is divisible by the ith prime number. If the number is divisible, you stack that card on pile Bi. Otherwise, you stack that card on pile Ai. After Q iterations, cards can only be on pile B1, B2, B3, . . . BQ, AQ . Output numbers on these cards from top to bottom of each piles in order of B1, B2, B3, . . . BQ, AQ .

Input Format
First line contains N and Q. The next line contains N space separated integers representing the initial pile of cards i.e., A0. The leftmost value represents the bottom plate of the pile.

Constraints
N < 10^5
Q < 10^5
|Ai| < 10^9

Output Format
Output N lines, each line containing the number written on the card.

Sample Input
5 1
3 4 7 6 5
Sample Output
4
6
3
7
5
Explanation
Initially:

A0 = [3, 4, 7, 6, 5]<-TOP

After 1st iteration:

A0 = []<-TOP

A1 = [5, 7, 3]<-TOP

B1 = [6, 4]<-TOP

Now first print B1 from top to bottom then A1 from top to bottom.
-----------------------------
Hint:
N is the no. of cards in A(0)th stack.
Q is the no. of iterations you have to perform.
The third input is N numbers, representing the number of cards present in A(0)th stack.

Consider the following input:
INPUT:
N=5
Q=2
A(0)th stack : 1 2 3 4 5

Processing:
iterate for i =1 to Q;

for i=1(frst iteration):

Pop top element of A(i-1)th (A(0)th) stack i.e. 5
Check, ((top_element i.e. 5)%(ith prime number i.e. 1st prime number, 2)) == 0 ? Push top_element to B(i) i.e. B(1)th stack : Push top_element to A(i)i.e.A(1)th stack;
After repeating the same for all elements of stack A(0):
A(0)=[] i.e. empty as all elements have been popped.
A(1)=[5,3,1] as they are not divisible by 2.
B(1)=[4,2] as they are divisible by 2.

for i=2=Q (second and last iteration):

Pop top element of A(i-1)th (A(1)th) stack i.e. 1
Check, ((top_element i.e. 1)%(ith prime number i.e. 2nd prime number, 3)) == 0 ? Push top_element to B(i) i.e. B(2)th stack : Push top_element to A(i)i.e.A(2)th stack;
After repeating the same for all elements of stack A(1):
A(1)=[] i.e. empty as all elements have been popped.
A(2)=[1,5] as they are not divisible by 3.
B(2)=[3] as they are divisible by 3.

Output:
print elements of B(1),B(2),A(2)

2
4
3
5
1

Note: top element of the stack is popped first.
 */

package Assignment8;
import java.util.*;
public class Playing_with_cards_In_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++) {
			int tmp = sc.nextInt();
			st.push(tmp);
		}
		
		playWithCards(st, n, q);
		//System.out.println(getPrime(8));

	}
	
	public static int getPrime(int num) {
		boolean flg = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flg=false;
				break;
			}
		}
		int ans = 0;
		if(flg==true)
			return num;
		if(flg==false)
			ans = getPrime(num+1);
		return ans;
	}
	
	public static void playWithCards(Stack<Integer> st, int n, int q) {
		int prime=2;
		Queue<Integer> qLL = new LinkedList<>();
		Stack<Integer> stA = new Stack<>();
		Stack<Integer> stB = new Stack<>();
		for(int i=1;i<=q;i++) {
			while(st.size()>0) {
				int tp = st.pop();
				if(tp % prime == 0) {
					
					stB.push(tp);
				}
				else {
					stA.push(tp);
				}
				
			}
			prime = getPrime(prime+1);
			
			while (!stB.empty())
	        {
	            int x = stB.pop();
	            qLL.add(x);
	            
	            
	        }
			//swap st and stA -----------
			Stack<Integer> tmp = new Stack<>();
			
			tmp = st;
			st = stA;
			stA=tmp;
			
			//----------------------
			
		}
		while (qLL.size()>0)
	    {
	        //System.out.println(qLL.size());
	        System.out.println(qLL.poll());
	        
	    }
		 
		while (st.size()>0)
	    {
			int cnt = st.pop();
	        
	        System.out.println(cnt);
	        
	        
	    }
	
	}
	

}
