package com.insanexs.leetcode.algorithms;

public class SearchInRotate {
	public int search(int[] A, int target){
		if(A == null || A.length < 1)
			return -1;
		Integer breakPoint = null;
		int pre = Integer.MIN_VALUE;
		for(int i=0; i<A.length; i++){
			if(target == A[i])
				return i;
			if( pre > A[i] )
				breakPoint = i;
			if(target < A[i]){
				if(breakPoint != null)
					return -1;
			}
			pre = A[i];
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] A = {5,1,3};
		System.out.println(new SearchInRotate().search(A, 3));
	}
}
