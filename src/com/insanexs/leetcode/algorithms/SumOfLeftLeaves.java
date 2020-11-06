package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.TreeNode;

/**
 * @ClassName SumOfLeftLeaves
 * @Description TODO
 * @Author xieshang
 * @Date 2020/11/5
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        return dfs(root, true);
    }

    private int dfs(TreeNode root, boolean isLeft){
        int sum = 0;

        if(root.left == null && root.right == null && isLeft){
            return root.val;
        }

        if(root.left != null){
             sum += dfs(root.left, true);
        }
        if(root.right != null){
             sum += dfs(root.right, false);
        }
        return sum;
    }
}
