public class HammingWeight_1332 {
    /**
     * @param n: an unsigned integer
     * @return: the number of  bits
     */
    public int hammingWeight(int n) {
        // write your code here
    	int counts = 0;
    	
    	String str = Integer.toBinaryString(n);
    	
    	for(int i = 0; i < str.length(); i++){
    		if(str.charAt(i) == '1')
    			++counts;
    	}
    	
    	return counts;
    }
    
    public static void main(String args[]){
    	HammingWeight_1332 obj = new HammingWeight_1332();
    	int n = 11;
    	System.out.println(obj.hammingWeight(n));
    }
}