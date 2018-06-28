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

public class ClosestValue_900 {
    /**
     * @param root: the given BST
     * @param target: the given target
     * @return: the value in the BST that is closest to the target
     */
	List<Integer> listNode = new ArrayList<Integer>();
	
	public void treenodeToList(TreeNode root){
		if(root.left != null){
			treenodeToList(root.left);
    	}
		
		if(root.right != null){
    		treenodeToList(root.right);
    	}
    		
		listNode.add(root.val);
    	
	}

	public int closestValue(TreeNode root, double target) {
        // write your code here
    	if(root == null)
    		return root.val;
    	
    	
    	treenodeToList(root);

    	double diff = Integer.MAX_VALUE;
    	int output = 0;
    	for(int i = 0; i < listNode.size(); i++){
    		if(Math.abs(target - listNode.get(i)) <= diff){
    			diff = Math.abs(target - listNode.get(i));
    			output = listNode.get(i);
    		}
    	}
    	return output;
    }
    
    public static void  main(String args[]){
    	ClosestValue_900 obj = new ClosestValue_900();
    	
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(3);
    	root.right = new TreeNode(4);
    	double target = 4;
    	System.out.println(obj.closestValue(root, target));
    }
}