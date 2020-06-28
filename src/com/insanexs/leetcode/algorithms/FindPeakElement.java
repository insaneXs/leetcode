package com.insanexs.leetcode.algorithms;

public class FindPeakElement {
	public int findPeakElement(int[] num){
		if(num == null)
			return 0;
		int maxIndex = 0;
		for(int i=1; i<num.length; i++ ){
			if(num[i] > num[maxIndex]){
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
