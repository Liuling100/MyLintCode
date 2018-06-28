package listNode;

import lintCodeClass.ListNode;

public class MergeTwoLists_165 {
    /**
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        // write your code here
    	if(head1 == null)
    		return head2;
    	
    	if(head2 == null)
    		return head1;
    	
    	
    	ListNode dummy = new ListNode(0);
    	ListNode lastNode = dummy;
    	
    	while(head1 != null && head2 != null){
    		if(head1.val >= head2.val){
    			lastNode.next = head2;
    			head2 = head2.next;
    		}else{
    			lastNode.next = head1;
    			head1 = head1.next;
    		}
    		
    		lastNode = lastNode.next;
    	}
		
		if(head1 == null){
			lastNode.next = head2;
		}
		 
		if(head2 == null){
			lastNode.next = head1;
		}
    	
    	return dummy.next;
    }
    
    public static void main(String args[]){
    	MergeTwoLists_165 obj = new MergeTwoLists_165();
    	
    	ListNode head1 = new ListNode(1);
    	ListNode node1_1 = new ListNode(3);
    	ListNode node1_2 = new ListNode(8);
    	ListNode node1_3 = new ListNode(11);
    	ListNode node1_4 = new ListNode(15);
    	
    	head1.next = node1_1;
    	node1_1.next = node1_2;
    	node1_2.next = node1_3;
    	node1_3.next = node1_4;
    	
    	ListNode head2 = new ListNode(2);
    	ListNode node2_1 = new ListNode(3);
    	head2.next = node2_1;
    	
    	obj.mergeTwoLists(head1, head2);
    	
    }
}
