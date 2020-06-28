package com.leetCode.oj;

public class SortList {
	//Maybe corret, but time limit exceed.
//	public ListNode sortList(ListNode head) {
//		if(head == null)
//			return head;
//		if(head.next == null)
//			return head;
//		ListNode newHead = head;
//		ListNode node = head.next;
//		ListNode compare;
//		while(node != null){
//			if(node.val < newHead.val){
//				node.next = newHead;
//				newHead = node;
//			}
//			compare = newHead.next;
//			ListNode preNode = newHead.next;
//			while(compare != null){
//				if(node.val > compare.val)
//					break;
//				preNode = compare;
//				compare = compare.next;
//			}
//			preNode.next = node;
//			node.next = null;
//		}
//		return newHead;
//	}
	public ListNode sortList(ListNode head){
		if(head == null)
			return head;
		return head;
		}
	}


