
public class AC_Post_order_Traversal extends BinaryTree{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		
		bt.root = new TreeNode(20);
		bt.root.left = new TreeNode(10);
		bt.root.right = new TreeNode(30);
		
		
		Post_order_Recursion(bt.root);
	}

	
	static void Post_order_Recursion(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Post_order_Recursion(root.left);
		Post_order_Recursion(root.right);
		System.out.println(root.data);
	}
}
