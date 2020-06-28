package com.leetCode.oj;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s){
		int index = s.lastIndexOf(' ');
		while(index == s.length() -1){
			if(index < 0)
				return 0;
			s = s.substring(0, index);
			index = s.lastIndexOf(' ');
		}
		return s.length()-1 - index;
	}
	public static void main(String[] args){
		System.out.println(lengthOfLastWord(""));
	}
}
