package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ValidateBinarySearchTree
 * @Description Validate Binary Search Tree #98 (Medium)
 * @Author xieshang
 * @Date 2020/7/21 3:23 下午
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        midOrder(root, list);

        boolean res = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)){
                res = false;
                break;
            }
        }
        return res;
    }


    protected void midOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        midOrder(root.left, list);
        list.add(root.val);
        midOrder(root.right, list);
    }
}
