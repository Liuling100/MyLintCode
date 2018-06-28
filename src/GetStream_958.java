public class GetStream_958 {
    /**
     * @param s: The data stream
     * @return: Return the judgement stream
     */
    public int[] getStream(String s) {
        // Write your code here
    	int[] output = new int[s.length()];
    	
    	for(int i = 0; i < s.length(); i++){
    		output[i] = 1;
    		String subStr = s.substring(0, i+1);
    		// check
    		for(int j = 0, t = subStr.length() - 1; j < t; j++, t--){
    			if(subStr.charAt(j) != subStr.charAt(t)){
        			output[i] = 0;
        			break;
    			}
    		}
    	}
    	
    	return output;
    }
    
    public static void main(String args[]){
    	GetStream_958 obj = new GetStream_958();
    	
    	String s = "abba";
    	System.out.println(obj.getStream(s));
    }
}