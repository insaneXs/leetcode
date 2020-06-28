package com.insanexs.leetcode.algorithms;

public class ZigzagConersion {
	public String convert(String s, int nRows){
		if(s == null || s.equals("") || nRows == 1)
			return s;
		StringBuffer sb = new StringBuffer();
		char[] chars = s.toCharArray();
		for(int i=0; i < nRows; i++ ){
			int n = 0;
			while(n * (nRows -1)  + i< chars.length){
				sb.append(chars[n * (nRows -1) + i]);
				n += 2;
				if(i != 0 && i != nRows-1){
					int index = n * (nRows -1) - i;
					if(index < chars.length)
						sb.append(chars[index]);
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(new ZigzagConersion().convert("A", 1));
	}
}
