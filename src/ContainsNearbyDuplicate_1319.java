
public class ContainsNearbyDuplicate_1319 {
	/**
     * @param nums: the given array
     * @param k: the given number
     * @return:  whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Write your code here
    	if(nums == null || nums.length == 0 || nums.length == 1 || k < 0)
    		return false;
    	
    	for(int i = 0; i < nums.length; i++){
    		for(int j = i + 1; j < nums.length; j++){
    			if(nums[i] == nums[j] && Math.abs(i-j) <= k){
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }
    
    public static void main(String args[]){
    	ContainsNearbyDuplicate_1319 obj = new ContainsNearbyDuplicate_1319();
    	int[] nums = {1,2,1};
    	int k = 0;
    	System.out.println(obj.containsNearbyDuplicate(nums, k));
    }
}
