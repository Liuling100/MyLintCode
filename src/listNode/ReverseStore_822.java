package listNode;

import java.util.ArrayList;
import java.util.List;

import lintCodeClass.ListNode;

public class ReverseStore_822 {
	 /**
     * @param head: the given linked list
     * @return: the array that store the values in reverse order 
     */
    public List<Integer> reverseStore(ListNode head) {
        // write your code here
    	List<Integer> output = new ArrayList<Integer>();
    	
    	if(head == null)
    		return output;
    	
    	while(head != null){
    		output.add(head.val);
    		head = head.next;
    	}
    	
    	List<Integer> output2 = new ArrayList<Integer>();
    	for(int i = output.size() - 1; i >= 0; i--){
    		output2.add(output.get(i));
    	}
    	
    	return output2;
    }
    
    public static void main(String args[]){
    	ReverseStore_822 obj = new ReverseStore_822();
    	
    	ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(2);
    	ListNode node2 = new ListNode(3);
    	
    	head.next = node1;
    	node1.next = node2;
    	
    	obj.reverseStore(head);
    }
}
