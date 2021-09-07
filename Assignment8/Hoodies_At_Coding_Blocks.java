/*
It's winter season. There is a long queue of students from the four prime courses at Coding Blocks and everyone is here to grab his hoodie. 
Each student of a course has a different roll number. Whenever a new student will come, he will search for his friend from the end of the queue. 
Note that a student can only has friend from his course and not from any other course. As soon as he will find any of the friend in the queue, 
he will stand behind him, otherwise he will stand at the end of the queue. At any moment Kartik Bhaiya will ask the student, 
who is standing in front of the queue, to come and put his name and grab his hoodie and then remove that student from the queue. 
There are Q operations of one of the following types:

E x y : A new student of course x whose roll number is y will stand in queue according to the method mentioned above.
D : Kartik Bhaiya will ask the student, who is standing in front of the queue, to come and put his name for the hoodie and remove him from the queue.
Find out the order in which student put their name.

Note: Number of dequeue operations will never be greater than enqueue operations at any point of time.

Input Format
First line contains an integer Q, denoting the number of operations. Next Q lines will contains one of the 2 types of operations.

Constraints
1 ≤ x ≤ 4 1 ≤ y ≤ 50000 1 ≤ Q ≤ 100000

Output Format
For each 2nd type of operation, print two space separated integers, the front student's course and roll number.

Sample Input
5
E 1 1
E 2 1
E 1 2
D
D
Sample Output
1 1
1 2
 */
package Assignment8;
import java.util.*;
public class Hoodies_At_Coding_Blocks {

	protected int size;

	protected int front;
	protected int[] data;

	public Hoodies_At_Coding_Blocks() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Hoodies_At_Coding_Blocks(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static void hoodies(int q) throws Exception{ 
	
	// Write your Code here
	Hoodies_At_Coding_Blocks crs1 = new Hoodies_At_Coding_Blocks();  //crs means course
	Hoodies_At_Coding_Blocks crs2 = new Hoodies_At_Coding_Blocks();
	Hoodies_At_Coding_Blocks crs3 = new Hoodies_At_Coding_Blocks();
	Hoodies_At_Coding_Blocks crs4 = new Hoodies_At_Coding_Blocks();

	Hoodies_At_Coding_Blocks ord = new Hoodies_At_Coding_Blocks();  //ord represents sequence or order

	int [] arr = new int[4];

	for(int i = 0; i<q; i++) {
	        char ch = scn.next().charAt(0);
	        if(ch == 'E') {
	            int x = scn.nextInt();
	            int y = scn.nextInt();
	            if(x == 1) {
	                crs1.enqueue(y);
	            } else if(x == 2) {
	                crs2.enqueue(y);
	            } else if(x == 3) {
	                crs3.enqueue(y);
	            } else if(x == 4) {
	                crs4.enqueue(y);
	            }
	            
	            if(arr[x-1] == 0) {
 	            	ord.enqueue(x);
 	            }
 	            
	            arr[x-1]++;
	        } else if(ch == 'D') {
	            int ordNum = ord.getFront();
	            if(arr[ordNum - 1] != 0){
	                if(ordNum == 1){
	                    System.out.println(ordNum + " " + crs1.dequeue());
	                } else if(ordNum == 2){
	                    System.out.println(ordNum + " " + crs2.dequeue());
	                } else if(ordNum == 3){
	                    System.out.println(ordNum + " " + crs3.dequeue());
	                } else if(ordNum == 4){
	                    System.out.println(ordNum + " " + crs4.dequeue());
	                }
	                arr[ordNum - 1]--;
	            }
	            
	            if(arr[ordNum - 1] == 0){
	                ord.dequeue();
	            }
	        }
	    }
	
} 


	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

        int n = scn.nextInt();
        
        hoodies(n);
	}

}
