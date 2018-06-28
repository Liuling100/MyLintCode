package listNode;

import lintCodeClass.ListNode;

public class SwapPairs_451 {
    /**
     * @param head: a ListNode
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // write your code here
    	if (head == null) {
    		return head;
    	}
    	
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;  // If we set head equal dummy, then the change of head will change dummy as well;
		
    	while (head.next != null && head.next.next != null) {
    		ListNode n1 = head.next;
    		ListNode n2 = head.next.next;
    		
    		n1.next = n2.next;
    		n2.next = n1;
    		head.next = n2; // update dummy;

    		head = n1;
    	}
    	return dummy.next;
    }
    
    public static void main(String args[]){
    	SwapPairs_451 obj = new SwapPairs_451();
    	
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	ListNode node4 = new ListNode(4);
    	
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	
    	obj.swapPairs(node1);
    }
}