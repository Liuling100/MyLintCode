package arrays;

import java.util.ArrayList;
import java.util.List;

public class MinSubArray_44 {
	 /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
    	if(nums == null)
    		return 0;
    	
    	int len = nums.size();
    	
    	int[] localMin = new int[len];
    	int[] globalMin = new int[len];
    	for(int i = 0; i < len; i++){
    		if(i == 0)
    			globalMin[i] = localMin[i] = nums.get(i);
    		else{
    			localMin[i] = Math.min(nums.get(i), localMin[i - 1] + nums.get(i));
    			globalMin[i] = Math.min(globalMin[i - 1], localMin[i]);
    		}
    	}
    	
    	return globalMin[len - 1];
    }
    
    public static void main(String args[]){
    	MinSubArray_44 obj = new MinSubArray_44();
    	
    	List<Integer> nums = new ArrayList<Integer>();
    	
    	nums.add(-5);
    	nums.add(10);
    	nums.add(-4);
    	
    	System.out.println(obj.minSubArray(nums));
    }
}
