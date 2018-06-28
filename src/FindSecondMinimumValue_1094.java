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

public class FindSecondMinimumValue_1094 {
    /**
     * @param root: the root
     * @return: the second minimum value in the set made of all the nodes' value in the whole tree
     */
	List<Integer> nodeLists = new ArrayList<Integer>();
    public int findSecondMinimumValue(TreeNode root) {
        // Write your code here
    	int result = -1;
    	
    	if(root == null)
    		return result;
    	
    	nodeLists.add(root.val);
    	
    	while(root.left != null){
    		nodeLists.add(root.left.val);
    		
    	}
    		
    	
    	return result;
    }
    
    public static void main(String args[]){
    	FindSecondMinimumValue_1094 obj = new FindSecondMinimumValue_1094();
    	TreeNode root = new TreeNode(2);
    	TreeNode node1 = new TreeNode(2);
    	TreeNode node2 = new TreeNode(5);
    	TreeNode node3 = new TreeNode(5);
    	TreeNode node4 = new TreeNode(7);
    	
    	root.left = node1;
    	root.right = node2;
    	node2.left = node3;
    	node2.right = node4;
    	
    	System.out.println(obj.findSecondMinimumValue(root));
    }
}