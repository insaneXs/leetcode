package leetCode;

import Base.TreeNode;

public class SameTree {
	public boolean isSameTree(TreeNode p,TreeNode q){
		if((p == null && q != null) ||(q ==null && p !=null))
			return false;
		else if(p == null && q == null)
			return true;
		else if(p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		return false;
	}
	public static void main(String[] args){
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(2);
		node1.left = node3;
		node2.right = node4;
		System.out.println(new SameTree().isSameTree(node1, node2));
	}
}
