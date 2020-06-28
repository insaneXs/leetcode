package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.ListNode;

public class ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
        	return head;
        ListNode virHead = new ListNode(1);
        virHead.next = head;
        ListNode preRev = virHead,cur = head;
        int count = 1;
        while(cur != null && count != m){
        	count++;
        	preRev = cur;
        	cur = cur.next;
        }
        ListNode next = null,tail = cur;
        for(; count<n; count++){
        	next = tail.next;
        	tail.next = next.next;
        	next.next = cur;
        	cur = next;
        }
        preRev.next = cur;
        return virHead.next;
    }
}
