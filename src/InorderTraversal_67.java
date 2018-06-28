import java.util.ArrayList;
import java.util.List;

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

public class InorderTraversal_67 {
    /**
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
	// left, root, right
	List<Integer> output = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
    	if(root == null){
    		return output;
    	}
    	
    	inorderTraversal(root.left);
    	
    	output.add(root.val);
    	
    	inorderTraversal(root.right);
    	
    	return output;
    }
    
    public static void main(String args[]){
    	InorderTraversal_67 obj = new InorderTraversal_67();
    	
    	TreeNode root = new TreeNode(1);
    	TreeNode root_right = new TreeNode(2);
    	TreeNode root_right_left = new TreeNode(3);
    	
    	root.right = root_right;
    	root.right.left = root_right_left;
    	
    	System.out.println(obj.inorderTraversal(root));
    }
}