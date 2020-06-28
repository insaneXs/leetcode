package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.TreeNode;

public class InvertBinaryTree {
	public TreeNode InverBinartTree(TreeNode root){
		recursion(root);
		return root;
	}
	
	public void recursion(TreeNode root){
		if(root == null )
			return;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		root.left = right;
		root.right = left;
		
		recursion(root.left);
		recursion(root.right);
	}
}
