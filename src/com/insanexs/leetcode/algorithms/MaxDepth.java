package com.insanexs.leetcode.algorithms;

public class MaxDepth {
	public int maxDepth(TreeNode root){
		if(root != null){
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			int depth = leftDepth > rightDepth ? leftDepth : rightDepth;
			return ++depth;
		}
		return 0;
	}
}
