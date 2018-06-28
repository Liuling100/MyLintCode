package listNode;

import lintCodeClass.ListNode;

public class RemoveNthFromEnd_174 {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
    	
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	
    	ListNode node1 = dummy;
    	ListNode node2 = dummy;
    	
    	for(int i = 0; i < n; i++){
    		node1 = node1.next;
    	}
    	
    	if(node1 == null)
    		return head;
    	
    	while(node1.next != null){
    		node1 = node1.next;
    		node2 = node2.next;
    	}
    	
    	node2.next = node2.next.next;
    	
    	return dummy.next;
    }
    
    public static void main(String args[]){
    	
    	RemoveNthFromEnd_174 obj = new RemoveNthFromEnd_174();
    	
    	ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(2);
    	ListNode node2 = new ListNode(3);
    	ListNode node3 = new ListNode(4);
    	ListNode node4 = new ListNode(5);
    	
    	head.next = node1;
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	
    	int n = 2;
    	obj.removeNthFromEnd(head, n);
    }
}
