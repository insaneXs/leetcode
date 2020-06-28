package com.insanexs.leetcode.algorithms;

public class FactorialTrailingZeros {
	public int trailingZeroes(int n) {
		int ans = 0;
		double dev = 5;
		while(dev <= n){
			ans = ans +(int)(n /dev);
			dev = dev * 5;
		}
		return ans;
	}
}
