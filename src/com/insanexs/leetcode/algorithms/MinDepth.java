package com.insanexs.leetcode.algorithms;

import java.util.Stack;

public class MinDepth {
	public int minDepth(TreeNode root){
		if(root == null)
			return 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> flag = new Stack<Integer>();
		int mindepth = Integer.MAX_VALUE;
		int depth = 0;
		while(root != null || !stack.isEmpty()){
			while(root != null){
				stack.push(root);
				flag.push(0);
				root = root.left;
				depth++;
			}
			while(!stack.isEmpty() && flag.peek().equals(1)){
				flag.pop();
				TreeNode node = stack.pop();
				if(node.left == null && node.right == null){
					if(depth < mindepth)
						mindepth = depth;
				}
				depth--;
			}
			if(!stack.isEmpty()){
				flag.pop();
				flag.push(1);
				root = stack.peek().right;
			}
		}
		return mindepth;
	}
}
