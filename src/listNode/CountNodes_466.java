package listNode;

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

public class CountNodes_466 {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
    	if(head == null)
    		return 0;
    	
    	int len = 0;
    	ListNode curr = head;
    	while(curr != null){
    		len++;
    		curr = curr.next;
    	}
    	return len;
    }
    
    public static void main(String args[]){
    	CountNodes_466 obj = new CountNodes_466();
    	
    	ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(2);
    	ListNode node2 = new ListNode(3);
    	
    	head.next = node1;
    	node1.next = node2;
    	
    	System.out.println(obj.countNodes(head));
    }
}