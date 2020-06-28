package com.insanexs.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ListCycle2 {
	public ListNode hasCycle(ListNode head){
		Set<ListNode> set = new HashSet<ListNode>();
		ListNode cur = head;
		while(cur != null){
			int size = set.size();
			set.add(cur);
			if(size == set.size())
				return cur;
			cur = cur.next;
		}
	return null;
	}
}
