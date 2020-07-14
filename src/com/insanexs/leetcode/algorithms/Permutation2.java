package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Permutations II #47 (Medium)
 */
public class Permutation2 {
	public List<List<Integer>> permuteUnique(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums == null || nums.length < 1)
			return res;
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> index = new ArrayList<Integer>();
		helper(nums, list, res, index);
		return res;
	}

	public void helper(int[] num,List<Integer> list,List<List<Integer>> res,List<Integer> index){
		if(list.size() == num.length){
			res.add(new ArrayList<Integer>(list));
			return;
		}
		int lastNum = num[0] - 1;
		for(int i=0; i<num.length; i++){
			if(index.contains(i) || lastNum == num[i])
				continue;
			lastNum = num[i];
			list.add(num[i]);
			index.add(i);
			helper(num, list, res, index);
			list.remove(list.size() - 1);
			index.remove(index.size() - 1);
		}
	}
	
	public static void main(String[] args){
		int[] num = {1,1,2,3};
		System.out.println(new Permutation2().permuteUnique(num));
	}
}
