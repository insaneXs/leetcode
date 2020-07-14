package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author: xieshang
 * @Description: Combination Sum II #40 (Medium)
 * @Date: Create at 2020-07-10
 */
public class CombinationSumII {

    public static void main(String[] args){
//        int[] candidates = {10,1,2,7,6,1,5};
        int[] candidates = {1, 1, 1, 2, 5, 6, 7, 10};
        System.out.println(new CombinationSumII().combinationSum2(candidates, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> ret = new ArrayList<>();
        if(candidates == null){
            return ret;
        }

        Arrays.sort(candidates);

        Stack<Integer> stack = new Stack<>();
        int lastNum = candidates[0] - 1;
        for(int i=0; i<candidates.length; i++){
            if(candidates[i] == lastNum){
                continue;
            }
            doCombinationSum(candidates, target, i, 0, stack, ret);
            lastNum = candidates[i];
        }
        return ret;
    }

    protected void doCombinationSum(int[] candidates, int target, int index, int sum, Stack<Integer> stack, List<List<Integer>> ret){
        stack.push(candidates[index]);
        sum += candidates[index];
        System.out.println(stack);
        if(sum < target){
            Integer lastNum = null;
            for(int i=index+1; i<candidates.length; i++){
                if(null !=lastNum && candidates[i] == lastNum){
                    continue;
                }
                doCombinationSum(candidates, target, i, sum, stack, ret);
                lastNum = candidates[i];
            }

        }else if(sum  == target){
            ret.add(new ArrayList<>(stack));
        }

        stack.pop();
    }
}
