package leetCode;

import java.util.LinkedList;

import Base.ListNode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		ListNode cur = l1;
		while(cur != null){
			list1.addLast(cur.val);
			cur = cur.next;
		}
		cur = l2;
		while(cur != null){
			list2.addLast(cur.val);
			cur = cur.next;
		}
		int needPlus = 0;
		ListNode pre = null;
		ListNode head = null;
		while(!list1.isEmpty() && !list2.isEmpty()){
			int sum = list1.poll() + list2.poll() + needPlus;
			if(sum >= 10){
				sum = sum - 10;
				needPlus = 1;
			}else
				needPlus = 0;
			ListNode node = new ListNode(sum);
			if(pre != null)
				pre.next = node;
			else
				head = node;
			pre = node;
		}
		while(!list1.isEmpty()){
			int sum = list1.poll() + needPlus;
			if(sum >= 10){
				sum = sum - 10;
				needPlus = 1;
			}else
				needPlus = 0;
			ListNode node = new ListNode(sum);
			if(pre != null)
				pre.next = node;
			else
				head = node;
			pre = node;
		}
		while(!list2.isEmpty()){
			int sum = list2.poll() + needPlus;
			if(sum >= 10){
				sum = sum - 10;
				needPlus = 1;
			}else
				needPlus = 0;
			ListNode node = new ListNode(sum);
			if(pre != null)
				pre.next = node;
			else
				head = node;
			pre = node;
		}
		if(needPlus == 1)
			pre.next = new ListNode(1);
		return head;
	}
}
