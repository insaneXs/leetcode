package com.insanexs.leetcode.algorithms;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        List<Integer> list = new LinkedList<Integer>();
        helper(k, n, 1, 0, ans, list);
        return ans;
    }
	
	public void helper(int k, int n, int start, int sum, List<List<Integer>> ans, List<Integer> list){
		if(sum == n && list.size() == k){
			ans.add(new LinkedList<Integer>(list));
			return;
		}
		if(sum > n || list.size() > k)
			return;
		
		for(int i=start; i<10; i++){
			sum += i;
			list.add(i);
			helper(k, n , i+1, sum, ans, list);
			sum -= i;
			list.remove(new Integer(i));
		}
	}
	
	public static void main(String[] args){
		CombinationSum3 c3 = new CombinationSum3();
		System.out.println(c3.combinationSum3(3, 10));
	}
}
