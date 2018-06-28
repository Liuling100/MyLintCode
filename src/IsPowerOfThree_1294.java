public class IsPowerOfThree_1294 {
    /**
     * @param n: an integer
     * @return: if n is a power of three
     */
    public boolean isPowerOfThree(int n) {
        // Write your code here
    	return (n>0&&Math.pow(3,19)%n==0);  
    }
    
    public static void main(String args[]){
    	IsPowerOfThree_1294 obj = new IsPowerOfThree_1294();
    	int n =9;
    	System.out.println(obj.isPowerOfThree(n));
    }
}