import java.util.ArrayList;
import java.util.List;

public class SubarraySum_138 {
	 /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        // write your code here
    	List<Integer> result = new ArrayList<Integer>();
    	
    	if(nums == null || nums.length == 0)
    		return result;
    	    	
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] == 0){
    			result.add(i);
    			result.add(i);
    			return result;
    		}else{
    			int sum = nums[i];
    			for(int j = i + 1; j < nums.length; j++){
    				sum += nums[j];
    				if(sum == 0){
    					result.add(i);
    					result.add(j);
    					return result;
    				}
    			}
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	SubarraySum_138 obj = new SubarraySum_138();
    	
    	int[] nums = {-3, 1, 2, -3, 4};
    	obj.subarraySum(nums);
    }
}
