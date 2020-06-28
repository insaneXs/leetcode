package com.leetCode.oj;

import java.util.Arrays;

public class GenerateMatrix {
	int times = 0;
	int num = 1;
	public int[][] generateMatrix(int n){
		int[][] matrix = new int[n][n];
		subGenerate(matrix);
		return matrix;
	}
	private void subGenerate(int[][] matrix){
		if(matrix.length - 2 * times > 1){
			int step = matrix.length - 1 - 2 * times;
			for(int i = times; i < matrix.length - 1  -  times; i++){
				matrix[times][i] = num;
				matrix[i][matrix.length - 1 - times] = num + step;
				matrix[matrix.length -1 - times][matrix.length -1 - i ] = num + 2 *step;
				matrix[matrix.length -1 - i][times] = num + 3 * step;
				num++;
			}
			times++;
			num = num + 3 * step;
			subGenerate(matrix);
		}else if(matrix.length - 2 * times == 1){
			matrix[times][times] = num;
		}
	}
	public static void main(String[] args){
		int[][] matrix = new GenerateMatrix().generateMatrix(5);
		for(int i = 0; i< 5; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
