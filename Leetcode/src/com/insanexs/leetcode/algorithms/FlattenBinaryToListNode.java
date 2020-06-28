package com.leetCode.oj;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class FlattenBinaryToListNode {
	public void flatten(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<TreeNode> list = new LinkedList<TreeNode>();
		while(root != null || !stack.isEmpty()){
			while(root != null){
				list.add(root);
				stack.push(root);
				root = root.left;
			}
			if(!stack.isEmpty()){
				root = stack.pop();
				root = root.right;
			}
		}
		if(list.isEmpty())
			return;
		for(int i=0; i<list.size()-1; i++){
			TreeNode node = list.get(i);
			node.left = null;
			node.right = list.get(i+1);
		}
		list.get(list.size()-1).left = null;
		list.get(list.size()-1).left = null;
		return;
	}
}
