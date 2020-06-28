package com.insanexs.leetcode.algorithms;

public class MaxSubarray {
	public int maxSubArray(int[] A){
		if(A == null || A.length == 0)
			return 0;
		int max = Integer.MIN_VALUE,sum = 0;
		for(int i=0; i<A.length; i++){
			sum += A[i];
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
		}
		return max;
	}
	
	public static void main(String[] args){
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new MaxSubarray().maxSubArray(A));
	}
}
