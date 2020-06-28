package com.insanexs.leetcode.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTra {
	public List<Integer> inOrderTravesal(TreeNode root){
		List<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root != null || !stack.isEmpty()){
			while(root != null){
				stack.push(root);
				root = root.left;
			}if(!stack.isEmpty()){
				root = stack.pop();
				list.add(root.val);
				root = root.right;
			}
		}
		return list;
	}
}
