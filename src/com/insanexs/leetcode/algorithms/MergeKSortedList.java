package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.ListNode;

public class MergeKSortedList {
	//TIME LIMIT EXCEEDED
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length < 1)
			return null;
		ListNode head = null, node = null;
		while(true){
			int index = -1;
			int min = Integer.MAX_VALUE;
			for(int i=0; i< lists.length; i++){
				if(lists[i] == null)
					continue;
				if(lists[i].val < min){
					index = i;
					min = lists[i].val;
				}
			}
			if(index == -1)
				return head;
			else{
				if(head == null){
					head = lists[index];
					node = head;
				}else{
					node.next = lists[index];
					node = node.next;
				}
				lists[index] = lists[index].next;
			}
		}
    }
}
