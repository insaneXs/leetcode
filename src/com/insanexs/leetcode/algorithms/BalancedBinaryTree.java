package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.TreeNode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root){
		if(root == null)
			return true;
		if(Math.abs(len(root.left) - len(root.right)) > 1)
			return false;
		else 
			return isBalanced(root.left) && isBalanced(root.right);
	}
	private int len(TreeNode root){
		if(root == null)
			return 0;
		int	left = len(root.left);
		int right = len(root.right);
		return 1+((left > right) ? left : right);
	}
	public static void main(String[] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n4.left = n6;
		n3.right = n7;
		System.out.println(new BalancedBinaryTree().isBalanced(n1));
	}
}
