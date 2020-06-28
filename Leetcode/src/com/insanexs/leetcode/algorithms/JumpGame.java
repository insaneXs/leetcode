package com.insanexs.leetcode.algorithms;

public class JumpGame {
	public boolean canJump(int[] A){
		if(A == null || A.length < 1)
			return true;
		int maxStep = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] == 0 && maxStep <= i){
				if(i == A.length - 1)
					return true;
				return false;
			}
			maxStep = Math.max(maxStep, i+A[i]);
		}
		return true;
	}
}
