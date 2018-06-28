public class SearchMatrix_28 {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
    	if(matrix == null || matrix.length == 0 || ( matrix.length == 1 && matrix[0].length == 0))
    		return false;
    	
    	int m = matrix[0].length;
    	int n = matrix.length;
    	
    	for(int i = 0; i < n; i++){
    		if(matrix[i][0] <= target && matrix[i][m - 1] >= target){
    			for(int j = 0; j < m; j ++){
    				if(matrix[i][j] == target)
    					return true;
    			}
    		}
    	}
    	
    	return false;
    }
    
    public static void main(String args[]){
    	SearchMatrix_28 obj = new SearchMatrix_28();
    	int[][] matrix = {
    	    	  
    	    	};
    	
    	int target = 1;
    	System.out.println(obj.searchMatrix(matrix, target));
    }
}