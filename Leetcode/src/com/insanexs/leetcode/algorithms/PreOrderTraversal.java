package com.leetCode.oj;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
	public List<Integer> preOrderTraversal(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> list = new LinkedList<Integer>();
		while(root != null || !stack.isEmpty()){
			while(root != null ){
				list.add(root.val);
				stack.push(root);
				root = root.left;
			}
			if(!stack.isEmpty()){
				root = stack.pop();
				root = root.right;
			}
		}
		return list;
	}
}
