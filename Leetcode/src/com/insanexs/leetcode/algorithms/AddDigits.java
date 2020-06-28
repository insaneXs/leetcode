package com.insanexs.leetcode.algorithms;

public class AddDigits {
	public int addDigits(int num){
		return recursion(num);
	}
	
	private int recursion(int num){
		if(num < 10)
			return num;
		
		int sum = 0;
		while(num > 0){
			int newNum = num / 10;
			int res = num - 10 * newNum;
			sum += res;
			num = newNum;
		}
		return recursion(sum);
	}
	
	public static void main(String[] args){
		System.out.println(new AddDigits().addDigits(38));
	}
}
