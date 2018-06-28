public class IsPowerOfTwo_1314 {
    /**
     * @param n: an integer
     * @return: if n is a power of two
     */
    public boolean isPowerOfTwo(int n) {
        // Write your code here
    	if(n == 1)
    		return true;
    	
    	if(n <= 0 || n % 2 != 0)
    		return false;
    	
    	return isPowerOfTwo(n / 2);
    }
    
    public static void main(String args[]){
    	IsPowerOfTwo_1314 obj = new IsPowerOfTwo_1314();
    	int n = 6;
    	System.out.println(obj.isPowerOfTwo(n));
    }
}