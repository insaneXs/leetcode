package com.leetCode.oj;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
	public TreeNode(int i, TreeNode left, TreeNode right) {
		val = i;
		this.left = left;
		this.right = right;
	}
}
