package leetCode;

import Base.TreeNode;

public class SumNumbers {
	public int sumNumbers(TreeNode root){
		return getSum(root, 0);
		
	}
	private int getSum(TreeNode root, int sum){
		if(root == null)
			return 0;
		else if(root.left == null && root.right == null)
			return sum * 10+ root.val;
		else
			return getSum(root.left, sum * 10 + root.val) + getSum(root.right, sum * 10 + root.val); 
	}
}
