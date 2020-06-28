package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.insanexs.leetcode.base.TreeNode;

public class BinaryTreeLevelOrderTraversal2 {
	public List<List<Integer>> levelOrder(TreeNode root){
		LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
		if(root == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int end = 1;
		while(!queue.isEmpty()){
			int cur = 0;
			int size = 0;
			List<Integer> listInLevel = new ArrayList<Integer>();
			while(cur < end){
				TreeNode curNode = queue.poll();
				if(curNode.left != null){
					queue.add(curNode.left);
					size++;
				}
				if(curNode.right != null){
					queue.add(curNode.right);
					size++;
				}
				listInLevel.add(curNode.val);
				cur++;
			}
			end = size;
			list.addFirst(listInLevel);
		}
		return list;
	}
}
