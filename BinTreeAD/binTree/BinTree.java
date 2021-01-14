package binTree;
	/**
	 * This program use Node class to perform the insertion of nodes
	 * and ensure those nodes are in ascending order to be printed.
	 * @author Andrew Daly (Originally written by Rodion Podorozhny, used with permission)
	 * <p> Only insert and inOrder methods have been edited by me.
	 * <p> All comments have been written by me as well.
	 */
public class BinTree {
	/**
	 * Root node pointer. Will be null for an empty tree.
	 */
	private Node root;
	/**
	 * This method inserts the given integer key into the binary tree.
	 * @param x - integer key for a node to hold.
	 */	
	public void insertNode(int x){
		Node node = new Node(x);              
		root = insert(root, node);
	}	
	/**
	 * This function use recursive insert -- given a tree pointer,
	 * recur down and insert the given node into the tree.
	 * @param tree - currently processed node.
	 * @param node - node to be inserted into a tree.
	 * @return - tree with all nodes inserted.
	 */	
	private Node insert(Node tree, Node node)
	/**
	 * Inserts item into tree.
	 * Post:  item is in tree; search property is maintained.
	 */
	{
	/**
	 * Checking if tree is empty and inserts item.
	 */
	if (tree == null) {
		tree = node;
	}
	/**
	 * Checking if item is less than the integer key and inserted as left node.
	 */
	else if (node.key < tree.key) {
		tree.left = insert(tree.left, node);
	}
	/**
	 * Checking if item is greater than the integer key and inserted as right node.
	 */
	else if (node.key > tree.key) {
		tree.right = insert(tree.right, node);
	}	
		/**
		 * Returns tree.
		 */
		return tree;
	}
	/**
	 * This method performs treewalk which implement nodes in ascending order.
	 */
	public void treeWalk() {
		inOrder(root);
	}	
	/**
	 * This method prints nodes in order.
	 * @param tree - to be printed.
	 */	
	private void inOrder(Node tree) {
	{
		/**
		 * Checking that tree is not empty.
		 */
		if (tree != null) {
			/**
			 * Putting all left nodes in order.
			 */
			inOrder(tree.left);
			/**
			 * Printing out nodes in order.
			 */
			System.out.print(tree.key + " ");
			/**
			 * Putting all right nodes in order.
			 */
			inOrder(tree.right);
		}
	}

	}
}
