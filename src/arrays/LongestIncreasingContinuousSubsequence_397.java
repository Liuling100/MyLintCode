package arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingContinuousSubsequence_397 {
	 /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
    	if(A.length == 0)
    		return 0;
    	
    	if(A.length == 1)
    		return 1;
    	    	
    	int resultUp = 1;
    	int resultDown = 1;
    	
    	// up
    	for(int i = 0; i < A.length -1; i++){
			int index = 1;
    		for(int j = i + 1; j < A.length; j++){
    			if((A[j] - A[j - 1]) > 0)
    				index++;
    		}
    		resultUp = Math.max(resultUp, index);
    	}
    	
    	//down
    	for(int i = 0; i < A.length -1; i++){
			int index = 1;
    		for(int j = i + 1; j < A.length; j++){
    			if((A[j] - A[j - 1]) < 0)
    				index++;
    		}
    		resultDown = Math.max(resultDown, index);
    	}
    	
    	
    	return Math.max(resultUp, resultDown);
    }
    
    public static void main(String args[]){
    	LongestIncreasingContinuousSubsequence_397 obj = new LongestIncreasingContinuousSubsequence_397();
    	
    	int[] A = {5, 4, 2, 1, 3};
    	
    	System.out.println(obj.longestIncreasingContinuousSubsequence(A));
    }
}
