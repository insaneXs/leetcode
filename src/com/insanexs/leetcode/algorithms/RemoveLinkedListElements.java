package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.ListNode;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
        	head = head.next;
        }
        ListNode node = head;
        while(node != null){
        	while(node.next != null && node.next.val == val){
        		node.next = node.next.next;
        	}
        	node = node.next;
        }
        return head;
    }
}
