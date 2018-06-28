import java.util.Arrays;

public class BigBusiness_970 {
    /**
     * @param a: The cost of the film
     * @param b: The price of the selling of the film
     * @param k: The principal
     * @return: The answer
     */
    public int bigBusiness(int[] a, int[] b, int k) {
        // Write your code here
    	
    	Arrays.sort(a);
    	for(int i = 0; i < a.length; i++){
    		if(k >= a[i]){
    			k = k - a[i] + b[i];
    			a[i] = Integer.MAX_VALUE;
    		}
    	}
    	
    	return k;
    }
    
    public static void main(String args[]){
    	BigBusiness_970 obj = new BigBusiness_970();
    	int[] a = {3,2,5};
    	int[] b = {3,1,2};
    	int k = 100;
    	
    	System.out.print(obj.bigBusiness(a, b, k));
    }
}