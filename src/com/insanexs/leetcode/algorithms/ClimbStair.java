package com.insanexs.leetcode.algorithms;

public class ClimbStair {
	public int ClimbStairs(int n){
		if(n <= 0)
			return 0;
		double ans = 1;
		for(int i=1; i*2 <= n + 1 ; i++){
			ans = ans + getA(i,n - i) / getA(i,i);
		}
		return (int)ans;
	}
	private  double getA(int upLabel, int downLabel){
		double res = 1;
		int start = downLabel;
		for(int i = 0; i < upLabel; i++){
			res = res * start;
			start--;
		}
		return res;
	}
	public static void main(String[] args){
		System.out.println(new ClimbStair().getA(3, 5));
		System.out.println(new ClimbStair().ClimbStairs(35));
	}
}
