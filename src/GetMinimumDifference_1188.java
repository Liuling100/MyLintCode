import java.util.ArrayList;
import java.util.Collections;
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

public class GetMinimumDifference_1188 {
    /**
     * @param root: the root
     * @return: the minimum absolute difference between values of any two nodes
     */
    public int getMinimumDifference(TreeNode root) {
        // Write your code here
    	if(root == null || (root.left == null && root.right == null))
    		return 0;
    	
    	List<Integer> lists = changeToLists(root);
    	
    	Collections.sort(lists);
    	int min = Integer.MAX_VALUE;
    	
    	for(int i = 0; i < lists.size()-1; i++){
    		min = Math.min(min, Math.abs(lists.get(i) - lists.get(i+1)));
    	}
    	
    	return min;
    }

	List<Integer> lists = new ArrayList<Integer>();
    public List<Integer> changeToLists(TreeNode root){    	
    	if(root == null)
    		return lists;
    	
		lists.add(root.val);
		changeToLists(root.left);
		changeToLists(root.right);
    	
    	return lists;
    }
    
    public static void main(String args[]){
    	GetMinimumDifference_1188 obj = new GetMinimumDifference_1188();
    	TreeNode root = new TreeNode(1);
    	TreeNode node1 = new TreeNode(3);
    	TreeNode node2 = new TreeNode(2);
    	
    	root.left = node1;
    	node1.left = node2;
    	System.out.println(obj.getMinimumDifference(root));
    }
}