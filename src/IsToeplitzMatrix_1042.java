
public class IsToeplitzMatrix_1042 {
	 /**
     * @param matrix: the given matrix
     * @return: True if and only if the matrix is Toeplitz
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        // Write your code here
    }
    
    public static void main(String args[]){
    	IsToeplitzMatrix_1042 obj = new IsToeplitzMatrix_1042();
    	int[][] matrix = new int[3][3];
    	matrix[0][0] = 1;
    	matrix[0][1] = 2;
    	matrix[0][2] = 3;
    	matrix[0][3] = 4;
    	
    	matrix[1][0] = 5;
    	matrix[1][1] = 1;
    	matrix[1][2] = 2;
    	matrix[1][3] = 3;
    	
    	matrix[2][0] = 9;
    	matrix[2][1] = 5;
    	matrix[2][2] = 1;
    	matrix[2][3] = 2;
    	
    	System.out.println(obj.isToeplitzMatrix(matrix));
    }
}