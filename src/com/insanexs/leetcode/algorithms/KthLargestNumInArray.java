package com.insanexs.leetcode.algorithms;

public class KthLargestNumInArray {
	public int findKthLargest(int[] nums, int k) {
		for(int i=0; i<k; i++){
			for(int j=1; j<nums.length - i; j++){
				if(nums[j -1] > nums[j]){
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
		return nums[nums.length - k];
	}
}
