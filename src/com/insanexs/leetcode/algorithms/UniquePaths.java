package com.insanexs.leetcode.algorithms;

public class UniquePaths {
	public int uniquePaths(int m, int n){
		m--;
		n--;
		return (int)Math.rint(getC(m, m+n));
	}
	private double getA(int up, int down){
		return product(down) / product(down - up);
	}
	private double getC(int up, int down){
		return getA(up,down) / product(up);
	}
	private double product(int n){
		if(n == 1 || n == 0)
			return 1;
		else 
			return n * product(n -1);
	}
	public static void main(String[] args){
		System.out.println(new UniquePaths().uniquePaths(23, 12)); 
	}
}
