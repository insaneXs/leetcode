package com.insanexs.leetcode.algorithms;

public class TrappingRainWater {
	public static int trap(int[] height){
		if(height == null || height.length < 1)
			return 0;
		int maxIndex = 0, max = 0;
		for(int i=0; i<height.length; i++){
			if(height[i] > max){
				max = height[i];
				maxIndex = i;
			}
		}
		int sum = 0, m = 0;
		for(int i=0; i<maxIndex; i++){
			if(height[i] > m){
				m = height[i];
			}
			sum = sum + m - height[i];
		}
		m = 0;
		for(int i=height.length -1; i>maxIndex; i--){
			if(height[i] > m){
				m = height[i];
			}
			sum = sum + m - height[i];
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(TrappingRainWater.trap(height));
	}
}
