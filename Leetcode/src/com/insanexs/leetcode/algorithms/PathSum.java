package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.TreeNode;

public class PathSum {
	
//	public boolean hasPathSum(TreeNode root ,int sum){
//		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
//		LinkedList<Boolean> hasMore = new LinkedList<Boolean>();
//		int ans = 0;
//		TreeNode curNode = root;
//		while(curNode != null || !stack.isEmpty()){
//			while(curNode != null){
//				stack.push(curNode);
//				hasMore.push(true);
//				ans = ans + curNode.val;
//				curNode = curNode.left;
//			}
//			if(curNode == null && hasMore.peek()){
//				hasMore.pop();
//				hasMore.push(false);
//				curNode = stack.peek();
//				curNode = curNode.right;
//			}
//			if(curNode == null && !stack.isEmpty()){
//				curNode = stack.pop();
//				hasMore.pop();
//				if(curNode.left == null && curNode.right == null && ans == sum)
//					return true;
//				ans = ans - curNode.val;
//				curNode = null;
//			}
//		}
//		return false;
//	}
	public boolean hasPathSum(TreeNode root ,int sum){
		if(root != null){
			if(root.left == null && root.right == null && sum == root.val)
				return true;
			return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
		return false;
	}
	public static void main(String[] args){
		TreeNode node = new TreeNode(1);
		System.out.println(new PathSum().hasPathSum(node, 0));
	}
}
