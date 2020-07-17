package com.insanexs.leetcode.algorithms;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.Arrays;

/**
 * @ClassName PermutationSeq
 * @Description Permutation Sequence #60 (Medium)
 * @Author xieshang
 * @Date 2020/7/17 4:18 下午
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        char[] chars = new char[n];
        for(int i=0; i<n; i++){
            chars[i] = (char)(i + '1');
        }
        while(k - 1 > 0){
            nextPermutation(chars);
            k--;
        }
        return new String(chars);
    }

    public void nextPermutation(char[] nums) {
        char lastNum = nums[nums.length - 1];
        int i = nums.length - 2;
        label:
        for (; i >= 0; i--) {
            if (nums[i] < lastNum) {
                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[j] > nums[i]) {
                        swap(nums, i, j);
                        break label;
                    }
                }
            } else {
                lastNum = nums[i];
            }
        }
        if (i + 1 < nums.length - 1) {
            reserve(nums, i + 1, nums.length - 1);
        }
    }

    private void reserve(char[] nums, int start, int end){
        for(int i=0; i<=(end-start)/2; i++){
            swap(nums, start+i, end-i);
        }
    }

    private void swap(char[]nums, int i, int j){
        char tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }

    public static void main(String[] args){
        System.out.println(new PermutationSequence().getPermutation(3, 3));
    }
}
