public class ContainsDuplicate_1320 {
    /**
     * @param nums: the given array
     * @return: if any value appears at least twice in the array
     */
    public boolean containsDuplicate(int[] nums) {
        // Write your code here
    	if(nums == null || nums.length == 0 || nums.length == 1)
    		return false;
    	
    	for(int i = 0; i < nums.length; i++){
    		for(int j = i+1; j < nums.length; j++){
    			if(nums[i] == nums[j])
    				return true;
    		}
    	}
    	
    	return false;
    }
    
    public static void main(String args[]){
    	ContainsDuplicate_1320 obj = new ContainsDuplicate_1320();
    	int[] nums = {1,1};
    	System.out.println(obj.containsDuplicate(nums));
    }
}