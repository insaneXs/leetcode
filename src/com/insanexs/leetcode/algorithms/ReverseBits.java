package com.insanexs.leetcode.algorithms;

public class ReverseBits {
	public int reverseBits(int n){
		int ans = 0;
		int i = 32;
		while(i > 0){
			ans = ans << 1 | (n & 1);
			n = n >>> 1;
			i--;
		}
		return ans;
	}
	public static void main(String[] args){
		new ReverseBits().reverseBits(1);
	}
}
