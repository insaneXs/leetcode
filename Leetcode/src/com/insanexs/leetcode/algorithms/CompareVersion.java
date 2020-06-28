package com.insanexs.leetcode.algorithms;

import java.util.Arrays;
import java.util.LinkedList;


public class CompareVersion {
	public int compareVersion(String version1, String version2){
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(version1.split("\\.")));
		LinkedList<String> list2 = new LinkedList<String>(Arrays.asList(version2.split("\\.")));
		if(list1.isEmpty())
			list1.add(version1);
		if(list2.isEmpty())
			list2.add(version2);
		int i = 0;
		int num1,num2;
		for(; i<list1.size(); i++){
			if(i == list2.size()){
				while(i < list1.size()){
					num1= Integer.parseInt(list1.get(i));
					if(num1 != 0){
						return 1;
					}
					i++;
				}
				return 0;
			}
			num1 = Integer.parseInt(list1.get(i));
			num2 = Integer.parseInt(list2.get(i));
			if( num1 > num2)
				return 1;
			else if(num1 < num2)
				return -1;	
		}
		if(i == list1.size()){
			while(i < list2.size()){
				num2 = Integer.parseInt(list2.get(i));
				if(num2 != 0)
					return -1;
				i++;
			}
			return 0;
		}
		else 
			return 0;
	}
	public static void main(String[] args){
		System.out.println(new CompareVersion().compareVersion("19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.00.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000" , "19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000"));
	}
}
