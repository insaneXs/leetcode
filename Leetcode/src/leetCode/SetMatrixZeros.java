package leetCode;

import java.util.Arrays;

public class SetMatrixZeros {
	public void setZeros(int[][] matrix){
		if(matrix == null || matrix.length < 1)
			return;
		int rows = matrix.length;
		int cols = matrix[0].length;
		if(cols == 0)
			return;
		boolean[] rowFlag = new boolean[rows];
		boolean[] colFlag = new boolean[cols];
		for(int i=0 ; i<rows; i++){
			for(int j=0; j<cols; j++){
				if(matrix[i][j] == 0){
					if(!rowFlag[i])
						rowFlag[i] = true;
					if(!colFlag[j])
						colFlag[j] = true;
				}
			}
		}
		for(int i=0; i<rows; i++){
			if(rowFlag[i])
				Arrays.fill(matrix[i], 0);
		}
		for(int col=0; col<cols; col++){
			if(colFlag[col]){
				for(int row=0; row<rows; row++)
					matrix[row][col] = 0;
			}
		}
	}
	public static void main(String[] args){
		int[][] matrix = {{1},{0}};
		new SetMatrixZeros().setZeros(matrix);
		for(int[] array : matrix)
			System.out.println(Arrays.toString(array));
	}
}
