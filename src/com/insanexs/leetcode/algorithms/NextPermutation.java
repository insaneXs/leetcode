package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

/**
 * @ClassName NextPermutation
 * @Description Next Permutation #31 (Medium)
 * @Author xieshang
 * @Date 2020/7/15 5:30 下午
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 1) {
            return;
        }
        int lastNum = nums[nums.length - 1];
        int i = nums.length - 2 ;
        label:
        while(i >=0){
            if(nums[i] < lastNum){
                for(int j=nums.length -1; j>i; j--){
                    if(nums[j] > nums[i]){
                        swap(nums, i, j);
                        break label;
                    }
                }
            }else{
                lastNum = nums[i];
            }
            i--;
        }

        if(i < nums.length - 2){
            reserve(nums, i+1, nums.length -1);
        }

    }

    private void reserve(int[] nums, int start, int end){
        for(int i=0; i<= (end-start)/2; i++){
            swap(nums, start+i, end-i);
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args){
        int[] nums = {4,3,5,3,2,1};
        new NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
