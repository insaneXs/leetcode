package com.insanexs.leetcode.algorithms;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x){
		this.val = x;
		next = null;
	}

	@Override
	public String toString() {
		return "["
				 + val +
				']';
	}
}
