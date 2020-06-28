package com.insanexs.leetcode.algorithms;

public class SildingWindowMaximum {
	public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < 1)
        	return new int[0];
        int[] ans = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
        	if(nums[i] > max)
        		max = nums[i];
        }
        ans[0] = max;
        for(int i=k; i<nums.length; i++){
        	if(nums[i] >= max){
        		ans[i - k + 1] = nums[i];
        		max = nums[i];
        	}else if(nums[i - k] == max){
        		max = nums[i];
        		for(int j=i-k + 1; j<i; j++){
        			if(nums[j] > max)
        				max = nums[j];
        		}
        		ans[i - k + 1] = max;
        	}else{
        		ans[i - k + 1] = max;
        	}
        }
        return ans;
    }	
}
