package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

/**
 * @Author: xieshang
 * @Description: Find First And Last Position Of Element In Sorted Array #34 (Medium)
 * @Date: Create at 2020-07-10
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args){
        int[] nums = {1};
//        int[] nums =
        System.out.println(Arrays.toString(new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, 1)));
    }

    public int[] searchRange(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return new int[]{-1, -1};
        }
        int pre = divideTwoParts(nums, 0, nums.length-1, target, true);
        int last = divideTwoParts(nums, 0, nums.length-1, target, false);
        return new int[]{pre, last};
    }


    public int divideTwoParts(int[] nums, int begin, int end, int target, boolean isPrev){
        if(nums[begin] > target || nums[end] < target){
            return -1;
        }
        if(end - begin <= 1){
            if(isPrev){
                return nums[begin] == target ? begin : nums[end] == target ? end : -1;
            }else{
                return nums[end] == target ? end : nums[begin] == target ? begin : -1;
            }
        }
        int mid = (begin + end) / 2;
        if(nums[mid] > target){
            return divideTwoParts(nums, begin, mid, target, isPrev);
        }else if(nums[mid] == target){
            if(isPrev){
                return divideTwoParts(nums, begin, mid, target, isPrev);
            }else{
                return divideTwoParts(nums, mid, end, target, isPrev);
            }
        }else{
            return divideTwoParts(nums, mid, end, target, isPrev);
        }

    }

}
