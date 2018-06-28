import lintCodeClass.TreeNode;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class DiameterOfBinaryTree_1181 {
    /**
     * @param root: a root of binary tree
     * @return: return a integer
     */
	int depth = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // write your code here
    	getDepth(root);
    	return depth;
    }
    
    private int getDepth(TreeNode root){
    	if(root == null)
    		return 0;
    	
    	int l = getDepth(root.left);
    	int r = getDepth(root.right);
    	depth = Math.max(depth, l+r);
    	return Math.max(l, r)+1;
    }
    
    public static void main(String args[]){
    	DiameterOfBinaryTree_1181 obj = new DiameterOfBinaryTree_1181();
    	TreeNode root = new TreeNode(1);
    	TreeNode node1 = new TreeNode(2);
    	TreeNode node2 = new TreeNode(3);
    	TreeNode node3 = new TreeNode(4);
    	TreeNode node4 = new TreeNode(5);
    	
    	root.left = node1;
    	root.right = node2;
    	node1.left = node3;
    	node1.right = node4;
    	
    	System.out.println(obj.diameterOfBinaryTree(root));
    }
}