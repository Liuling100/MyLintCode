package interval;

import java.util.ArrayList;
import java.util.List;

public class FindMissingRanges_641 {
	 /*
     * @param nums: a sorted integer array
     * @param lower: An integer
     * @param upper: An integer
     * @return: a list of its missing ranges
     */
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // write your code here
    		
    	
    	
    	List<String> results = new ArrayList<String>();

    	if(nums.length == 0){
    		String tmp = lower + "->" + upper;
    		results.add(tmp);
    		return results;
    	}
    	
    	if(nums.length == 1){
    		if(nums[0] < lower || nums[0] > upper){
    			String tmp = lower + "->" + upper;
        		results.add(tmp);
        		return results;
    		}else{
    			String tmp = (nums[0] + 1) + "->" + upper;
    			results.add(tmp);
        		return results;
    		}
    	}
    	
    	
    	return results;
    }
    
    public static void main(String args[]){
    	FindMissingRanges_641 obj = new FindMissingRanges_641();
    	
    	int[] nums = {0, 1, 3, 50, 75};
    	int lower = 0;
    	int upper = 99;
    	
    	obj.findMissingRanges(nums, lower, upper);
    }
}
