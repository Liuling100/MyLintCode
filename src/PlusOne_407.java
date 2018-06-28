public class PlusOne_407 {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here
    	long sum = 0;
    	for(int i = 0; i < digits.length; i++){
    		sum += digits[i] * Math.pow(10, digits.length - 1 - i);
    	}
    	
    	sum += 1;
    	
    	String str = "" + sum;
    	int[] output = new int[str.length()];
    	for(int i = 0; i < str.length(); i++){
    		output[i] = Character.getNumericValue(str.charAt(i));
    	}
    	
    	return output;
    }
    
    public static void main(String args[]){
    	PlusOne_407 obj = new PlusOne_407();
    	
    	int[] digits = {9,8,7,6,5,4,3,2,1,0};
    	System.out.println(obj.plusOne(digits));
    }
}