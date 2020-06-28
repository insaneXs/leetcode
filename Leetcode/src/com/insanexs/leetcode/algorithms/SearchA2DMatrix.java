package com.insanexs.leetcode.algorithms;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix,int target){
		if(matrix == null || matrix.length < 1)
			return false;
		if(matrix[0] == null || matrix[0].length < 1)
			return false;
		int rows = matrix.length; //��
		int cols = matrix[0].length; //��
		int start = 0, end = rows - 1;
		while(start + 1 < end){
			int mid = (start + end) / 2;
			if(matrix[mid][0] == target){
				return true;
			}else if(matrix[mid][0] > target){
				end = mid;
			}else{
				start = mid;
			}
		}
		if(matrix[end][0] <= target)
			rows = end;
		else if(matrix[start][0] <= target)
			rows = start;
		else
			return false;
		start = 0;
		end = cols - 1;
		while(start + 1 < end){
			int mid = (start + end) / 2;
			if(matrix[rows][mid] == target){
				return true;
			}else if(matrix[rows][mid] > target){
				end = mid;
			}else{
				start = mid;
			}
		}
		if(matrix[rows][start] == target || matrix[rows][end] == target)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		new SearchA2DMatrix().searchMatrix(matrix, 30);
	}
}
