package leetCode;

import Base.ListNode;

public class RemoveDuplicateFromSortedList {
	public ListNode deleteDuplicates(ListNode head){
		if(head == null)
			return head;
		ListNode curNode = head;
		ListNode preNode = head;
		while(curNode != null){
			if(preNode.val != curNode.val){
				preNode.next = curNode;
				preNode = curNode;
			}
			curNode = curNode.next;
		}
		preNode.next = null;
		return head;
	}
}
