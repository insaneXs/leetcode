package leetCode;

import java.util.Arrays;


public class LongestIncreasingPathInMatrix {
	private int[][] directions = {{-1,0}, {0, 1}, {1, 0}, {0, -1}};
	private int[][] records;
	
	public int longestIncreasingPathInMatrix(int[][] matrix){
		if(matrix == null || matrix.length <= 0)
			return 0;
		int row = matrix.length;
		int col = matrix[0].length;
		int longestPath = 0;
		records = new int[row][col];
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				int path = findPath(matrix, i, j);
				if(longestPath < path)
					longestPath = path;
			}
		}
		return longestPath;
	}
	
	private int findPath(int[][] matrix, int x, int y){
		if(records[x][y] == 0){
			int[] dirs = new int[4];
			Arrays.fill(dirs, 1);
			for(int i=0; i<dirs.length; i++){
				if(isParamleagel(x + directions[i][0], y + directions[i][1], matrix) && 
						matrix[x + directions[i][0]][y + directions[i][1]] > matrix[x][y]){
					dirs[i] += findPath(matrix, x + directions[i][0], y + directions[i][1]);
				}
			}
			int max = 0;
			for(int i: dirs){
				if(max < i)
					max = i;
			}
				
			records[x][y] = max;
		}
			return  records[x][y];
	}
	
	private boolean isParamleagel(int x, int y, int[][] matrix){
		return x>=0 && x<matrix.length && y>=0 && y< matrix[0].length;
	}
	
	public static void main(String[] args){
		LongestIncreasingPathInMatrix l = new LongestIncreasingPathInMatrix();
		
		int[][] matrix = {{3,4,5},{3,2,6},{2,2,1}};
		System.out.println(l.longestIncreasingPathInMatrix(matrix));
	}
}
