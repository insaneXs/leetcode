package com.leetCode.oj;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs){
		if(strs == null || strs.length == 0)
			return null;
		String minLengthStr = strs[0];
		for(int i=1; i<strs.length; i++){
			if(strs[i].length() < minLengthStr.length())
				minLengthStr = strs[i];
		}
		for(int i=minLengthStr.length(); i>=0; i--){
			String prefix = minLengthStr.substring(0, i);
			int index = 0;
			for(; index < strs.length; index++){
				if(!strs[index].startsWith(prefix))
					break;
			}
			if(index == strs.length)
				return prefix;
		}
		return "";
	}
	public static void main(String[] args){
		String[] strs = {"aa","ae","as","bc"};
		LongestCommonPrefix a = new LongestCommonPrefix();
		System.out.println(a.longestCommonPrefix(strs));
	}
}
