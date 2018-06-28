package matrix;

public class PrintZMatrix_185 {
    /**
     * @param matrix: An array of integers
     * @return: An array of integers
     */
    public int[] printZMatrix(int[][] matrix) {
        // write your code here
    	
    	if(matrix == null || matrix.length == 0){
    		int[] tmp = new int[0];
    		return tmp;
    	}
    	
    	int m = matrix.length;
    	int n = matrix[0].length;
    	int length = m * n;
    	int[] result = new int[length];
    	result[0] = matrix[0][0];
    	int t = 0;
    	while(t < length){
    		int sum = 0;
    		for(int i = 0; i < m; i++){
    			for(int j = 0; j < n; j++){
    				if(i + j == sum){
    		    		int ele = matrix[i][j];
    		    		result[t] = ele;
    		    		t++;
    				}
    			}
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	PrintZMatrix_185 obj = new PrintZMatrix_185();
    	
    	int[][] matrix = {
    	  {1, 2,  3,  4},
    	  {5, 6,  7,  8},
    	  {9,10, 11, 12}
    	};
    	
    	obj.printZMatrix(matrix);
    }
}