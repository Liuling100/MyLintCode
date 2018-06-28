package arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement_172 {
	/*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
    	if(A == null || A.length == 0){
    		return 0;
    	}

    	int index = 0;
    	for(int i = 0; i < A.length; i++){
    		if(A[i] != elem){
    			A[index] = A[i];
    			index++;
    		}
    	}
    	System.out.println(A);
    	return index;
    }
    
    public static void main(String args[]){
    	RemoveElement_172 obj = new RemoveElement_172();
    	
    	int[] A = {0,4,4,0,4,4,4,0,2};
    	int elem = 4;
    	
    	obj.removeElement(A, elem);
    }
}
