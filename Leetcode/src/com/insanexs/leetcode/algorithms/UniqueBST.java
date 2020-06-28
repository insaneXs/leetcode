package com.insanexs.leetcode.algorithms;

public class UniqueBST {
	public int numTrees(int n){
		return nums(1,n);
	}
	private int nums(int down, int up){
		if(down >= up){
			return 1;
		}
		int ans = 0;
		for(int i = down; i <= up; i++){
			ans = ans + nums(down,i -1) * nums(i+1, up);
		}
		return ans;
	}
	public static void main(String[] args){
		System.out.println(new UniqueBST().numTrees(2));
	}
}
