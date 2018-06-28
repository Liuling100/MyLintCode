public class LargestPalindrome_1216 {
    /**
     * @param n: the number of digit
     * @return: the largest palindrome mod 1337
     */
    public int largestPalindrome(int n) {
        // write your code here    	
    	int largestN = largestN(n);
    	int validLarge = largestN;
    	
    	while(largestN >= 0){
    		String str = Integer.toString(largestN);
    		for(int j = 0, t = str.length() - 1; j < str.length(); j++, t--){
    			if(str.charAt(t) != str.charAt(j)){
    	    		--largestN;
    				break;
    			}
    		}
    	}
    	
    	return largestN % 1337;
    }
    
    public int largestN(int n){
    	int result = 0;
    	
    	for(int i = 0; i < n; i++){
    		result += 9 * Math.pow(10, i);
    	}
    	
    	return result * result;
    }
    
    public static void main(String args[]){
    	LargestPalindrome_1216 obj = new LargestPalindrome_1216();
    	int n = 2;
    	System.out.println(obj.largestPalindrome(n));
    }
}