package leetCode;

import java.util.LinkedList;

import Base.TreeNode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root){
		LinkedList<TreeNode> lStack = new LinkedList<TreeNode>();
		LinkedList<TreeNode> rStack = new LinkedList<TreeNode>();
		TreeNode lNode = root;
		TreeNode rNode = root;
		while(lNode != null || !lStack.isEmpty()){
			while(lNode != null){
				if(rNode == null || rNode.val != lNode.val)
					return false;
				lStack.push(lNode);
				rStack.push(rNode);
				lNode = lNode.left;
				rNode = rNode.right;
			}
			if(rNode !=null)
				return false;
			if(!lStack.isEmpty()){
				if(rStack.isEmpty())
					return false;
				if(lStack.peek() == root)
					break;
				lNode = lStack.pop().right;
				rNode = rStack.pop().left;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		TreeNode node = new TreeNode(1);
//		TreeNode n2 = new TreeNode(2);
//		TreeNode n3 = new TreeNode(3);
//		TreeNode n4 = new TreeNode(4);
//		TreeNode n5 = new TreeNode(4);
//		node.left = n2;
//		node.right = n3;
//		n2.left = n4;
//		n3.right = n5;
		System.out.println(new SymmetricTree().isSymmetric(node));
	}
}
