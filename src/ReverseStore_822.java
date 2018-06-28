

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
    	
    	return output;
    }
    
    public static void main(String args[]){
    	ReverseStore_822 obj = new ReverseStore_822();
    	
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(2);
    	ListNode n3 = new ListNode(3);
    	
    	ListNode head = n1;
    	head.next = n2;
    	head.next.next = n3;
    	
    	System.out.println(obj.reverseStore(head));
    	
    	
    	
    }
}