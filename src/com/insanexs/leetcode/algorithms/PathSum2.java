package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.insanexs.leetcode.base.TreeNode;

public class PathSum2 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
        	return list;
        LinkedList<Integer> sub = new LinkedList<Integer>();
        sub.add(root.val);
        helper(root.val, sum, root, list, sub);
        return list;
    }
	
	private void helper(int s,int sum, TreeNode root, List<List<Integer>> list, LinkedList<Integer> sub){
		if(s == sum && root.left ==  null && root.right == null){
			list.add(new ArrayList<Integer>(sub));
			return;
		}
		
		if(root.left != null){
			sub.add(root.left.val);
			s += root.left.val;
			helper(s, sum, root.left, list, sub);
			s -= root.left.val;
			sub.removeLast();
		}
		
		if(root.right != null){
			sub.add(root.right.val);
			s += root.right.val;
			helper(s, sum, root.right, list, sub);
			s -= root.right.val;
			sub.removeLast();
		}
	}
}
