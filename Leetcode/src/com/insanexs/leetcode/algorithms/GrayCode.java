package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrayCode {
	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> grayCode(int n) {
        if(n <= 0)
			return list;
        int[] code = new int[n];
        Arrays.fill(code, 0);
        list.add(0);
        addCodeToInt(code, n-1);
        return list;
    }
	
	private void addCodeToInt(int[] code, int right){
		if(right < 0)
			return;
		for(int i=0; i<=right; i++){
			code[i] = code[i] ^ 1;
			list.add(binaryToInt(code));
			addCodeToInt(code, i-1);
		}
	}
	private int binaryToInt(int[] code){
		int num = 0;
		for(int i=0; i<code.length; i++){
			num = num * 2 + code[i];
		}
		return num;
	}
	
	public static void main(String[] args){
		System.out.println(new GrayCode().grayCode(1));
	}
}
