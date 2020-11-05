package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SummaryRanges
 * @Description Summary Ranges #228 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums){
        List<String> ret = new ArrayList<>();
        if(nums == null || nums.length <= 0){
            return ret;
        }

        int head = nums[0];
        int prev = head;
        for(int i=1; i<nums.length; i++){
            if(nums[i] - 1 == prev){
                prev =nums[i];
            }else{
                if(head == prev){
                    ret.add(head + "");
                }else{
                    ret.add(head + "->" + prev);
                }
                head = prev = nums[i];
            }
        }
        if(head == prev){
            ret.add(head + "");
        }else{
            ret.add(head + "->" + prev);
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
