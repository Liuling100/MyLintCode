public class FindNthDigit_1256 {
    /**
     * @param n: a positive integer
     * @return: the nth digit of the infinite integer sequence
     */
    public int findNthDigit(int n) {
        // write your code here
    	if(n < 10){
    		return n;
    	}
    	
    	int res = 0;
    	
    	// get n bits
    	int bits = 1;
    	while(n / 10 != 0){
    		++bits;
    		n /= 10;
    	}
    	
    	
    	
    	return res;
    }
    
    public static void main(String args[]){
    	FindNthDigit_1256 obj = new FindNthDigit_1256();
    	int n = 11;
    	System.out.println(obj.findNthDigit(n));
    }
}