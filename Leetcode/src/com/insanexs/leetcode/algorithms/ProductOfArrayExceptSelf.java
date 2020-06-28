package com.insanexs.leetcode.algorithms;

import java.util.Arrays;


public class ProductOfArrayExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length <= 1)
        	return new int[0];
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i=1; i<nums.length; i++){
        	ans[i] = ans[i - 1] * nums[i - 1];
        }
        int pro = 1;
        for(int i=nums.length - 2; i>=0; i--){
        	pro *= nums[i + 1];
        	ans[i] = pro * ans[i];
        }
        return ans;
    }
	
	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(ProductOfArrayExceptSelf.productExceptSelf(nums)));
	}
}
