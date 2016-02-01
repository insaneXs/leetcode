package leetCode;


public class UniquePath2 {
	//递归做法，超时
	private int count = 0;
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid == null || obstacleGrid.length == 0)
			return 0;
		helper(obstacleGrid, 0, 0);
        return count;
    }
	
	private void helper(int[][] obstacleGrid, int i, int j){
		if(i == obstacleGrid[0].length - 1 && j == obstacleGrid.length - 1){
			count++;
			return;
		}
		if(i + 1 < obstacleGrid.length && obstacleGrid[i + 1][j] != 1){
			helper(obstacleGrid, i+1, j);
		}
		
		if(j + 1 < obstacleGrid[0].length && obstacleGrid[i][j + 1] != 1){
			helper(obstacleGrid, i, j+1);
		}
	}
	
	//方法二
	public int uniquePathsWithObstaclesVer2(int[][] obstacleGrid) {
		if(obstacleGrid == null || obstacleGrid.length == 0 )
			return 0;
		int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];
		if(obstacleGrid[0][0] != 1)
			arr[0][0] = 1;
		for(int i=1; i<arr.length; i++){
			if(obstacleGrid[i][0] == 1 || arr[i - 1][0] == 0)
				arr[i][0] = 0;
			else
				arr[i][0] = 1;
		}
		
		for(int j=1; j< arr[0].length; j++){
			if(obstacleGrid[0][j] == 1 || arr[0][j - 1] == 0)
				arr[0][j] = 0;
			else
				arr[0][j] = 1;
		}
		
		for(int i=1; i<arr.length; i++){
			for(int j=1; j<arr[0].length; j++){
				if(obstacleGrid[i - 1][j] != 1)
					arr[i][j] += arr[i - 1][j];
				if(obstacleGrid[i][j - 1] != 1){
					arr[i][j] += arr[i][j - 1];
				}
			}
		}
		return arr[arr.length - 1][arr[0].length - 1];
	}
	
	
	public static void main(String[] args){
		UniquePath2 u = new UniquePath2();
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{1,0,0}};
//		int[][] obstacleGrid = {{0,0}};
		System.out.println(u.uniquePathsWithObstaclesVer2(obstacleGrid));
	}
}
