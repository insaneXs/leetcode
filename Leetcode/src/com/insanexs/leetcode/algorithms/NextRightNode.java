package com.leetCode.oj;

import java.util.LinkedList;
import java.util.Queue;

class TreeLinkNode{
	int val;
	TreeLinkNode left,right,next;
	public TreeLinkNode(int val){
		this.val = val;
	}
}
public class NextRightNode {
	public static void connect(TreeLinkNode root){
		if(root == null)
			return ;
		Queue<TreeLinkNode> curQ = new LinkedList<TreeLinkNode>();
		Queue<TreeLinkNode> nextQ = null;
		
		curQ.offer(root);
		while(!curQ.isEmpty()){
			nextQ = new LinkedList<TreeLinkNode>();
			while(!curQ.isEmpty()){
				TreeLinkNode node = curQ.poll();
				node.next = curQ.peek();
				if(node.left != null)
					nextQ.add(node.left);
				if(node.right != null)
					nextQ.add(node.right);
			}
			curQ = null;
			curQ = nextQ;
		}
	}
	public static void main(String[] args){
		TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		n1.left = n2;
		n1.right = n3;
		connect(n1);
	}
}
