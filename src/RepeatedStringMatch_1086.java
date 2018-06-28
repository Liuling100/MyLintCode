
public class RepeatedStringMatch_1086 {
	/**
     * @param A: a string
     * @param B: a string
     * @return: return an integer
     */
    public int repeatedStringMatch(String A, String B) {
        // write your code here
    	if(A.length() == 0)
    		return -1;
    	if(A.length() != 0 && B.length() == 0)
    		return 0;
    	
    	if(isExist(B, A)){
    		
    	}else{
    		return false;
    	}
    	
    	int times = 0;
    	if(A.length() >= B.length()){
    		
    	}else{
    		A += A;
    	}
    	
    	return -1;
    }
    
    public boolean isExist(String A, String B){
    	for(int i = 0; i < A.length() - B.length(); i++){
    		if(A.substring(i, i+B.length()).equals(B)){
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public static void main(String args[]){
    	RepeatedStringMatch_1086 obj = new RepeatedStringMatch_1086();
    	String A = "abcd";
    	String B = "cdabcdab";
    	
    	System.out.println(obj.repeatedStringMatch(A, B));
    }
}
