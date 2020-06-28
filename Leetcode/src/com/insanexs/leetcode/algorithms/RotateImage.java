package com.leetCode.oj;

public class RotateImage {
	private int times = 0;
	public void rotate(int[][] matrix){
		int length = matrix.length;
		if(times * 2 < length){
			for(int i=0; i <length - 1- 2 * times; i++){
				int temp1 = matrix[times + i][ length - 1 - times];
				matrix[times + i][length- 1 -times] = matrix[times][times + i];
				int temp2 = matrix[length -1- times][length - 1 - times - i];
				matrix[length - times - 1][length - 1 - times - i] = temp1;
				matrix[times][times + i] = matrix[length- 1- times - i][times];
				matrix[length - 1 - times - i][times] = temp2;			
				}
			times++;
			rotate(matrix);
		}
	}
}
