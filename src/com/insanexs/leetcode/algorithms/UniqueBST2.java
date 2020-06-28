package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.insanexs.leetcode.base.TreeNode;

public class UniqueBST2 {
	List<TreeNode> list = new ArrayList<TreeNode>();
	
	public List<TreeNode> generateTrees(int n) {
		subTrees(1, n, 0);
        return list;
    }
	private TreeNode subTrees(int down, int up, int count){
		TreeNode node = null;
		if(down <= up)		
			for(int i = down; i<= up; i++){
				node = new TreeNode(i);
				node.left = subTrees(down, i-1,count+1);
				node.right = subTrees(i+1, up, count+1);
				if(count == 0)
					list.add(node);
			}
		return node;
	}
}
