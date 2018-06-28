package arrays;

public class MaxSubArray_41 {
	/**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
    	if(nums == null)
    		return 0;
    	
    	if(nums.length == 1)
    		return nums[0];
    	
    	int[] localMax = new int[nums.length];
    	int[] gobalMax = new int[nums.length];
    	localMax[0] = gobalMax[0] = nums[0];
    	
    	for(int i = 1; i < nums.length; i++){
    		localMax[i] = Math.max(nums[i], localMax[i - 1] + nums[i]);
    		gobalMax[i] = Math.max(localMax[i], gobalMax[i - 1]);
    	}
    	
    	return gobalMax[nums.length - 1];
    }
    
    public static void main(String args[]){
    	MaxSubArray_41 obj = new MaxSubArray_41();
    	
    	int[] nums = {-2,2,-3,4,-1,2,1,-5,3};
    	System.out.println(obj.maxSubArray(nums));
    }
}
