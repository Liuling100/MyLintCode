public class CosineSimilarity_445 {
    /*
     * @param A: An integer array
     * @param B: An integer array
     * @return: Cosine similarity
     */
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
    	if(A == null || B == null || A.length != B.length)
    		return 0;
    	
    	double result = 0;
    	
    	double up = 0;
    	double sumA = 0;
    	double sumB = 0;
    	for(int i = 0; i < A.length; i++){
    		up += A[i] * B[i];
    		sumA += A[i] * A[i];
    		sumB += B[i] * B[i];
    	}
    	
    	if(sumA == 0 || sumB == 0)
    		return 2;
    	else{
	    	result = up / (Math.sqrt(sumA) * Math.sqrt(sumB));
	    	return result;
    	}
    }
    
    public static void main(String args[]){
    	CosineSimilarity_445 obj = new CosineSimilarity_445();
    	
    	int[] A = {};
    	int[] B = {};
    	
    	System.out.println(obj.cosineSimilarity(A, B));
    }
}