public class ReverseInteger_413 {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        // write your code here
    	int minus = n >= 0 ? 1 : -1;
    	
    	StringBuilder str = new StringBuilder ( "" + Math.abs(n));
    	
    	for(int i = 0, j = str.length() - 1; i < j; i++, j--){
    		char tmp;
    		tmp = str.charAt(i);
    		str.setCharAt(i, str.charAt(j));
    		str.setCharAt(j, tmp);
    	}
    	long output = Long.parseLong(str.toString());
    	if(output > Integer.MAX_VALUE )
    		return 0;
    	else
    		return Math.toIntExact(output) * minus;
    }
    
    public static void main(String args[]){
    	ReverseInteger_413 obj = new ReverseInteger_413();
    	
    	int n = 1534236469;
    	System.out.println(obj.reverseInteger(n));
    }
}