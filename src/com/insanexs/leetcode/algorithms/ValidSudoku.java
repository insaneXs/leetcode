package com.insanexs.leetcode.algorithms;


public class ValidSudoku {
	public boolean isValidSudoku(char[][] board){
		return checkBolck(board) && checkStrip(board);
	}
	private boolean isValid(char[][] board, int x1, int x2, int y1, int y2){
		char[] chars = new char[9];
		for(int i = x1; i <= x2; i++){
			for(int j = y1; j <= y2 ; j++){
				int num = board[i][j] - 48;
				if(num > 0 && num <= 9){
					if(++chars[--num] > 1)
						return false;
				}else if(num != '.'-48)
					return false;
			}
		}
		return true;
	}
	private boolean checkBolck(char[][] board){
		for(int i=0; i < 3; i++)
			for(int j=0; j<3; j++)
				if(!isValid(board, 3*i, 3*i+2, 3*j, 3*j+2))
					return false;
		return true;
	}
	private boolean checkStrip(char[][] board){
		for(int i=0; i < 9; i++){
			if(!isValid(board, i, i, 0, 8))
				return false;
			if(!isValid(board, 0, 8, i, i))
				return false;
		}
		return true;
	}
}
