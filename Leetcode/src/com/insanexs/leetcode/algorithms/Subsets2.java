package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
	Integer lastRemove = null; 
	public List<List<Integer>> subsetsWithDup(int[] num){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(num == null || num.length < 1)
			return res;
		Arrays.sort(num);
		for(int i=0; i<=num.length; i++){
			lastRemove = null;
			List<Integer> list = new ArrayList<Integer>();
			helper(i,0,num,res,list);
		}
		return res;
	}
	
	private void helper(int len, int left, int[] num, List<List<Integer>> res, List<Integer> list){
		if(list.size() == len){
			res.add(new ArrayList<Integer>(list));
			return;
		}
		
		for(int i=left; i<num.length; i++){
			if(lastRemove != null && num[i] == lastRemove)
				continue;
			list.add(num[i]);
			helper(len,i+1,num,res,list);
			lastRemove = list.remove(list.size() - 1);
		}
	}
	
	public static void main(String[] args){
		int[] num = {1,2,2};
		System.out.println(new Subsets2().subsetsWithDup(num));
	}
}