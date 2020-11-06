package com.insanexs.leetcode.algorithms;

/**
 * @ClassName ThirdMaximumNumber
 * @Description Third Maximum Number #414 Third Maximum Number
 * @Author xieshang
 * @Date 2020/11/6
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums){
        int firstIdx = -1, secondIdx = -1, thirdIdx = -3;

        for(int i=0; i<nums.length; i++){
            if(firstIdx == - 1 || nums[firstIdx] <= nums [i]){
                if(firstIdx != - 1 && nums[firstIdx] == nums [i]){
                    continue;
                }
                thirdIdx = secondIdx;
                secondIdx = firstIdx;
                firstIdx = i;
            } else if(secondIdx == - 1 || nums[secondIdx] <= nums[i]){
                if(secondIdx != - 1 && nums[secondIdx] == nums[i]){
                    continue;
                }
                thirdIdx = secondIdx;
                secondIdx = i;
            }else if(thirdIdx == -1 || nums[thirdIdx] < nums[i]){
                thirdIdx = i;
            }
        }

        return thirdIdx == -1 ?  nums[firstIdx] : nums[thirdIdx];
    }

    public static void main(String[] args){
        //test case
        // nums.length  < 3

        //nums 重复

        //普通
    }
}
