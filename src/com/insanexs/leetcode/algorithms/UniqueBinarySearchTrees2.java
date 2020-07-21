package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UniqueBinarySearchTree2
 * @Description Unique Binary Search Tree II #95 (Medium)
 * @Author xieshang
 * @Date 2020/7/21 11:32 上午
 */
public class UniqueBinarySearchTrees2 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        if(n <= 0){
            return res;
        }
        return doGenerate(1, n);
    }


    protected List<TreeNode> doGenerate(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        if(start > end){
            res.add(null);
            return res;
        }

        for(int i=start; i<=end; i++){
            List<TreeNode> leftChildPossible = doGenerate(start, i - 1);
            List<TreeNode> rightChildPossible = doGenerate(i+1, end);

            for(TreeNode leftSubRoot : leftChildPossible){
                for(TreeNode rightSubRoot : rightChildPossible){
                    TreeNode root = new TreeNode(i);
                    root.left = leftSubRoot;
                    root.right = rightSubRoot;
                    res.add(root);
                }
            }
        }
        return res;

    }

}
