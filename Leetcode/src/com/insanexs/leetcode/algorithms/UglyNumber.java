package com.insanexs.leetcode.algorithms;

public class UglyNumber {
	public boolean isUgly(int num){
		if(num <= 0)
			return false;
		else if(num == 1)
			return true;
		int res = num % 2;
		while(res == 0 ){
			num = num / 2;
			if(num == 1)
				return true;
			res = num % 2;
		}
		res = num % 3;
		
		while(res == 0){
			num = num / 3;
			if(num == 1)
				return true;
			res = num % 3;
		}
		
		res = num % 5;
		while(res == 0){
			num = num / 5;
			if(num == 1)
				return true;
			res = num % 5;
		}
		
		return false;
	}
	
}
