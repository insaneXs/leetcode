package com.leetCode.oj;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] A) {
		if(A.length < 1)
			return 0;
		int length = 1;
		for(int i=0; i<A.length; i++){
			int temp = A[i];
			System.out.println("temp = "+temp);
			for(int j=i+1; j<A.length; j++){
				if(temp == A[j]){
					continue;
				}else{
					System.out.println("i = "+ i+" j = "+j);
					A[length] = A[j];
					i = (j-1);
					length++;
					break;
				}
			}
		}
		return length;
	}
	public static void main(String[] args){
		int[] A = {1,1,2,3};
		int l = new RemoveDuplicatesFromSortedArray().removeDuplicates(A);
		System.out.println(l);
		for(int i=0;i<l;i++)
			System.out.print(A[i]+" ");
	}
}
