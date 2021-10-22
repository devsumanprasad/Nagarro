/*
Given postorder and inorder traversal of a tree. Create the original tree on given information.

Input Format
Enter the size of the postorder array N then add N more elements and store in the array, 
then enter the size of the inorder array M and add M more elements and store in the array. here M and N are same.

Constraints
None

Output Format
Display the tree using the display function

Sample Input
3
1
3
2
3
1
2
3
Sample Output
1 => 2 <= 3
END => 1 <= END
END => 3 <= END
 */

package assignment_9_BTree;
import java.util.*;
public class Create_Tree_Using_Postorder_and_Inorder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Create_Tree_Using_Postorder_and_Inorder m = new Create_Tree_Using_Postorder_and_Inorder();
		int[] post = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(post, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

			// write your code here
			if(plo>phi) {
			return null;
			}
			int root = post[phi];
			Node n = new Node();
			n.data = root;
			
			phi--;
			
			int found = 0;
			int L_num = 0;
			if(ilo==ihi)
				return n;
			int i = ilo;
			for (; i <= ihi; i++) {
				if (root == in[i]) {
					found = i;
					break;
				}
				L_num++;
			}
			
			
			int nel = i-ilo;
			n.right = construct(post,plo,phi,in,i+1,ihi);
			n.left = construct(post,plo,phi-1,in,ilo,i-1);
			
		
			return n;
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
