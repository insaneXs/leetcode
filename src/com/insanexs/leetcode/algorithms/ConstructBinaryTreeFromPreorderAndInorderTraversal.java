package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

/**
 * @ClassName ConstructBinaryTreeFromPreorderAndInorderTraversal
 * @Description Construct Binary Tree From Preorder and Inorder Traversal #105 (Medium)
 * @Author xieshang
 * @Date 2020/7/21 7:52 下午
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder){
        return doBuild(preorder, inorder);
    }

    public TreeNode doBuild(int[] preorder, int[] inorder){
        int rootIdx = 0;
        if(preorder == null || preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[rootIdx]);

        for( ;rootIdx<inorder.length; rootIdx++){
            if(inorder[rootIdx] == preorder[0]){
                break;
            }
        }

        if(rootIdx > 0){
            int[] newPreOrder = Arrays.copyOfRange(preorder, 1, rootIdx + 1);
            int[] newInOrder = Arrays.copyOfRange(inorder, 0, rootIdx);
            root.left = doBuild(newPreOrder, newInOrder);
        }

        if(rootIdx < preorder.length - 1){
            int[] newPreOrder = Arrays.copyOfRange(preorder, rootIdx + 1, preorder.length);
            int[] newInOrder = Arrays.copyOfRange(inorder, rootIdx + 1, inorder.length);
            root.right = doBuild(newPreOrder, newInOrder);
        }
        return root;
    }
}
