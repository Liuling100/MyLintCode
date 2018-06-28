
public class HexConversion_763 {
	/**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public String hexConversion(int n, int k) {
        // write your code here
    	if(n < 0 || n > Math.pow(2, 31) || k < 2 || k > 16)
    		return "0";
    	String out = "";
    	return "0";
    }
    
    public static void main(String args[]){
    	int n = 5;
    	int k = 2;
    	HexConversion_763 obj = new HexConversion_763();
    	System.out.println(obj.hexConversion(n, k));
    }
}
