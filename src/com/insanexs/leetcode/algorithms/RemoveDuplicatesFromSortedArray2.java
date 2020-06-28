package com.insanexs.leetcode.algorithms;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray2 {
	public static int removeDuplicates(int[] A){
		if(A.length < 1)
			return 0;
		int pre = A[0];
		int count = 1;
		List<Integer> list = new LinkedList<Integer>();
		list.add(A[0]);
		for(int i=1; i<A.length; i++){
			if(A[i] == pre && count < 2){
				count++;
				list.add(A[i]);
			}
			if(A[i] != pre){
				count = 1;
				list.add(A[i]);
				pre = A[i];
			}
		}
		int[] B = new int[list.size()];
		for(int i=0; i<list.size(); i++)
			B[i] = list.get(i);
		System.arraycopy(B,0, A, 0, B.length);
		return B.length;
	}
	public static void main(String[] args){
		int[] A = {1};
//		A[A.length-1] = null;
//		
		int index = removeDuplicates(A);
		System.out.println(index);
		for(int i : A)
			System.out.print(i+" ");
	}
}
