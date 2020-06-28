package com.insanexs.leetcode.algorithms;


public class Atoi {
	public int atoi(String str){
		if(str == null || str.equals(""))
			return 0;
		double ans = 0;
		int isNegative = 1;
		boolean numStart = false;
		char[] chars = str.toCharArray();
		int i = 0;
		for(; i< chars.length; i++){
			if(chars[i] == '-'){
				if(i == chars.length -1 || !Character.isDigit(chars[i+1]) || numStart)
					break;
				else
					isNegative = isNegative * -1;
			}else if(chars[i] == '+'){
				if(i == chars.length -1 || !Character.isDigit(chars[i+1]) || numStart)
				break;
			}else if(Character.isDigit(chars[i])){
				if(!numStart)
					numStart = true;
				ans = ans * 10 + (chars[i] - 48);
			}else if(chars[i] == ' '){
				if(numStart)
					break;
			}else
				break;
		}
		ans = ans * isNegative;
		if(ans > Integer.MAX_VALUE)
			ans = Integer.MAX_VALUE;
		else if(ans < Integer.MIN_VALUE)
			ans = Integer.MIN_VALUE;
		return (int)ans;
	}
	public static void main(String[] args){
		System.out.println(new Atoi().atoi("9223372036854775809"));
	}
}
