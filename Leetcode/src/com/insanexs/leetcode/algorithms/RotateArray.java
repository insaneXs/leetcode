package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

public class RotateArray {
	public static void rotate(int[] nums, int k){
		if(nums == null || nums.length < 1)
			return;
		int realK = k % nums.length;
		if(realK == 0)
			return;
		int[] temp = new int[nums.length];
		
		for(int i=0; i<temp.length; i++){
			temp[i] = nums[i];
		}
		int rotateIndex = nums.length - realK; 
		for(int i=0; i<nums.length; i++){
			nums[i] = temp[(rotateIndex + i) % temp.length];
		}
		
	}
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums,3);
		System.out.println(Arrays.toString(nums));
	}
}
