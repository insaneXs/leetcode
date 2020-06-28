package com.leetCode.oj;

public class PalindromeNumber {
	public boolean isPalindrome(int x){
		int reverse = 0;
		int num  = x;
		while(num > 0){
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		if(reverse == x)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		System.out.println(new PalindromeNumber().isPalindrome(12));
	}
}
