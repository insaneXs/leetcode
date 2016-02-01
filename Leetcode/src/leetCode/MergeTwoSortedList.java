package leetCode;

import Base.ListNode;

public class MergeTwoSortedList {
	public static ListNode mergeTwoSortedList(ListNode l1,ListNode l2){
		if(l1 == null || l2 == null)
			return (l1 == null)? l2 : l1;
		ListNode head,l1node,l2node ;
		if(l1.val < l2.val){
			head = l1;
			l1node = l1.next;
			l2node = l2;
		}else{
			head = l2;
			l1node = l1;
			l2node = l2.next;
		}
		ListNode curNode = head;
		while(l1node!= null && l2node != null){
			if(l1node.val < l2node.val){
				curNode.next = l1node;
				curNode = l1node;
				l1node = l1node.next;
			}else{
				curNode.next = l2node;
				curNode = l2node;
				l2node = l2node.next;
			}
		}
		if(l1node == null)
			curNode.next = l2node;
		if(l2node == null)
			curNode.next = l1node;
		return head;
	}
	public static void main(String[] args){
		mergeTwoSortedList(null, null);
	}
}
