package arrays;

public class SearchInsert_60 {
	/**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
    	int index = 0;
    	
    	for(int i = 0; i < A.length; i++){
    		if(target == A[i]){
    			index = i;
    			break;
    		}
    		
    		if(i == 0 && target < A[i]){
    			index = 0;
    			break;
    		}
    		
    		if(i == A.length - 1 && target > A[i]){
    			index = A.length;
    			break;
    		}
    		
    		if(target > A[i] && target < A[i + 1]){
    			index = i + 1;
    			break;
    		}
    	}
    	
    	return index;
    }
    
    public static void main(String args[]){
    	SearchInsert_60 obj = new SearchInsert_60();
    	
    	int[] A = {1,3,5,6};
    	int target = 6;
    	
    	System.out.println(obj.searchInsert(A, target));
    }
}
