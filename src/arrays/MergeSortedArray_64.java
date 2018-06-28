package arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MergeSortedArray_64 {
	/*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
    	for(int i = 0; i < n; i++){
    		A[m + i] = B[i];
    	}
    	for(int i = 0; i < A.length - 1; i++){
    		for(int j = i + 1; j < A.length; j++){
    			if(A[i] > A[j]){
    				int tmp = A[i];
    				A[i] = A[j];
    				A[j] = tmp;
    			}
    		}
    	}
    	System.out.println(A);
    }
    
    public static void main(String args[]){
    	MergeSortedArray_64 obj = new MergeSortedArray_64();
    	int m = 3; 
    	int n = 2;
    	int[] A = new int[m+n];
    	
    	A[0] = 1;
    	A[1] = 5;
    	A[2] = 6;
    	
    	int[] B = {4, 5};
    	
    	obj.mergeSortedArray(A, m, B, n);
    }
}
