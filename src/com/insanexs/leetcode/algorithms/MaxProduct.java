package com.insanexs.leetcode.algorithms;

public class MaxProduct {
	public int maxProduct(int[] A){
		if(A.length < 1)
			return 0;
		int count = 0;
		int index = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] < 0){
				if(count == 0){
					count++;
					index = i;
				}else{
					count = 0;
				}
			}
		}
		return 1;
	}
}
