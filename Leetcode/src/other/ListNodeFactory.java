package other;

import Base.ListNode;

public class ListNodeFactory {
	public static ListNode getListNode(int[] array){
		if(array == null || array.length == 0)
			return null;
		ListNode head = new ListNode(array[0]);
		ListNode pre = head;
		for(int i=1; i<array.length; i++){
			ListNode node = new ListNode(array[i]);
			pre.next = node;
			pre = node;
		}
		return head;
	}
	
	public static void printListNodeList(ListNode head){
		if(head == null)
			System.out.println("");
		else{
			while(head != null){
				System.out.print(head.val + "->");
				head = head.next;
			}
			System.out.print("NULL");
		}
	}
}
