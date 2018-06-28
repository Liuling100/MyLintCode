public class CheckPossibility_1099 {
    /**
     * @param nums: an array
     * @return: if it could become non-decreasing by modifying at most 1 element
     */
    public boolean checkPossibility(int[] nums) {
        // Write your code here
    	if(nums == null || nums.length == 0 || nums.length == 1)
    		return true;
    	
    	int largeCount = 0;
    	for(int i = 0; i < nums.length; i++){
    		for(int j = i+1; j < nums.length; j++){
    			if(nums[i] > nums[j]){
        			++largeCount;
        		}
        		if(largeCount > 1){
        			if(largeCount == nums.length - 1){
        				if(i == 0)
        					return true;
        			}else
        				return false;
        		}        			
    		}
    	}
    	
    	return true;
    }
    
    public static void main(String args[]){
    	CheckPossibility_1099 obj = new CheckPossibility_1099();
    	
    	int[] nums = {4,2,1};
    	System.out.println(obj.checkPossibility(nums));
    }
}