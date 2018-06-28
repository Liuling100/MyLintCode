public class IsPowerOfFour_1285 {
    /**
     * @param num: an integer
     * @return: whether the integer is a power of 4
     */
    public boolean isPowerOfFour(int num) {
        // Write your code here
    	if(num == 1 || num == 4)
    		return true;
    	
    	if(num < 4)
    		return false;
    	
    	return num%4 == 0 && isPowerOfFour(num/4);
    }
    
    public static void main(String args[]){
    	IsPowerOfFour_1285 obj = new IsPowerOfFour_1285();
    	int num = 16;
    	System.out.println(obj.isPowerOfFour(num));
    }
}