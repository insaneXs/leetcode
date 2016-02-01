package leetCode;

import Base.ListNode;

public class RotateList {
	public ListNode rotateRight(ListNode head,int n){
		ListNode pointer1 = head, pointer2 = head;
		int count = 0;
		int length = 0;
		while(pointer1 != null){
			length++;
			pointer1 = pointer1.next;
		}
		pointer1 = head;
		while(pointer1 != null){
			pointer1 = pointer1.next;
			count++;
			if(count == n % length)
				break;
		}
		if(pointer1 == null)
			return head;
		while(pointer1.next != null){
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
		}
		ListNode newHead = pointer2.next;
		pointer2.next = null;
		pointer1.next = head;
		return newHead;
	}
	//version 2;
	//because of the n may bigger than the length of the list;
	//so change the list into a circle by connecting the tail and the head;
	public ListNode protateRight2(ListNode head, int n){
		if(head == null)
			return head;
		ListNode cur = head;
		int length = 1;
		while(cur.next != null){
			cur = cur.next;
			length++;
		}
		cur.next = head;
		cur = head;
		int count = 1;
		int index =length -  n % length;
		while(count != index){
			cur = cur.next;
			count++;
		}
		ListNode newHead = cur.next;
		cur.next = null;
		return newHead;
	}
}
