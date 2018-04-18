public class AA_Pre_order_Traversal extends BinaryTree{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		
		bt.root = new TreeNode(20);
		bt.root.left = new TreeNode(10);
		bt.root.right = new TreeNode(30);
		
		pre_order_recursion(bt.root);

	}

	static void pre_order_recursion (TreeNode Root) {
		
		if(Root == null) {
			return;
		}
		
		System.out.println(Root.data);
		pre_order_recursion(Root.left);
		pre_order_recursion(Root.right);
		
	}
}
