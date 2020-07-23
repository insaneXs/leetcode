package com.insanexs.leetcode.algorithms;

/**
 * @ClassName ConstructBinaryTreeFromInorderAndPostorderTraversal
 * @Description Construct Binary Tree From Inorder And Postorder Traversal #106 (Medium)
 * @Author xieshang
 * @Date 2020/7/22 7:07 下午
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder){
        if(inorder == null || inorder.length == 0){
            return null;
        }
        return doBuild(inorder, postorder, 0, 0, postorder.length);
    }

    public TreeNode doBuild(int[] inorder, int[] postorder, int inorderIdx, int postorderIdx, int length){
        TreeNode root = new TreeNode(postorder[postorderIdx + length - 1]);

        int idx = inorderIdx;
        for(; idx<inorderIdx + length; idx++){
            if(inorder[idx] == postorder[postorderIdx + length - 1]){
                break;
            }
        }
        int leftLen = idx - inorderIdx;
        if(leftLen > 0){
            root.left = doBuild(inorder, postorder, inorderIdx, postorderIdx, leftLen);
        }

        int rightLen = inorderIdx + length - idx - 1;
        if(rightLen  > 0){
            root.right = doBuild(inorder, postorder, idx + 1, postorderIdx + leftLen, rightLen );
        }


        return root;
    }
}
