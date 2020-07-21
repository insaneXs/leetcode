package com.insanexs.leetcode.algorithms;

import java.util.*;

/**
 * @ClassName BinaryTreeZigzagLevelOrderTraversal
 * @Description Binary Tree Zigzag Level Order Traversal #103 (Medium)
 * @Author xieshang
 * @Date 2020/7/21 4:32 下午
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        boolean reverse = false;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode> tmp = new ArrayDeque<>();


            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node.left != null){
                    tmp.add(node.left);
                }
                if(node.right != null){
                    tmp.add(node.right);
                }
                list.add(node.val);
            }
            queue = tmp;
            if(reverse){
                Collections.reverse(list);
            }
            reverse = !reverse;
            res.add(list);

        }
        return res;
    }
}
