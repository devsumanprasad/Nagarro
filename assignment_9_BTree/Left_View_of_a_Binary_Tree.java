/*
 Given a binary tree, write an efficient algorithm to print it's left view.
Left view of a Binary Tree is set of nodes visible when tree is visited from left side.

Input Format
The first line of the input contains level order traversal of the tree as space separated integers . In the level order traversal , -1 represent a null child while any other value represent a node of the tree.

Constraints
1<=number of nodes in the tree <=10^5

Output Format
Space separated node values as visible from the left side of the binary tree.

Sample Input
1 2 2 -1 -1 -1 -1
Sample Output
1 2
Explanation
level order traversal is
1
2 2
so the output is 1 2
 */

package assignment_9_BTree;
import java.util.*;
public class Left_View_of_a_Binary_Tree {
	static int maxLevel = 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Left_View_of_a_Binary_Tree m = new Left_View_of_a_Binary_Tree();
		BinaryTree tree = m.new BinaryTree(sc);
		tree.leftView();

	}

	class BinaryTree {

		class Node {
			int data;
			int hd;
			Node left;
			Node right;

			Node(int data) {
				this.data = data;
				this.hd = Integer.MAX_VALUE;
				this.left = this.right = null;
			}

		}

		public BinaryTree(Scanner s) { // Binary tree must be made like this to store the value of root .. Your was
										// poorly made as the value of root was lost
			this.root = this.takeInput(s);
		}

		Node root;

		public Node takeInput(Scanner s) { // Modified takeInput method as in your method the program stops taking input
											// after first -1 while that might not always be the case
			// enter the element for the root
			Queue<Node> q = new LinkedList<>();
			int data = s.nextInt();
			Node node = new Node(data);
			if (data == -1) {
				return null;
				
			}
			q.add(node);
			while (!q.isEmpty()) {
				Node temp = q.poll();
				
				if(s.hasNextInt() )
				     data = s.nextInt();
				else
					break;

				if (data != -1) {
					temp.left = new Node(data);
					q.add(temp.left);
				}
				if(s.hasNextInt() )
				     data = s.nextInt();
				else
					break;

				if (data != -1) {
					temp.right = new Node(data);
					q.add(temp.right);
				}
			}
			return node;
		}

		public void leftView() {
			leftView(this.root, 1);
		}

		private void leftView(Node root, int level) {
			if (root == null || root.data == -1) {
				return;
			}

			if (maxLevel < level) {
				System.out.print(root.data + " ");
				maxLevel = level;
			}

			if (root.left != null) {
				leftView(root.left, level + 1);
			}

			if (root.right != null) {
				leftView(root.right, level + 1);
			}
		}
	}

}
