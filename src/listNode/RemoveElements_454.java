package listNode;

import lintCodeClass.ListNode;

public class RemoveElements_454 {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
    	if(head == null)
    		return head;
    
    	ListNode parent = new ListNode(0);
    	parent.next = head;
    	ListNode dummy = parent;
    	while(head != null){
    		if(head.val == val){
    			parent.next = head.next;
    		}else{
    			parent = parent.next;
    		}
    		head = head.next;
    	}
    	
    	return dummy.next;
    }
    
    public static void main(String args[]){
    	RemoveElements_454 obj = new RemoveElements_454();
    	
    	ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(2);
    	ListNode node2 = new ListNode(3);
    	ListNode node3 = new ListNode(3);
    	ListNode node4 = new ListNode(4);
    	ListNode node5 = new ListNode(5);
    	ListNode node6 = new ListNode(3);
    	
    	head.next = node1;
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	node4.next = node5;
    	node5.next = node6;
    	
    	int val = 3;
    	
    	obj.removeElements(head, val);
    }
}
