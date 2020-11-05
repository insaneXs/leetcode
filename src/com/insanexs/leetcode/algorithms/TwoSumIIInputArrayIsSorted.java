package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

/**
 * @ClassName TwoSumIInputArrayIsSorted
 * @Description Two SumII-Input Array is Sorted #161 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target){
        if(numbers == null){
            return null;
        }
        int[] res = new int[2];
        int i=0, j=numbers.length -1;
        while(i <= j){
            if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args){
        TwoSumIIInputArrayIsSorted alg = new TwoSumIIInputArrayIsSorted();
        System.out.println(Arrays.toString(alg.twoSum(new int[]{2,7,11,15}, 16)));
    }
}
