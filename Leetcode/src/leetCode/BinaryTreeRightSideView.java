package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Base.TreeNode;

public class BinaryTreeRightSideView {
	public static List<Integer> rightSideView(TreeNode root){
		List<Integer> ans = new ArrayList<Integer>();
		if(root == null)
			return ans;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			Queue<TreeNode> tempQ = new LinkedList<TreeNode>();
			while(!queue.isEmpty()){
				if(queue.size() == 1)
					ans.add(queue.peek().val);
				TreeNode node = queue.poll();
				if(node.left != null)
					tempQ.add(node.left);
				if(node.right != null)
					tempQ.add(node.right);
			}
			queue = tempQ;
		}
		return ans;
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		root.left = left;
		System.out.println(rightSideView(root));
	}
	
}
