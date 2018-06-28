package listNode;

import lintCodeClass.ListNode;

public class DeleteDuplicates_112 {
    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
    	if(head == null || head.next == null)
    		return head;
    	
    	ListNode dummy = head;
    	
    	while(dummy.next != null){
    		if(dummy.val == dummy.next.val){
    			dummy.next = dummy.next.next;
    		}else{
    			dummy = dummy.next;
    		}
    	}
    	
    	return head;
    }
    
    public static void main(String args[]){
    	DeleteDuplicates_112 obj = new DeleteDuplicates_112();
    	
    	ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(2);
    	ListNode node2 = new ListNode(1);
    	ListNode node3 = new ListNode(4);
    	
    	head.next = node1;
    	node1.next = node2;
    	node2.next = node3;
    	
    	obj.deleteDuplicates(head);
    }
}
