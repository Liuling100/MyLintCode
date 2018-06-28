package sort;

import java.util.ArrayList;
import java.util.List;

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

public class InsertionSortList_173 {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
	List<Integer> arrays = new ArrayList<Integer>();
    public ListNode insertionSortList(ListNode head) {
        // write your code here
    	if(head == null)
    		return head;
    	
    	listToArray(head);
    	
    	head = arrayToList(sortArray(arrays));
    	
    	return head;
    }

	
    public ListNode arrayToList(List<Integer> sortArray) {
    	
    	ListNode dummy = new ListNode(-1);
    	ListNode curr = dummy;
    	for(int i = 0; i < sortArray.size(); i++){
    		curr.next = new ListNode(sortArray.get(i));
    		curr = curr.next;
    	}
    	return dummy.next;
	}

	public List<Integer> sortArray(List<Integer> arrays) {
		for(int j = 1; j < arrays.size(); j++){
			for(int i = 0; i < j; i++){
				if(arrays.get(i) > arrays.get(j)){
					int tmp = arrays.get(i);
					arrays.set(i, arrays.get(j));
					arrays.set(j, tmp);
				}
			}
		}
		return arrays;
	}

	public void listToArray(ListNode node){
		arrays.add(node.val);
		if(node.next == null)
			return;
		else{
			listToArray(node.next);
		}
    }
    
    public static void main(String args[]){
    	InsertionSortList_173 obj = new InsertionSortList_173();
    	
    	ListNode head = new ListNode(1);
    	ListNode node1 = new ListNode(3);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(0);
    	
    	head.next = node1;
    	node1.next = node2;
    	node2.next = node3;
    	
    	System.out.println(obj.insertionSortList(head));
    }
}