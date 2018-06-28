package arrays;

public class FindMaxAverage_868 {
	 /**
     * @param nums: an array
     * @param k: an integer
     * @return: the maximum average value
     */
    public double findMaxAverage(int[] nums, int k) {
        // Write your code here
    	double result = Double.MIN_VALUE;
    	    	
    	for(int i = 0; i < nums.length - k + 1; i++){
    		int sum = 0;
    		for(int j = 0; j < k; j++){
    			sum += nums[i + j];
    		}
    		
    		result = Math.max(result, sum);
    	}
    	
    	return result / k;
    }
    
    public static void main(String args[]){
    	FindMaxAverage_868 obj = new FindMaxAverage_868();
    	
    	int[] nums = {1,12,-5,-6,50,3};
    	int k = 4;
    	
    	System.out.println(obj.findMaxAverage(nums, k));
    }
}
