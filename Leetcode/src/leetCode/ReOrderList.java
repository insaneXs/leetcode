package leetCode;

import Base.ListNode;

public class ReOrderList {
	public static void reorderList(ListNode head){
		if(head == null || head.next == null)
			return;
		ListNode node = head;
		int count = 1;
		while(node.next != null){
			node = node.next;
			count++;
		}
		int mid = (count + 1) / 2;
		node = head;
		for(int i=1; i<mid; i++){
			node = node.next;
		}
		ListNode h2 = node.next;
		node.next = null;
		if(count > mid + 1){
			node = h2;
			ListNode pre = null,next = null;
			for(int i=mid+1; i<count; i++){
				next = node.next;
				node.next = pre;
				pre = node;
				node = next;
			}
			node.next = pre;
			h2 = node;
		}
		node = head;
		while(node != null && h2 != null){
			ListNode temp1 = node.next;
			ListNode temp2 = h2.next;
			node.next = h2;
			h2.next = temp1;
			node = temp1;
			h2= temp2;
		}
	}
	
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		reorderList(n1);
		printList(n1);
	}
	
	private static void printList(ListNode root){
		while(root != null){
			System.out.print(root.val + " ");
			root = root.next;
		}
		System.out.println("");
	}
}
