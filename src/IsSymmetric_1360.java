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

public class IsSymmetric_1360 {
    /**
     * @param root: root of the given tree
     * @return: whether it is a mirror of itself 
     */
    public boolean isSymmetric(TreeNode root) {
        // Write your code here
    	if(root == null || (root.left == null && root.right == null) || root.left.val == root.right.val))
    		return true;
    	
    	
    	
    	
    	return true;
    }
    
    public static void main(String args[]){
    	IsSymmetric_1360 obj = new IsSymmetric_1360();
    	TreeNode root = new TreeNode(1);
    	TreeNode node1 = new TreeNode(2);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(3);
    	TreeNode node5 = new TreeNode(4);
    	TreeNode node6 = new TreeNode(4);
    	
    	root.left = node1;
    	root.right = node2;
    	
    	node1.left = node3;
    	node1.right = node5;
    	
    	node2.left = node4;
    	node2.right = node6;
    	
    	System.out.println(obj.isSymmetric(root));
    }
}