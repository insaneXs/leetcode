package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

public class Merge {
	public void merge(int[] A,int m, int[] B, int n){
		int x = 0,
			y = 0,
			index = 0;
		int[] array = new int[m+n];
		while(x < m && y < n){
			if(A[x] <= B[y]){
				array[index++] = A[x++]; 
			}else
				array[index++] = B[y++];
		}
		if(x == m){
			while(y < n){
				array[index++] = B[y++];
			}
		}else{
			while(x < m){
				array[index++] = A[x++];
			}
		}
		System.arraycopy(array, 0, A, 0, index);
	}
	public static void main(String[] args){
		int[] A = new int[10];
		A[0] = 1;
		A[1] = 3;
		int[] B = {2,4};
		new Merge().merge(A, 2, B, 2);
		System.out.println(Arrays.toString(A));
	}
}
