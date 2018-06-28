package listNode;

import lintCodeClass.ListNode;

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class NthToLast_166 {
    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list. 
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
    	if(head == null)
    		return null;
    	
    	if(head.next == null)
    		return head;
    	
    	ListNode node1 = head;
    	ListNode node2 = head;
    	
    	for(int i = 0; i < n; i++){
    		node1 = node1.next;
    	}
    	
    	if (node1 == null) {
            return head;
        }
    	
    	while(node1.next != null){
    		node1 = node1.next;
    		node2 = node2.next;
    	}
    	
    	return node2.next;
    }
    
    public static void main(String args[]){
    	NthToLast_166 obj = new NthToLast_166();
    	
    	ListNode head = new ListNode(3);
    	//ListNode node1 = new ListNode(2);
    	//ListNode node2 = new ListNode(1);
    	//ListNode node3 = new ListNode(5);
    	
    	//head.next = node1;
    	//node1.next = node2;
    	//node2.next = node3;
    	
    	int n = 1;
    	
    	obj.nthToLast(head, n);
    }
}