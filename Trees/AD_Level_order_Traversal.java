import java.util.*;

//Time Complexity: O(n). Space Complexity: O(n).
public class AD_Level_order_Traversal extends BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		
		bt.root = new TreeNode(20);
		bt.root.left = new TreeNode(10);
		bt.root.right = new TreeNode(30);

	}

	
	static void Levelorder_recusrion(TreeNode root) {
		
		Queue<Integer> q = new LinkedList<Integer>();
	}
}
