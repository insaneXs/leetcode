package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.TreeNode;

public class LCAOfBST {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(root == null || p == null || q == null)
			return null;
		if(p.val > q.val){
			TreeNode temp = p;
			p = q;
			q = temp;
		}else if(p.val == q.val)
			return p;
		TreeNode node = root;
		while(node != null && !(node.val >= p.val && node.val <= q.val)){
			if(node.val < p.val)
				node = node.right;
			else if(node.val > q.val)
				node = node.left;
		}
		return node;
	}
}
