package binTree;
/**
 * This is a class for Node to be used throughout the program.
 * Each node stores an integer key, and has left and right sub-tree pointer
 * which may be null.
 * @author Andrew Daly (Originally written by Rodion Podorozhny, used with permission).
 */
class Node {
	Node right;
	Node left;
	int key;
	Node(int key) {
		this.key = key;
	}
}
