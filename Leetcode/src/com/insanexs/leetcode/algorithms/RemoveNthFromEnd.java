package com.leetCode.oj;

import java.util.HashMap;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n){
//		HashMap<Integer,ListNode> map = new HashMap<Integer,ListNode>();
//		ListNode curNode = head;
//		int index = 0;
//		while(curNode != null){
//			map.put(index++, curNode);
//			curNode = curNode.next;
//		}
//		if(index <= 1)
//			return null;
//		if(index - n == 0){
//			head.next = null;
//			return map.get(1);
//		}
//		if(n == 0){
//			map.get(index - 2).next = null;
//			return head;	
//		}
//		else{
//			map.get(index - n - 1).next = map.get(index - n + 1);
//			return head;
//		}
		
		
		if(head == null)
			return null;
		ListNode nNode = head;
		ListNode target = head;
		ListNode pre = null;
		for(int i=0; i< n-1; i++){
			nNode = nNode.next;
		}
		while(nNode.next != null){
			nNode = nNode.next;
			pre = target;
			target = target.next;
		}
		if(pre == null)
			return target.next;
		else{
			pre.next = target.next;
			return head;
		}
	}
}
