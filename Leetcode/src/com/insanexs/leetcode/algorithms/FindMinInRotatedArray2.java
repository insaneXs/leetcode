package com.insanexs.leetcode.algorithms;

public class FindMinInRotatedArray2 {
	public int finMin(int[] num){
		if(num == null || num.length < 1)
			return 0;
		int min = num[0];
		for(int i=1; i<num.length; i++){
			if(min > num[i]){
				min = num[i];
				break;
			}
		}
		return min;
	}
}
