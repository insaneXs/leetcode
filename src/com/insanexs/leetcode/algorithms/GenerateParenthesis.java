package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	private List<String> list = new ArrayList<String>();
	private int sum =0;
	public List<String> generateParenthesis(int n){
		sum = n;
		generate(n, "");
		return list;
	}
	
	private void generate(int n,String s){
		StringBuffer sb = new StringBuffer(s);
		if(n == 0){
			for(int i=0; i<2*sum-s.length(); i++)
				sb.append(')');
			list.add(sb.toString());
		}else{
			int index = n;
			char[] chars = s.toCharArray();
			int count = 0;
			for(int i=0; i<chars.length; i++){
				if(chars[i] == '('){
					count++;
				}else if(chars[i] == ')'){
					count--;
				}
			}
			if(count > 0){
				generate(n, sb.toString()+")");
			}
			sb.append('(');
			generate(--index,sb.toString());
		}
	}
	public static void main(String[] args){
		System.out.println(new GenerateParenthesis().generateParenthesis(2));
	}
}
