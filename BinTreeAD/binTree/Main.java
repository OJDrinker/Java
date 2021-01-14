package binTree;
/**
 * This is a program for testing my implementation of a binary tree data structure.
 * <p> This program is to show my ability with implementation of a binary
 * tree data structure. A node should have an integer key.
 * My implementation include methods for inserting a node and a tree
 * walk. My method of tree walk outputs a list of keys sorted
 * in increasing order.
 * 
 * @author Andrew Daly (Originally written by Rodion Podorozhny, used with permission)
 * <p> All comments have been written by me.
 */
public class Main {
	/**
	 * @param args - taking in nodes which hold integer key.
	 */
	public static void main(String[] args) {
		/**
		 * Testcase 2.
		 */
		System.out.println();
		System.out.println("testcase 1:");
		BinTree binTree2 = new BinTree();
		binTree2.insertNode(3);
		binTree2.insertNode(201);
		binTree2.insertNode(60);
		binTree2.insertNode(30);
		binTree2.insertNode(45);
		binTree2.treeWalk();
				
		/**
		 * Testcase 3.
		 */
		System.out.println();

		System.out.println("testcase 2_1:");
		BinTree binTree3 = new BinTree();
		binTree3.insertNode(-10);
		binTree3.insertNode(-150);
		binTree3.insertNode(4);
		binTree3.insertNode(300);
		binTree3.insertNode(45);
		binTree3.treeWalk();
		binTree3.insertNode(-50);
		binTree3.insertNode(200);
		System.out.println();
		System.out.println("testcase 2_2:");
		binTree3.treeWalk();
	}
}
