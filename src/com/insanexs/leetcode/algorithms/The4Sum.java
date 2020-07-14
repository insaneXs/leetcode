package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xieshang
 * @Description: 4Sum #18 (Medium)
 * @Date: Create at 2020-06-30
 */
public class The4Sum {
    public static void main(String[] args){
//        System.out.println(new The4Sum().fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
//        System.out.println(new The4Sum().fourSum(new int[]{0,0,0,0}, 0));
//        System.out.println(new The4Sum().fourSum(new int[]{1,0,-1,0,-2,2}, 0));

        System.out.println(new The4Sum().fourSum(new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums == null || nums.length < 4){
            return list;
        }
        Arrays.sort(nums);
        int lastI = nums[0] - 1;
        for(int i=0; i<nums.length-3; i++){
            if(nums[i] != lastI){
                int lastJ = nums[0] - 1;
                for(int j=i+1; j<nums.length-2; j++){
                    if(nums[j] != lastJ) {
                        int sum = nums[i] + nums[j];
                        list.addAll(find(nums, target-sum, i, j));
                        lastJ = nums[j];
                    }
                }
                lastI = nums[i];
            }

        }
        return list;
    }

    protected List<List<Integer>> find(int[] nums, int target, int firstIndex, int secondIndex){
        List<List<Integer>> list = new ArrayList<>();
        int i = secondIndex + 1;
        int j = nums.length - 1;
        int lastIVal = nums[i] - 1;
        int lastJVal = nums[j] + 1;

        while(i < j){
            if(nums[i] + nums[j] == target){
                if(nums[i] == lastIVal){
                    i++;
                }else if(nums[j] == lastJVal){
                    j--;
                }else{
                    List<Integer> ret = new ArrayList<>();
                    ret.add(nums[firstIndex]);
                    ret.add(nums[secondIndex]);
                    ret.add(nums[i]);
                    ret.add(nums[j]);

                    list.add(ret);

                    lastIVal = nums[i];
                    lastJVal = nums[j];
                    i++;
                    j--;
                }
            }else if(nums[i] + nums[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return list;
    }
}
