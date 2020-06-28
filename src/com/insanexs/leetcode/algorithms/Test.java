package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.ListNode;

public class Test {
	public ListNode rotate(ListNode head, int n){
		int num = 0;
        if(head == null)
            return null;
        if(n == 0)
            return head;
            
        ListNode node1 = head;
        ListNode node2 = head;
        while(node2!=null){
            num++;
            node2 = node2.next;
        }
        int i = 0;
        while(i < num - n){
            node2 = new ListNode(node1.val);
            node2 = node2.next;
            node1 = node1.next;
            i++;
        }
        return node1;
	}
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode n = new ListNode(2);
		head.next = n;
		new Test().rotate(head, 1);
		System.out.println(null instanceof Object);
	}
}
