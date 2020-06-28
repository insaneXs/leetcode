package com.insanexs.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(k < 1 || nums == null || nums.length < 2)
			return false;
		if(nums.length - 1 < k )
			k = nums.length - 1;
        Set<Integer> set = new HashSet<Integer>();
        int size = set.size();
        for(int i=0; i<= k; i++){
        	set.add(nums[i]);
        	if(size == set.size())
        		return true;
        	size = set.size();
        }
        for(int i= k + 1; i<nums.length; i++){
        	set.remove(nums[i - k - 1]);
        	set.add(nums[i]);
        	if(set.size() != size )
        		return true;
        }
        return false;
    }
	public static void main(String[] args){
		int[] nums = new int[]{1,2,1};
		System.out.println(new ContainsDuplicate2().containsNearbyDuplicate(nums, 1));
	}
}
