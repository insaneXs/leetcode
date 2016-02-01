package leetCode;

import Base.ListNode;

public class RemoveDuplicateFromList2 {
	public ListNode deleteDuplicate(ListNode head){
		if(head == null || head.next == null )
			return head;
		ListNode virHead = new ListNode(1);
		virHead.next = head;
		ListNode pre = virHead, cur = head.next;
		boolean duplicated = false;
		while(cur != null){
			if(pre.next.val == cur.val){
				duplicated = true;
				cur = cur.next;
				continue;
			}
			if(duplicated){
				pre.next = cur;
				duplicated = false;
			}else{
				pre = pre.next;
			}
			cur = cur.next;
		}
		if(duplicated)
			pre.next = null;
		return virHead.next;
	}
}
