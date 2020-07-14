package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: xieshang
 * @Description: Letter Combinations of a Phone Number #17 (Medium)
 * @Date: Create at 2020-06-30
 */
public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args){
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("77"));
    }

    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if(digits == null || digits.contains("1")){
            return result;
        }
        int[] nums = new int[digits.length()];
        for(int i=0; i<digits.length(); i++){
            nums[i] = (digits.charAt(i)) - '0';
        }

        doMap(nums, new StringBuilder(), result);


        return result;
    }

    protected void doMap(int[] nums, StringBuilder builder, List<String> result){
        int level = builder.length();
        if(level >= nums.length){
            if(builder.length() > 0){
                result.add(builder.toString());
            }
            return;
        }

        int candidateLen = nums[level] == 9 || nums[level] == 7 ? 4 : 3;

        for(int i=0; i<candidateLen; i++){
            char candidate;
            if(nums[level] < 8){
                candidate = (char) ('a' + (nums[level] - 2) * 3 + i);
            }else{
                candidate = (char) ('t' + (nums[level] - 8) * 3 + i);
            }

            builder.append(candidate);
            doMap(nums, builder, result);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
