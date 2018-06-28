import lintCodeClass.ListNode;

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Partition_96 {
    /**
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
    	ListNode result = null;
    	
    	if(head == null)
    		return result;
    	
    	ListNode leftDummy = new ListNode(0);
    	ListNode rightDummy = new ListNode(0);
    	ListNode left = leftDummy;
    	ListNode right  = rightDummy;
    	
    	while(head != null){
    		if(head.val < x){
    			left.next = head;
    			left = head;
    		}else{
    			right.next = head;
    			right = head;
    		}
    		
    		head = head.next;
    	}
    	
    	right.next = null;
    	left.next = rightDummy.next;
    	
    	return leftDummy.next;
    }
    
    public static void main(String args[]){
    	Partition_96 obj = new Partition_96();
    	int x = 3;
    	ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(4);
    	ListNode node2 = new ListNode(3);
    	ListNode node3 = new ListNode(2);
    	ListNode node4 = new ListNode(5);
    	ListNode node5 = new ListNode(2);
    	head.next = node1;
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	node4.next = node5;
    	
    	obj.partition(head, x);
    }
}