package com.insanexs.leetcode.algorithms;

import java.util.*;

/**
 * @Author: xieshang
 * @Description: #15 3Sum (Medium)
 * @Date: Create at 2020-06-29
 */
public class The3Sum {

    public static void main(String[] args){
        System.out.println(new The3Sum().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return result;
        Arrays.sort(nums);
        int lastNum = nums[0] - 1;
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (nums[i] != lastNum) {
                result.addAll(find(nums, i));
                lastNum = nums[i];
            }
        }
        return result;
    }

    private ArrayList<List<Integer>> find(int[] array, int index) {

        int i = index + 1;
        int j = array.length - 1;
        int lastI = array[index] - 1;
        int lastJ = array[index] - 1;

        ArrayList<List<Integer>> lists = new ArrayList<>();

        //关键在于有序数组求和时双指针的移动！
        while (i < j) { //两个指针相撞时，说明可能的情况均已遍历过了
            if (array[i] + array[j] + array[index] == 0) {
                //排除重复情况
                if (array[i] == lastI) {
                    i++;
                } else if (array[j] == lastJ) {
                    j--;
                } else {
                    lastI = array[i];
                    lastJ = array[j];
                    ArrayList<Integer> curList = new ArrayList<Integer>();
                    curList.add(array[i]);
                    curList.add(array[j]);
                    curList.add(array[index]);
                    lists.add(curList);
                    i++;
                    j--;
                }
            } else if (array[i] + array[j] + array[index] > 0) { //如果值偏大 最大值前移 使得和减小
                j--;
            } else { //如果值太小 让较小的值增大 使得和增大
                i++;
            }
        }
        return lists;
    }
}
