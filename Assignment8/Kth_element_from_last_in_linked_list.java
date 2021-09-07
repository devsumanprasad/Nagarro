/*
Given a linked list with n nodes. Find the kth element from last without computing the length of the linked list.

Input Format
First line contains space separated integers representing the node values of the linked list. The list ends when the input comes as '-1'. 
The next line contains a single integer k.

Constraints
n < 10^5

Output Format
Output a single line containing the node value at the kth element from last.

Sample Input
1 2 3 4 5 6 -1
3
Sample Output
4
Explanation
The linked list is 1 2 3 4 5 6. -1 is not included in the list. So the third element from the last is 4
 */

package Assignment8;
import java.util.*;
public class Kth_element_from_last_in_linked_list {
	private class Node {
		int data;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// private Node tamp = head;

	public int getfirst() throws Exception {
		if (size == 0) {
			throw new Exception(" LL is empty");

		}

		return this.head.data;
	}

	public int getlast() throws Exception {
		if (size == 0) {
			throw new Exception(" LL is empty");

		}

		return this.tail.data;
	}

	public int getat(int k) throws Exception {
		if (size == 0) {
			throw new Exception(" LL is empty");

		}
		if (k < 0 || k >= size) {
			throw new Exception(" Invailed index");

		}

		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public void addLast(int item) {
		Node nn = new Node();

		nn.data = item;
		nn.next = null;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void addfirst(int item) {
		Node nn = new Node();

		nn.data = item;
		nn.next = null;
		if (this.size == 0) {
			nn.next = this.head;
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}

	private Node getnode(int k) throws Exception {
		if (size == 0) {
			throw new Exception(" LL is empty");

		}
		if (k < 0 || k >= size) {
			throw new Exception(" Invailed index");

		}

		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void addat(int k, int item) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		if (k == 0) {
			addfirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {
			Node nn = new Node();

			nn.data = item;
			nn.next = null;

			Node nm1 = getnode(k - 1);
			Node np1 = getnode(k);
			nm1.next = nn;
			nn.next = np1;
			this.size++;

		}

	}

	public int removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		int tamp = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return tamp;
	}

	public int removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		int tamp = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sm2 = getnode(this.size - 2);

			sm2.next = null;
			tail = sm2;
			this.size--;

		}
		return tamp;
	}

	public int removeat(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		if (k < 0 || k >= size) {
			throw new Exception(" Invailed index");

		}

		if (k == 0) {
			return removefirst();
		} else if (k == this.size - 1) {
			return removelast();
		} else {
			Node nn = new Node();

			Node nm1 = getnode(k - 1);
			nn = nm1.next;
			Node np1 = nn.next;
			nm1.next = np1;
			this.size--;
			return nn.data;
		}

	}

	public int kthformlast(int k) {

		// Write your Code  here 
		Node s=head;
		Node f=head;
		for(int i=1; i<k; i++){
			f=f.next;
		}

		while(f!=tail){
			s=s.next;
			f=f.next;
		}

		return s.data;
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Kth_element_from_last_in_linked_list list = new Kth_element_from_last_in_linked_list();
		int item = sc.nextInt();
		while (item != -1) {
			list.addLast(item);
			item = sc.nextInt();
			

		}

		int n = sc.nextInt();
		
		 System.out.println(list.kthformlast(n));
	}
}
