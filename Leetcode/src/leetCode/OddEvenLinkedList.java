package leetCode;

import other.ListNodeFactory;
import Base.ListNode;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode oddDummy = new ListNode(0), evenDummy = new ListNode(0);
		ListNode oddHead = oddDummy, evenHead = evenDummy;
		ListNode curNode = head;
		while(curNode != null){
			oddHead.next = curNode;
			oddHead = curNode;
			curNode = curNode.next;
			if(curNode != null){
				evenHead.next = curNode;
				evenHead = curNode;
				curNode = curNode.next;
			}else{
				break;
			}
		}
		evenHead.next = null;
		oddHead.next = evenDummy.next;
		return oddDummy.next;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		ListNode head = ListNodeFactory.getListNode(arr);
		ListNodeFactory.printListNodeList(head);
		head = new OddEvenLinkedList().oddEvenList(head);
		ListNodeFactory.printListNodeList(head);
	}
}
