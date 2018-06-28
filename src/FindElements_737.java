import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindElements_737 {
    /**
     * @param Matrix: the input
     * @return: the element which appears every row
     */
    public int FindElements(int[][] Matrix) {
        // write your code here
    	int m = Matrix.length;
    	int n = Matrix[0].length;
    	
    	
    	int result = 0;
    	int count = 0;
    	for(int i = 0; i < n; i++){
    		int a = Matrix[0][i];
    		count = 1;
    		for(int j = 1; j < m; j++){
    			for(int k = 0; k < n; k++){
    				int b = Matrix[j][k];
    				if(a == b){
    					++count;
    					break;
    				}
    			}
    		}
    		if(count == m)
    			result = a;
    	}
    	return result;
    }
    
    public static void main(String args[]){
    	FindElements_737 obj = new FindElements_737();
    	int[][] Matrix = new int[3][1];
    	Matrix[0][0] = 1;
    	//Matrix[0][1] = 5;
    	//Matrix[0][2] = 3;
    	
    	Matrix[1][0] = 1;
    	//Matrix[1][1] = 2;
    	//Matrix[1][2] = 1;
    	
    	Matrix[2][0] = 1;
    	//Matrix[2][1] = 3;
    	//Matrix[2][2] = 5;

    	System.out.println(obj.FindElements(Matrix));
    }
}