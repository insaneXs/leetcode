package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.insanexs.leetcode.base.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int end = 1;
		while(!queue.isEmpty()){
			int cur = 0;
			int size = 0;
			List<Integer> levelList = new ArrayList<Integer>();
			//ÿһ��
			while(cur < end){
				TreeNode node = queue.poll();
				if(node.left != null){
					queue.add(node.left);
					size++;
				}
				if(node.right!= null){
					queue.add(node.right);
					size++;
				}
				cur++;
				levelList.add(node.val);
			}
			list.add(levelList);
			end = size;
		}
		return list;
	}
	
	public static void main(String[] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		n1.left = n2;
		System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(n1));
	}
}
