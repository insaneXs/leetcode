package com.leetCode.oj;

public class LongestPalindrome {
	public static String longestPalindrome(String s){
		int len = s.length();
		while(len >= 1){
			for(int i=0; i+len<= s.length(); i++){
				String compare = s.substring(i, i+len);
				System.out.println(compare);
				char[] chars = compare.toCharArray();
				StringBuffer sb = new StringBuffer();
				for(int j= chars.length-1; j>=0; j--)
					sb.append(chars[j]);
				String reserve = new String(sb);
				if(reserve.equals(compare))
					return compare;
			}
			len--;
		}
		return null;
	}
	public static void main(String[] args){
		String s = "abb";
		System.out.println(longestPalindrome(s));
	}
}
