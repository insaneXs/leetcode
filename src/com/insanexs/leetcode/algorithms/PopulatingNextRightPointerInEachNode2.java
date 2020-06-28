package com.insanexs.leetcode.algorithms;

import java.util.LinkedList;
import java.util.Queue;

import com.insanexs.leetcode.base.TreeLinkNode;

public class PopulatingNextRightPointerInEachNode2 {
	public static void connect(TreeLinkNode root){
		if(root == null)
			return;
		Queue<TreeLinkNode> Q1 = new LinkedList<TreeLinkNode>();
		Queue<TreeLinkNode> Q2 = new LinkedList<TreeLinkNode>();
		
		Q1.add(root);
		
		while((!Q1.isEmpty()) || (!Q2.isEmpty())){
			while(!Q1.isEmpty()){
				TreeLinkNode node = Q1.poll();
				if(node.left != null)
					Q2.add(node.left);
				if(node.right != null)
					Q2.add(node.right);
				node.next = Q1.peek();
			}
			while(!Q2.isEmpty()){
				TreeLinkNode node = Q2.poll();
				if(node.left != null)
					Q1.add(node.left);
				if(node.right != null)
					Q1.add(node.right);
				node.next = Q2.peek();
			}
		}
	}
	public static void main(String[] args){
		TreeLinkNode root = new TreeLinkNode(0);
		connect(root);
	}
}
