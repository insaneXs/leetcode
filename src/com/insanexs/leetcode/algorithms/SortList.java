package com.insanexs.leetcode.algorithms;
/**
 * @ClassName Sort List
 * @Description  Sort List #131 (Medium)
 * @Author xieshang
 * @Date 2020/11/5
 */
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

		ListNode ptr = head, next = null;

		ListNode newHead = null, newTail = null;

		while(ptr != null) {
			next = ptr.next;
			ptr.next = null;

			ListNode tmp = newHead;
			while(tmp != null && tmp.val < ptr.val){
				if(tmp.next == null){
						newTail = ptr;
						tmp.next = newTail;
						break;
				}else if(tmp.next.val >= ptr.val){
						ptr.next = tmp.next;
						tmp.next = ptr;
						break;
				}
				tmp = tmp.next;
			}

			if(newHead == null){
				newHead = ptr;
				newTail = ptr;
			}else if(tmp == newHead && tmp.val > ptr.val){
				newHead = ptr;
				ptr.next = tmp;
			}

			ptr = next;
		}
		return newHead;
	}

	public ListNode mergeSort(ListNode head){
		if(head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(slow.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode right = slow.next;
		slow.next = null;
		return merge(mergeSort(head), mergeSort(right));
	}

	public ListNode merge(ListNode left, ListNode right){
		if(left == null){
			return right;
		}

		if(right == null){
			return left;
		}

		ListNode vHead = null;

		if(left.val < right.val){
			vHead = left;
			vHead.next = merge(left.next, right);
		}else{
			vHead = right;
			vHead.next = merge(left, right.next);
		}
		return vHead;
	}

	public static void main(String[] args){
		ListNode head = new ListNode(4);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;

		SortList sl = new SortList();
		head = sl.sortList(null);
		System.out.println(head);
	}
}


