package com.insanexs.leetcode.algorithms;

import java.util.LinkedList;

public class IntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
		LinkedList<ListNode> listA = new LinkedList<ListNode>();
		ListNode curNode = headA;
		while(curNode != null){
			listA.add(curNode);
			curNode = curNode.next;
		}
		LinkedList<ListNode> listB = new LinkedList<ListNode>();
		curNode = headB;
		while(curNode != null){
			listB.add(curNode);
			curNode = curNode.next;
		}
		ListNode ans = null;
		while(!listA.isEmpty() && !listB.isEmpty()){
			if(listA.getLast() == listB.removeLast())
				ans = listA.removeLast();
			else
				break;
		}
		return ans;
	}
	public static void main(String[] args){
		ListNode headA = new ListNode(1);
		ListNode headB = null;
		new IntersectionNode().getIntersectionNode(headA, headB);
	}
}
