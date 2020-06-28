package com.insanexs.leetcode.algorithms;

import java.util.LinkedList;

public class AddBinary {
	public String addBinary(String a, String b){
		if(a == null || a.equals(""))
			return b;
		if(b == null || b.equals(""))
			return a;
		char[] num1 = a.toCharArray();
		char[] num2 = b.toCharArray();
		int lenA = num1.length - 1;
		int lenB = num2.length - 1;
		boolean needPlus = false;
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(lenA >= 0 && lenB >= 0){
			int sum = num1[lenA] + num2[lenB] - 96;
			if(needPlus){
				sum++;
				needPlus = false;
			}
			if(sum >= 2){
				needPlus = true;
				sum = sum - 2;
			}
			list.add(sum);
			lenA--;
			lenB--;
		}
		if(lenA < 0){
			while(lenB >= 0){
				if(needPlus){
					int sum = num2[lenB] - 48 + 1;
					if(sum < 2){
						needPlus = false;
						list.add(sum);
					}
					else
						list.add(0);
				}
				else
					list.add(num2[lenB] - 48);	
				lenB--;
			}
		}
		if(lenB < 0){
			while(lenA >= 0){
				if(needPlus){
					int sum = num1[lenA] - 48 + 1;
					if(sum < 2){
						needPlus = false;
						list.add(sum);
					}
					else 
						list.add(0);
				}
				else
					list.add(num1[lenA] - 48);
				lenA--;
			}
		}
		if(needPlus)
			list.add(1);
		StringBuffer sb = new StringBuffer();
		while(!list.isEmpty()){
			sb.append(list.removeLast());
		}
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(new AddBinary().addBinary("111","11"));
		LinkedList list1 = new LinkedList<>();
	}
}
