package com.insanexs.leetcode.algorithms;

public class MinimumPathSum {
	public static int minPathSum(int[][] grid){
		if(grid == null || grid.length < 1 || grid[0].length < 1)
			return 0;
		int m = grid.length;
		int n = grid[0].length;
		int[][] matrixSum = new int[m][n];
		matrixSum[0][0] = grid[0][0];
		
		for(int i=1; i<n; i++){
			matrixSum[0][i] = matrixSum[0][i - 1] + grid[0][i];
		}
		
		for(int i=1; i<m; i++){
			matrixSum[i][0] = matrixSum[i - 1][0] + grid[i][0];
		}
		
		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				matrixSum[i][j] = Math.min(matrixSum[i - 1][j], matrixSum[i][j - 1]) + grid[i][j];
			}
		}
		return matrixSum[m - 1][n - 1];
		
	}
	
	public static void main(String[] args){
		int[][] grid = {{1,2},{1,2}};
		System.out.println(minPathSum(grid));
	}
}
