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

public class MinDepth_155 {
    /**
     * @param root: The root of binary tree
     * @return: An integer
     */
    public int minDepth(TreeNode root) {
        // write your code here
    	
    	if(root == null)
    		return 0;
    	
    	return getMin(root);
    }
    
    public int getMin(TreeNode root) {
    	if(root == null)
    		return Integer.MAX_VALUE;
    	
    	if(root.left == null && root.right == null)
    		return 1;
    	
		return Math.min(getMin(root.left), getMin(root.right)) + 1;
	}

	public static void main(String args[]){
    	MinDepth_155 obj = new MinDepth_155();
    	TreeNode root = new TreeNode(1);
    	TreeNode node1 = new TreeNode(2);
    	TreeNode node2 = new TreeNode(3);
    	TreeNode node3 = new TreeNode(4);
    	TreeNode node4 = new TreeNode(5);
    	
    	root.left = node1;
    	root.right = node2;
    	root.right.left = node3;
    	root.right.right = node4;
    	
    	System.out.println(obj.minDepth(root));;
    }
}