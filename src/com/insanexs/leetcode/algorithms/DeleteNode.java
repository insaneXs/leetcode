package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.ListNode;

public class DeleteNode {
	public void deleteNode(ListNode node){
		if(node == null)
			return;
		if(node.next == null)
			return;
		ListNode preNode = node;
		while(node.next != null){
			node.val = node.next.val;
			preNode = node;
			node = node.next;
		}
		preNode.next = null;
	}
}
