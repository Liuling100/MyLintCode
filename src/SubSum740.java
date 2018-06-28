public class SubSum740 {
    /**
     * @param n: the given number
     * @return: Sum of elements in subsets
     */
    public int subSum(int n) {
    	// sum = (1+2+3+4+...+n) * 2^(n-1)
        // write your code here
    	int sum=0;
        for(int i=0;i<=n;i++)
            sum+=i;
        return sum*(int)Math.pow(2,n-1);
    }
    
    public static void main(String args[]){
    	SubSum740 obj = new SubSum740();
    	int n = 3;
    	System.out.println(obj.subSum(n));
    }
}