package com.leetCode.oj;

import java.util.List;

public class SortArrayToBST {
	
	//Unbalanced
//	public TreeNode sortArrayToBST(int[] num){
//		if(num.length < 1)
//			return null;
//		TreeNode head = new TreeNode(num[0]);
//		for(int i=1; i<num.length; i++){
//			TreeNode next = new TreeNode(num[i]);
//			TreeNode compare = head;
//			while(true){
//				if(next.val <= compare.val){
//					if(compare.left != null)
//						compare = compare.left;
//					else
//						break;
//				}else{
//					if(compare.right != null)
//						compare = compare.right;
//					else
//						break;
//				}
//					
//			}
//			if(next.val <= compare.val)
//				compare.left = next;
//			else
//				compare.right = next;
//		}
//		return head;
//	}
	
	public TreeNode sortArrayToBST(int[] num){
		if(num.length < 1)
			return null;
		TreeNode head = sort(num,0,num.length-1);
		return head;
		
	}
	public TreeNode sort(int[] num,int left,int right){
		if(left <= right){
			int mid = (left + right) / 2;
			TreeNode head = new TreeNode(num[mid]);
			head.left = sort(num,left,mid-1);
			head.right = sort(num,mid+1, right);
			return head;
		}
		return null;
	}
	
	public static void main(String[] arg){
		int[] num = {1,3};
		TreeNode head = new SortArrayToBST().sortArrayToBST(num);
		List<Integer> list = SameTree.LevelOrderTra(head);
		for(Integer i : list){
			if(i == null)
				System.out.print("# ");
			else
				System.out.print(i + " ");
		}
	}
}
