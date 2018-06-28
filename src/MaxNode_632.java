import lintCodeClass.TreeNode;

public class MaxNode_632 {
	TreeNode max = new TreeNode(Integer.MIN_VALUE);
	public TreeNode maxNode(TreeNode root){
		if (root == null)
			return root;
		
		max = max.val > root.val ? max : root;
		maxNode(root.left);
		maxNode(root.right);
		
		return max;
	}
	
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-5);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(-4);
		root.right.right = new TreeNode(-5);
		
		MaxNode_632 obj = new MaxNode_632();
		
		System.out.println(obj.maxNode(root).val);
	}

}
