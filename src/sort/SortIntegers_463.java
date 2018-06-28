package sort;

public class SortIntegers_463 {
    /**
     * @param A: an integer array
     * @return: nothing
     */
	//O(n^2)
	//—°‘Ò≈≈–Ú
    public void sortIntegers1(int[] A) {
        // write your code here
    	for(int i = 0; i < A.length; i++){
			for(int j = i + 1; j < A.length; j++){
					if(A[i] > A[j]){
						int tmp = A[i];
						A[i] = A[j];
						A[j] = tmp;
					}
				}
			}
	    }
    
    //O(n^2)
    //√∞≈›≈≈–Ú
    public void sortIntegers2(int[] A) {
        // write your code here
    	for(int i = 0; i < A.length; i++){
    		for(int j = A.length - 1; j > i; j--){
    			if(A[j] < A[j - 1]){
        			int tmp = A[j - 1];
        			A[j - 1] = A[j];
        			A[j] = tmp;
    			}
    		}
    	}
    }
    
    //O(n^2)
    //≤Â»Î≈≈–Ú
    public void sortIntegers3(int[] A) {
        // write your code here
    	for(int j = 1; j < A.length; j++){
    		for(int i = 0; i < j; i++){
    			if(A[i] > A[j]){
    				int tmp = A[i];
    				A[i] = A[j];
    				A[j] = tmp;
    				System.out.print(A);
    			}
    		}
    	}
    }
    
    public static void main(String args[]){
    	SortIntegers_463 obj = new SortIntegers_463();
    	int[] A = {3, 2, 1, 4, 5};
    	
    	//obj.sortIntegers1(A);
    	//obj.sortIntegers2(A);
    	obj.sortIntegers3(A);
    }
}