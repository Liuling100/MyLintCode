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

public class SumOfLeftLeaves_1254 {
    /**
     * @param root: t
     * @return: the sum of all left leaves
     */
	public int sumOfLeftLeaves(TreeNode root, Boolean isLeft) {
	    if (root == null) {
	        return 0;
	    }
	    int sum = 0;
	    if (root.left != null || root.right != null) {
	        sum += sumOfLeftLeaves(root.left, true);
	        sum += sumOfLeftLeaves(root.right, false);
	    }else if (isLeft) {
	        sum += root.val;
	    }

	    return sum;
	}

	public int sumOfLeftLeaves(TreeNode root) {
	    return sumOfLeftLeaves(root, false);
	}
    
    public static void main(String args[]){
    	SumOfLeftLeaves_1254 obj = new SumOfLeftLeaves_1254();
    	TreeNode root = new TreeNode(3);
    	TreeNode node1 = new TreeNode(9);
    	TreeNode node2 = new TreeNode(20);
    	TreeNode node3 = new TreeNode(15);
    	TreeNode node4 = new TreeNode(7);
    	root.left = node1;
    	root.right = node2;
    	node2.left = node3;
    	node2.right = node4;
    	
    	System.out.println(obj.sumOfLeftLeaves(root));
    }
}