
public class AB_In_order_Traversal extends BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		
		bt.root = new TreeNode(20);
		bt.root.left = new TreeNode(10);
		bt.root.right = new TreeNode(30);
		
		
		Inorder_Recursion(bt.root);
	}
	
	static void Inorder_Recursion(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Inorder_Recursion(root.left);
		System.out.println(root.data);
		Inorder_Recursion(root.right);
		
	}
	

}
