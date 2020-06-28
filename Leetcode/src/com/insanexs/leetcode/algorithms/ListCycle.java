package com.leetCode.oj;

import java.util.HashSet;
import java.util.Set;


public class ListCycle {
//	public static boolean hasCycle(ListNode head){
//		LinkedList<ListNode> link = new LinkedList<ListNode>();
//		ListNode cur = head;
//		while(cur != null){
//			for(ListNode node : link){
//				if(node.equals(cur))
//					return true;
//			}
//			link.offer(cur);
//			cur = cur.next;
//		}
//		return false;
//	}
	
	public static boolean hasCycle(ListNode head){
		Set<ListNode> set = new HashSet<ListNode>();
		ListNode cur = head;
		while(cur != null){
			int size = set.size();
			set.add(cur);
			if(size == set.size())
				return true;
			cur = cur.next;
		}
		return false;
	}
	public static void main(String[] args){
//		ListNode n1 = new ListNode(1);
//		ListNode n2 = new ListNode(2);
//		ListNode n3 = new ListNode(3);
//		ListNode n4 = new ListNode(4);
//		ListNode n5 = new ListNode(5);
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n3;
		System.out.println(hasCycle(null));
	}
}
