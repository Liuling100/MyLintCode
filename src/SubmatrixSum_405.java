public class SubmatrixSum_405 {
    /*
     * @param matrix: an integer matrix
     * @return: the coordinate of the left-up and right-down number
     */
    public int[][] submatrixSum(int[][] matrix) {
        // write your code here
    	
    }
    
    public static void main(String args[]){
    	SubmatrixSum_405 obj = new SubmatrixSum_405();
    	int[][] matrix = new int[3][3];
    	matrix[0][0] = 1;
    	matrix[0][1] = 5;
    	matrix[0][2] = 7;
    	
    	matrix[1][0] = 3;
    	matrix[1][1] = 7;
    	matrix[1][2] = -8;
    	
    	matrix[2][0] = 4;
    	matrix[2][1] = -8;
    	matrix[2][2] = 9;
    	
    	obj.submatrixSum(matrix);
    }
}