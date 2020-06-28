package com.insanexs.leetcode.algorithms;

public class ValidPalindrome {
	public boolean isPalindrome(String s){
		if(s == null || s.equals(""))
			return true;
		String str = s.toLowerCase();
		char[] chars = str.toCharArray();
		int start = 0;
		int end = chars.length - 1; 
		for(; start < end;){
			if(!((48<=chars[start] && chars[start]<= 57 )|| ( 97<=chars[start])&& chars[start]<=122)){
				start++;
				continue;
			}
			if(!((48<=chars[end] && chars[end]<= 57 )|| ( 97<=chars[end])&& chars[end]<=122)){
				end--;
				continue;
			}
			if(chars[start] != chars[end])
				return false;
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(new ValidPalindrome().isPalindrome("ABCD E g21,gedcba."));
	}
}
