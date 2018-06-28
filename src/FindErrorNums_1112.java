import java.util.Arrays;

public class FindErrorNums_1112 {
	/**
     * @param nums: an array
     * @return: the number occurs twice and the number that is missing
     */
    public int[] findErrorNums(int[] nums) {
        // Write your code here
    	if(nums == null)
    		return null;
    	
    	int[] result = new int[2];
    	
    	if(nums.length == 1)
    		return result;
    	
    	Arrays.sort(nums);
    	
    	if(nums.length == 2 && nums[nums.length - 1] == nums[nums.length -2]){
    		if(nums[nums.length-1] == 1){
        		result[0] = 1;
        		result[1] = 2;
    		}else{
    			result[0] = 2;
        		result[1] = 1;
    		}
    	}else{
	    	for(int i = 0; i < nums.length-1; i++){
	    		if(nums[i] == nums[i+1]){
	    			result[0] = nums[i];
	    			result[1] = (nums[i]+ nums[i+1])/2;
	    			break;
	    		}
	    	}
    	}	
    	
    	return result;
    }
    
    public static void main(String args[]){
    	FindErrorNums_1112 obj = new FindErrorNums_1112();
    	int[] nums = {1,3,3};
    	obj.findErrorNums(nums);
    }
}
