package com.insanexs.leetcode.others;

public class MoveChar {
	public String move(String str){
		if(str == null || str.length() == 0)
			return str;
		char[] chars = str.toCharArray();
		int lastStar = 0;
		for(int i=0; i<chars.length; i++){
			if(chars[i] == '*'){
				char temp;
				for(int j=i; j>lastStar; j--){
					temp = chars[j];
					chars[j] = chars[j - 1];
					chars[j - 1] = temp;
				}
				lastStar++;
			}
		}
		String newStr = new String(chars);
		return newStr;
	}
	
	public static void main(String[] args){
		String str = "****a*b*c*";
		System.out.println(new MoveChar().move(str));
	}
}
