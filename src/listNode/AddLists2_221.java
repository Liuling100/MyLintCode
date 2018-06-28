package listNode;

import java.util.ArrayList;
import java.util.List;

import lintCodeClass.ListNode;

public class AddLists2_221 {
	 /**
     * @param l1: The first list.
     * @param l2: The second list.
     * @return: the sum list of l1 and l2.
     */
    public ListNode addLists2(ListNode l1, ListNode l2) {
        // write your code here
    	if(l1 == null)
    		return l2;
    	
    	if(l2 == null)
    		return l1;
    	
    	List<Integer> array1 = new ArrayList<Integer>();
    	List<Integer> array2 = new ArrayList<Integer>();
    	
    	array1 = reverseArray(nodeToArray(l1, array1));
    	array2 = reverseArray(nodeToArray(l2, array2));
    	
    	int sum = arrayToInt(array1) + arrayToInt(array2);
    	String str = sum + "";
    	
    	ListNode dummy = new ListNode(0);
    	ListNode curr = dummy;
    	for(int i = 0; i < str.length(); i++){
    		curr.next = new ListNode(str.indexOf(i));
    		curr = curr.next;
    	}
    	
    	return dummy.next;    	
    }
    
    public int arrayToInt(List<Integer> array){
    	int sum = 0;
    	
    	for(int i = 0; i < array.size(); i++){
    		sum += array.get(i) * Math.pow(10, i);
    	}
    	
    	return sum;
    }
    
    public List<Integer> reverseArray(List<Integer> array) {
    	List<Integer> output = new ArrayList<Integer>();
    	for(int i = array.size() - 1, j = 0; i >= 0; i--, j++){
    		output.set(j, array.get(i));
    	}
    	
    	return output;
    }
    
    public List<Integer> nodeToArray(ListNode node, List<Integer> array) {
		while(node != null){
			array.add(node.val);
			node = node.next;
		}
		return array;
	}

	public static void main(String args[]){
    	AddLists2_221 obj = new AddLists2_221();
    	
    	ListNode head1 = new ListNode(6);
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(7);
    	head1.next = node1;
    	node1.next = node2;
    	
    	ListNode head2 = new ListNode(2);
    	ListNode node11 = new ListNode(9);
    	ListNode node22 = new ListNode(5);
    	head2.next = node11;
    	node11.next = node22;
    	
    	obj.addLists2(head1, head2);
    	
    }
}
