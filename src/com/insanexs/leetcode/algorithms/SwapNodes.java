package com.insanexs.leetcode.algorithms;

public class SwapNodes {
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        	return head;
        ListNode virtual = new ListNode(1);
        virtual.next = head;
        ListNode pre = virtual;
        ListNode cur = head;
        ListNode next = head.next;
  
        while(pre != null && next != null){
        	ListNode temp = next.next;
        	pre.next = next;
        	next.next = cur;
        	cur.next = temp;
        	
        	pre = cur;
        	cur = temp;
        	if(temp != null){
        		next = temp.next;
        	}else{
        		next = null;
        	}
        }
        return virtual.next;
    }
}
