
public class MinPathSum_110 {
	/**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
    	if(grid == null || grid.length == 0 ||  grid[0].length == 0)
    		return 0;
    	
    	int M = grid.length;
    	int N = grid[0].length;
    	int[][] sum = new int[M][N];
    	
    	sum[0][0] = grid[0][0];
    	
    	for(int i = 1; i < M; i++){
    		sum[i][0] = sum[i - 1][0] + grid[i][0];
    	}
    	
    	for(int j = 1; j < N; j++){
    		sum[0][j] = sum[0][j - 1] + grid[0][j];
    	}
    	
    	for(int i = 1; i < M; i++){
    		for(int j = 1; j < N; j++){
    			sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i][j];
    		}
    	}
    	
    	return sum[M- 1][N- 1];
    }
    
    public static void main(String args[]){
    	MinPathSum_110 obj = new MinPathSum_110();
    	
    	int[][] grid = new int[3][3];
    	int ele = 0;
    	for(int i = 0; i < 3; i++){
    		for(int j = 0; j < 3; j++){
    			grid[i][j] = ele++;
    		}
    	}
    	
    	System.out.println(obj.minPathSum(grid));
    }
}
