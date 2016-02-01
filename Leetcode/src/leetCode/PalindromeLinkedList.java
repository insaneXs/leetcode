package leetCode;

import Base.ListNode;

public class PalindromeLinkedList {
	public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        	return true;
        int count = 1;
        ListNode node = head;
        while(node.next != null){
        	count++;
        	node = node.next;
        }
        int mid = count + 1 - count / 2; 
        node = head;
        for(int i=1; i<mid-1; i++){
        	node = node.next;
        }
        ListNode head1;
        if(count % 2 ==0)
        	head1 = node.next;
        else{
        	head1 = new ListNode(node.val);
        	head1.next = node.next;
        }
       node.next = null;
       ListNode h =  reserveLinkedList(head1);
       for(int i=0; i<count; i++){
    	   if(!isSame(head, h))
    		   return false;
    	   if(head == null)
    		   return true;
    	   head = head.next;
    	   h= h.next;
       }
       return true;
    }
	
	private static ListNode reserveLinkedList(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode pre = head;
		ListNode node = head.next;
		pre.next = null;
		while(node.next != null){
			ListNode temp = node.next;
			node.next = pre;
			pre = node;
			node = temp;
		}
		node.next = pre;
		return node;
	}
	
	private static boolean isSame(ListNode n1, ListNode n2){
		if(n1 == null && n2 == null)
			return true;
		if(n1 != null && n2 != null)
			return n1.val == n2.val;
		return false;
	}
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(0);
		head.next = n1;
		head.next.next = new ListNode(1);
		isPalindrome(head);
	}
}
