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


public class InsertNode_85 {
    /*
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
    	if(root == null)
    		return node;
    	
    	if(root.val > node.val){
    		root.left = insertNode(root.left, node);
    	}else{
    		root.right = insertNode(root.right, node);
    	}
    	return root;
    }
    
    public static void main(String args[]){
    	InsertNode_85 obj = new InsertNode_85();
    	
    	TreeNode root = new TreeNode(2);
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(4);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node = new TreeNode(6);
    	
    	root.left = node1;
    	root.right = node2;
    	root.right.left = node3;
    	
    	obj.insertNode(root, node);
    	
    	
    }
}