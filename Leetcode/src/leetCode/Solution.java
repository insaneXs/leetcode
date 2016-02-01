package leetCode;

import Base.ListNode;

public class Solution {
	 public static ListNode insertionSortList(ListNode head) {
	        if(head == null || head.next == null)
	        	return head;
	        ListNode cur = head.next;
	        ListNode pre = head;
	        ListNode next = null;
	        ListNode newhead = head;
	        while(cur != null){
	            next = cur.next;
	            pre.next = next;
	            ListNode find = newhead;
	            ListNode p = null;
	            while(find != null && find.val < cur.val){
	            	try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	            	p = find;
	            	find = find.next;
	            }
	            if(find == null){
	            	p.next = cur;
	            	cur.next = null;
	            }else if(p == null){
	            	cur.next = newhead;
	            	newhead = cur;
	            }else{
	            	p.next = cur;
	            	cur.next = find;
	            	if(find == next){
	            		pre = cur;
	            	}
	            }
	            cur = next;
	        }
	        return newhead;
	    }
	 public static void main(String[] args){
		 ListNode n1 = new ListNode(0);
		 ListNode n2 = new ListNode(0);
		 ListNode n3 = new ListNode(0);
		 ListNode n4 = new ListNode(0);
		 n1.next = n2;
		 n2.next = n3;
		 n3.next = n4;
		 insertionSortList(n1);
	 }
}
