package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FindAllNumbersDisappearedInAnArray
 * @Description Find All Numbers Disappeared In a Array #448 (Easy)
 * @Author xieshang
 * @Date 2020/11/6
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ret = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int correctIndex = nums[i] - 1;
            if(nums[correctIndex] != nums[i]){
                int tmp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = tmp;
                i--;
            }

        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                ret.add(i+1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
