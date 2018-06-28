

public class AnagramMappings_813 {
    /**
     * @param A: lists A
     * @param B: lists B
     * @return: the index mapping
     */
    public int[] anagramMappings(int[] A, int[] B) {
        // Write your code here
    	
    	
    	int[] output = new int[A.length];
    	
    	for(int i = 0; i < A.length; i++){
    		for(int j = 0; j < B.length; j++){
	    		if(A[i] == B[j]){
	    			output[i] = j;
	    		}
    		}
    	}
    	
    	
    	
    	return output;
    }
    
    
    
    public static void main(String args[]){
    	AnagramMappings_813 obj = new AnagramMappings_813();
    	int[] A = {84,8,0,84,0,84};
    	int[] B = {84,84,8,0,0,84};
    	
    	System.out.println(obj.anagramMappings(A, B));
    }
}