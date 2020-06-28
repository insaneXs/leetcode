package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

public class MajorityElement {
	public int majorityElement(int[] num){
		Arrays.sort(num);
		int pre = num[0];
		int len = 1;
		for(int i=1; i<num.length; i++){
			if(num[i] == pre){
				len++;
			}else{
				if(len > num.length /2)
					return pre;
				else{
					pre = num[i];
					len = 1;
				}
			}
		}
		return pre;
	}
}
