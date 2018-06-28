public class UniquePaths_114 {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
    	if(m == 0 || n == 0)
    		return 1;
    	
    	int[][] sum = new int[m][n];
    	
    	for(int i = 0; i < m; i++){
    		sum[i][0] = 1;
    	}
    	
    	for(int i = 0; i < n; i++){
    		sum[0][i] = 1;
    	}
    	
    	for(int i = 1; i < m; i++){
    		for(int j = 1; j < n; j++){
    			sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
    		}
    	}
    	
    	return sum[m-1][n-1];
    }
    
    public static void main(String args[]){
    	UniquePaths_114 obj = new UniquePaths_114();
    	int m = 4;
    	int n = 5;
    	System.out.println(obj.uniquePaths(m, n));
    }
}