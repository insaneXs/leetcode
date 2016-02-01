package leetCode;

import Base.ListNode;

public class ReverseLinked {
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        	return head;
        ListNode node = head, preNode = null, next = null;
        while(node.next != null){
        	next = node.next;
        	node.next = preNode;
        	preNode = node;
        	node = next;
        }
        node.next = preNode;
        return node;
    }
}
