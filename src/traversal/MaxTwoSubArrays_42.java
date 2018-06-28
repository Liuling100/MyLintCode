package traversal;

import java.util.ArrayList;
import java.util.List;

import arrays.MaxSubArray_41;

public class MaxTwoSubArrays_42 {
    /*
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(List<Integer> nums) {
        // write your code here
    	int size = nums.size();
    	int[] left = new int[size];
    	int[] right = new int[size];
    	
    	int sum = 0;
    	int minSum = 0;
    	int max = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < size; i++){
    		sum += nums.get(i);
    		max = Math.max(max, sum - minSum);
    		minSum = Math.min(sum, minSum);
    		left[i] = max;
    	}
    	
    	sum = 0;
    	minSum = 0;
    	max = Integer.MIN_VALUE;
    	for(int i = size - 1; i >= 0; i--){
    		sum += nums.get(i);
    		max = Math.max(max, sum - minSum);
    		minSum = Math.min(sum, minSum);
    		right[i] = max;
    	}
    	
    	max = Integer.MIN_VALUE;
    	for(int i = 0; i < size - 1; i++){
    		max = Math.max(max, left[i] + right[i+1]);
    	}
    	
    	return max;
    }
    
      
    public int[] listToArray(List<Integer> nums){
    	int[] result = new int[nums.size()];
    	
    	for(int i = 0; i < nums.size(); i++){
    		result[i] = nums.get(i);
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	MaxTwoSubArrays_42 obj = new MaxTwoSubArrays_42();
    	
    	List<Integer> nums = new ArrayList<Integer>();
    	nums.add(1);
    	nums.add(3);
    	nums.add(-1);
    	nums.add(2);
    	nums.add(-1);
    	nums.add(2);
    	
    	obj.maxTwoSubArrays(nums);
    }
}
