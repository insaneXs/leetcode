package com.insanexs.leetcode.algorithms;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n){
		if(n <= 0)
			return false;
		else if(n == 1)
			return true;
		String str = Integer.toBinaryString(n);
		return str.indexOf("1", 1) == -1; 
	}
	
}	
