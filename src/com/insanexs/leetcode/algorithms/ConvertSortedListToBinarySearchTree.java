package com.insanexs.leetcode.algorithms;

import com.insanexs.leetcode.base.ListNode;

/**
 * @ClassName ConvertSortedListToBinarySearchTree
 * @Description Convert Sorted List To Binary Search Tree #109 (Medium)
 * @Author xieshang
 * @Date 2020/7/24
 */
public class ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head){
        if(head == null){
            return null;
        }
        ListNode node = head;
        int length = 1;
        while(node.next != null){
            node = node.next;
            length++;
        }
        return covert(head, length);
    }

    private TreeNode covert(ListNode head, int length){
        TreeNode root = null;
        int rootIdx = length / 2;
        ListNode node = head;
        for(int i=0; i<=rootIdx; i++){
            if(i == rootIdx){
                root = new TreeNode(node.val);
                break;
            }
            node = node.next;
        }
        int leftLen = rootIdx;
        int rightLen = length - leftLen - 1;
        if(rootIdx > 0){
            root.left = covert(head, leftLen);
        }
        if(rightLen > 0){
            root.right = covert(node.next, rightLen);
        }
        return root;
    }
}
