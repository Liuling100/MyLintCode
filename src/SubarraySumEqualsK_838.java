public class SubarraySumEqualsK_838 {
    /**
     * @param nums: a list of integer
     * @param k: an integer
     * @return: return an integer, denote the number of continuous subarrays whose sum equals to k
     */
    public int subarraySumEqualsK(int[] nums, int k) {
        // write your code here
    	int output = 0;
    	
    	for(int i = 0; i < nums.length; i++){
    		int sum = nums[i];
    		if(sum == k){
    			output++;
    		}
    		for(int j = i + 1; j < nums.length; j++){
    			sum += nums[j];
    			if(sum == k){
    				output++;
    			}
    		}
    	}
    	
    	return output;
    }
    
    public static void main(String args[]){
    	SubarraySumEqualsK_838 obj = new SubarraySumEqualsK_838();
    	
    	int[] nums = {-4,-1,-6,16,13,2,-1,-4,6,6,-9,13,3,-6,-6,16,8,-10,2,1,0,8,6,16,11,0,10,-6,-5,16};
    	int k = 12;
    	System.out.println(obj.subarraySumEqualsK(nums, k));
    }
}