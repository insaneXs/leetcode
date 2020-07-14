package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

/**
 * @Author: xieshang
 * @Description: #16 3SumClosest (Medium)
 * @Date: Create at 2020-06-29
 */
public class The3SumClosest {

    public static void main(String[] args){
        System.out.println(new The3SumClosest().threeSumClosest(new int[]{1,2,4,8,16,32,64,128
        }, 82));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length - 2; i++){
            closestSum = findClosestSum(nums, i, target, closestSum);
        }
        return closestSum;
    }

    public int findClosestSum(int[] nums, int index, int target, int closestSum){
        int i = index + 1;
        int j = nums.length - 1;
        while(i < j){
            int tmp = nums[index] + nums[i] + nums[j];
            if(Math.abs(tmp - target) < Math.abs(closestSum - target)){
                closestSum = tmp;
            }

            if(tmp == target){
                break;
            }else if(tmp < target){
                i++;
            }else{
                j--;
            }
        }
        return closestSum;
    }
}
