public class DigitCounts_3 {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
    	int res = 0;

    	for(int i = 0; i <= n; i++){
    		String str = Integer.toString(i);
    		for(int j = 0; j < str.length(); j++){
    			if(Integer.toString(k).charAt(0) == str.charAt(j)){
    				++res;
    			}
    		}
    	}
    	
    	return res;
    }
    
    public static void main(String args[]){
    	DigitCounts_3 obj = new DigitCounts_3();
    	int k = 1;
    	int n = 12;
    	
    	System.out.println(obj.digitCounts(k, n));
    }
};
