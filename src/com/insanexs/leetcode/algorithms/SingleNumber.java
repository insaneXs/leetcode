package com.insanexs.leetcode.algorithms;



public class SingleNumber {
	public static int singleNumber(int[] A){
		int i = 0;;
		while(i<A.length){
			System.out.println("i = "+i);
			for (int j = A.length - 1; j > i; j--) {
				System.out.println("j = "+j);
				if (A[j] == A[i])
					break;
				if (i == j-1){
					return A[i] ;
				}
			}
			i++;
		}
		return A[i-1];	
	}
	public static void main(String[] args){
		int[] A = {2,2,1};
		int i = singleNumber(A);
		System.out.println(i);
	}
}
