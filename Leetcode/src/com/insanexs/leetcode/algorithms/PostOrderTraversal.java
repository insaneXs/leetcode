package com.leetCode.oj;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
	public static List<Integer> postOrderTraversal(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> flag = new Stack<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		while(root != null || !stack.isEmpty()){
			while(root != null){
				stack.push(root);
				flag.push(0);
				root = root.left;
			}
			if(!stack.isEmpty() && flag.peek().equals(1)){
				flag.pop();
				list.add(stack.pop().val);
			}
			if(!stack.isEmpty()){
				root = stack.peek();
				flag.pop();
				flag.push(1);
				root = root.right;
			}
		}
		return list;
	}
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		postOrderTraversal(root);
	}
}
