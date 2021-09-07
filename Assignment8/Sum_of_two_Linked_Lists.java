/*
Given two numbers represented by two linked lists, write a program that prints the sum list. 
The sum list is linked list representation of addition of two input numbers in linked lists. 
It is not allowed to modify the lists. Also, not allowed to use explicit extra space (Use Recursion).

Input Format
First line contains N,M, number of nodes in the 1st and 2nd list.
Next line contains N nodes of 1st list.
Next line contains M nodes of 2nd list.

Constraints
0<N<10^6

Output Format
Print the sum list after adding the two linked lists.

Sample Input
3 3
5 6 3
8 4 2
Sample Output
1 4 0 5
Explanation
After adding the two numbers represented by linked lists i.e. 563 + 842 =1405 is represented as sum list. Sum list =1 -> 4 -> 0 -> 5.
 */

package Assignment8;
import java.util.*;
class Node {
	  Node next;
	  int data;
	}

	class Linked {
	  /*
	   * It adds two linked list numbers which're presented as single digit element
	   */
	  Node result, tempNode;
	  int carry;
	  public void addSumOfTwoLists(Node node1, Node node2) {

	    int count1 = 0, count2 = 0;
	    Node head1 = node1, head2 = node2;
	    
	    while(node1 != null) {
	      count1++;
	      node1 = node1.next;
	    }
	    
	    while(node2 != null) {
	      count2++;
	      node2 = node2.next;
	    }
	    
	    if(count1 == count2) {
	      calSum(head1, head2);
	    } else {
	      if(count1 < count2) {
	        Node tmp = head1;
	        head1 = head2;
	        head2 = tmp;
	      }
	      
	      int d = Math.abs(count2 - count1);
	      
	      node1 = head1;
	      node2 = head2;
	      
	      while(d > 0) {
	        node1 = node1.next;
	        tempNode = node1;
	        d--;
	      }
	      
	      this.calSum(node1, node2);
	      
	      this.addRestSum(head1);
	    }
	    
	    if(carry > 0) {
	      Node a = getNewNode(carry);
	      a.next = result;
	      result = a;
	    }
	  }
	  
	  public void calSum(Node node1, Node node2) {
	    if(node1 == null) {
	      return;
	    }

	    calSum(node1.next, node2.next);
	    int s = node1.data + node2.data + carry;
	    
	    carry = s / 10;
	    if(result == null) {
	      result = getNewNode(s % 10);
	    } else {
	      Node a = getNewNode(s % 10);
	      a.next = result;
	      result = a;
	    }
	    
	  }
	  
	  public void addRestSum(Node node) {
	    if(node == null) {
	      return;
	    }
	    
	    if(node != tempNode) {
	      addRestSum(node.next);
	      int s = node.data + carry;
	      carry = s / 10;
	      Node a = getNewNode(s % 10);
	      a.next = result;
	      result = a;
	    }
	  }
	  
	  /*
	   * getNewNode() method to generate a new node
	   */
	  public Node getNewNode(int key) {
	    Node a = new Node();
	    a.next = null;
	    a.data = key;
	    return a;
	  }

	  /*
	   * insert method is used to insert the element in Linked List
	   */
	  public Node insert(int key, Node node) {

	    if (node == null)
	      return getNewNode(key);
	    else
	      node.next = insert(key, node.next);

	    return node;
	  }

	  /*
	   * It'll print the complete linked list
	   */
	  public void printList(Node node) {
	    if (node == null) {
	      return;
	    }

	    System.out.print(node.data + " ");
	    printList(node.next);
	  }
	}

	public class Sum_of_two_Linked_Lists {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int m = sc.nextInt();
	    Linked a = new Linked();
	    
	    Node head1 = null;
	    for(int i=0; i<n; i++)
	    	head1 = a.insert(sc.nextInt(), head1);
	    /*
	    head1 = a.insert(1, head1);
	    head1 = a.insert(7, head1);
	    head1 = a.insert(8, head1);
	    head1 = a.insert(2, head1);
	    head1 = a.insert(5, head1);
	    
	    a.printList(head1);
	    System.out.println();
	    */
	    Node head2 = null;
	    for(int i=0; i<m; i++)
	    	head2 = a.insert(sc.nextInt(), head2);
	  
	    /*
	    head2 = a.insert(5, head2);
	    head2 = a.insert(6, head2);
	    head2 = a.insert(7, head2);
	    
	    a.printList(head2);
	    System.out.println();
	    */
	    a.addSumOfTwoLists(head1, head2);
	    a.printList(a.result);
	    
	  }
	}