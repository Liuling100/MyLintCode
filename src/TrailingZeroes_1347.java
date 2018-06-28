import java.math.BigDecimal;
import java.math.BigInteger;

public class TrailingZeroes_1347 {
	/**
     * @param n: a integer
     * @return: return a integer
     */
    public int trailingZeroes(int n) {
        // write your code here
    	BigDecimal result = factorial(n);
    	
    	int nums = 0;
    	
    	char[] chars = result.toString().toCharArray();
    	for(int i = chars.length - 1; i >= 0; i--){
    		if(chars[i] == '0'){
    			nums++;
    		}else{
    			break;
    		}
    	}
    	
    	return nums;
    }
    
    
    
    public BigDecimal factorial(int n) {		
		if(n <= 1)
			return BigDecimal.ONE;
		
		else
			return factorial(n - 1).multiply(new BigDecimal(n));
	}



	public static void main(String args[]){
    	TrailingZeroes_1347 obj = new TrailingZeroes_1347();
    	
    	int n = 100;
    	System.out.print(obj.trailingZeroes(n));;
    }
}
