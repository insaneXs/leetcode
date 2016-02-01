package leetCode;

import Base.ListNode;

public class ReverseNodes {
	public ListNode reverseKGroup(ListNode head, int k){
		if(head == null || head.next == null)
			return head;
		ListNode vhead = new ListNode(1);
		vhead.next = head;
		ListNode pre =vhead;
		ListNode tail = null;
		ListNode cur = head;
		ListNode[] nodes = new ListNode[k];
		int count = 0;
		while(cur != null){
			nodes[count++] = cur;
			cur = cur.next;
			if(count == k){
				tail = nodes[count - 1].next;
				for(int i=count-1; i>=0; i--){
					pre.next = nodes[i];
					pre = pre.next;
				}
				pre.next = tail;
				count = 0;
			}
		}
		return vhead.next;
	}
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		head.next = n1;
		new ReverseNodes().reverseKGroup(head, 1);
	}
}
