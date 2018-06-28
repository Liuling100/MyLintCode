import java.util.Arrays;

public class MaximumProduct_1119 {
    /**
     * @param nums: an integer array
     * @return: the maximum product
     */
    public int maximumProduct(int[] nums) {
        // Write your code here
    	if(nums == null)
    		return 0;
    	if(nums.length == 1)
    		return nums[0];
    	if(nums.length == 2)
    		return nums[0]*nums[1];
    	
    	Arrays.sort(nums);
    	int result = 0;
    	if(nums[nums.length - 1]<=0 || nums[nums.length - 1]>0)
	    	result = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
    	else{
    		int front = nums[0] * nums[1];
    		int behind = nums[nums.length - 3] * nums[nums.length - 2];
    		if(front > behind)
    			result = front * nums[nums.length -1];
    		else
    			result = behind * nums[nums.length-1];
    	}
    	return result;
    }
    
    public static void main(String args[]){
    	MaximumProduct_1119 obj = new MaximumProduct_1119();
    	int[] nums = {1,2,3,4};
    	System.out.println(obj.maximumProduct(nums));
    }
}