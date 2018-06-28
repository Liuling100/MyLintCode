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

public class Reverse_35 {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
    	ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    
    public static void main(String args[]){
    	Reverse_35 obj = new Reverse_35();
    	ListNode head = new ListNode(1);
    	ListNode list1 = new ListNode(2);
    	ListNode list2 = new ListNode(3);
    	head.next = list1;
    	list1.next = list2;
    	
    	System.out.println(obj.reverse(head));
    }
}