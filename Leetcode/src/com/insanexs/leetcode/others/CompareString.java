package com.insanexs.leetcode.others;

import java.util.Random;

public class CompareString {
	private static final String IMPOSSIBLE = "IMPOSSIBEL";
	
	
	public String compare(String s, String t){
		if(s == null || t == null)
			return IMPOSSIBLE;
		int length1 = s.length();
		int length2 = t.length();
		
		if(length1 == length2 + 1)
			return convertSToTByDelete(s, t);
		else if(length1 + 1 == length2)
			return "Insert " + convertSTOTByInsert(s, t);
		else if(length1 == length2)
			return convertSToTBySwap(s, t);
		
		return IMPOSSIBLE;
	}
	
	private String convertSToTByDelete(String s, String t){
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		int i=0,j=0,index = -1;
		for(; i<c2.length; ){
			if(c1[i] != c2[j]){
				if(index == -1){
					index = i;
					i++;
				}else{
					return IMPOSSIBLE;
				}
			}
			i++;
			j++;
		}
		return "" + c1[index];
	}
	
	private String convertSTOTByInsert(String s, String t){
		return convertSToTByDelete(t, s);
	}
	
	private String convertSToTBySwap(String s, String t){
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		int index = -1;
		for(int i=0;  i<c1.length; i++){
			if(c1[i] != c2[i]){
				if(index != -1 || i == c1.length -1)
					return IMPOSSIBLE;
				else if(c1[i+1] == c2[i] && c1[i] == c2[i + 1]){
					index = i;
					i++;
				}else
					return IMPOSSIBLE;
			}
		}
		new Random().nextInt(1);
		return "" + c1[index] + c1[index + 1]; 
	}
}
