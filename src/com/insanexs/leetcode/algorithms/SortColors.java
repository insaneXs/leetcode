package com.insanexs.leetcode.algorithms;

public class SortColors {
	public void sortColors(int[] A){
		
	}
	
	public void quickSort(int[] A,int left,int right){
		if(left < right){
			int mid = getMid(A,left,right);
			quickSort(A,left,mid-1);
			quickSort(A,mid+1,right);
		}
	}
	
	
	public int getMid(int[]A,int left,int right){
		int temp = A[left];
		while(left < right){
			while(A[right] >= temp && right > left){
				right--;
			}
			A[left] = A[right];
			while(A[left] <= temp && left < right){
				left++;
			}
			A[right] = A[left];
		}
		A[left] = temp;
		return left;
	}
	
	public static void main(String[] args){
		int[] A = {2,3,2};
		new SortColors().quickSort(A, 0, A.length-1);
		for(int i : A)
			System.out.print(i+" ");
	}
}
