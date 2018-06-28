package arrays;

import java.util.ArrayList;
import java.util.List;

public class RecoverRotatedSortedArray_39 {
	/**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
    	int start = 0; 
    	int end = nums.size() - 1;
    	
    	quickSort(nums, start, end);
    	System.out.println(nums);
    }
    
    public void quickSort(List<Integer> nums, int start, int end){
    	int i = start;
    	int j = end;
    	int pivot = nums.get(start);
    	
    	while(i < j){
    		while(i < j && nums.get(j) > pivot)
    			j--;
    		
    		nums.set(i, nums.get(j));
    		
    		while(i < j && nums.get(i) < pivot)
    			i++;
    		
    		nums.set(j, nums.get(i));
    	}
    	
    	nums.set(j, pivot);
    	
    	if(i - 1 > start)
    		quickSort(nums, start, i - 1);
    	
    	if(i + 1 < end)
    		quickSort(nums, i + 1, end);
    }
    
    public static void main(String args[]){
    	RecoverRotatedSortedArray_39 obj = new RecoverRotatedSortedArray_39();
    	
    	List<Integer> nums = new ArrayList<Integer>();
    	nums.add(4);
    	nums.add(5);
    	nums.add(1);
    	nums.add(2);
    	nums.add(3);
    	obj.recoverRotatedSortedArray(nums);
    }
}
