package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.ListNode;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		if(head == null)
			return head;
		ListNode sHead = new ListNode(-1);
		sHead.next = head;
		ListNode lHead = new ListNode(-1);
		
		ListNode cur = head;
		ListNode scur = sHead;
		ListNode lcur = lHead;
		while(cur != null){
			if(cur.val < x){
				scur.next = cur;
				scur = scur.next;
			}else{
				lcur.next = cur;
				lcur = lcur.next;
			}
			cur = cur.next;
		}
		scur.next = lHead.next;
		lcur.next = cur;
		return sHead.next;
	}

}
