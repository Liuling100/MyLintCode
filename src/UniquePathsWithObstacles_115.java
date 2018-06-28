public class UniquePathsWithObstacles_115 {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
    	if(obstacleGrid == null)
    		return 1;
    	
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	
    	int[][] sum = new int[m][n];
    	for(int i = 1; i < m; i++){
    		for(int j = 1; j < n; j++){
    			sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
    		}
    	}
    	
    	return 0;
    }
    
    public static void main(String args[]){
    	UniquePathsWithObstacles_115 obj = new UniquePathsWithObstacles_115();
    	
    	int[][] obstacleGrid = new int[3][3];
    	obstacleGrid[0][0] = 0;
    	obstacleGrid[0][1] = 0;
    	obstacleGrid[0][2] = 0;
    	
    	obstacleGrid[1][0] = 0;
    	obstacleGrid[1][1] = 1;
    	obstacleGrid[1][2] = 0;
    	
    	obstacleGrid[2][0] = 0;
    	obstacleGrid[2][1] = 0;
    	obstacleGrid[2][2] = 0;
    
    	System.out.println(obj.uniquePathsWithObstacles(obstacleGrid));
    }
}