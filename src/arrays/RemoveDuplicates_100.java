package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates_100 {
	 /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
    	if(nums == null || nums.length == 0)
    		return 0;
    	
    	int result = 0;
    	
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] != nums[result]){
    			nums[result] = nums[i];
    			result++;
    		}
    	}
    	
    	return result + 1;
    }
    
    public static void main(String args[]){
    	RemoveDuplicates_100 obj = new RemoveDuplicates_100();
    	
    	int[] nums = {1,1,2,2,3};
    	System.out.println(obj.removeDuplicates(nums));
    }
}
