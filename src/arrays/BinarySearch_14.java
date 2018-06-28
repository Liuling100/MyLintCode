package arrays;

public class BinarySearch_14 {
	/**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
    	int index = -1;
    	
    	int mid;
    	int len;
    	
    	if(nums.length % 2 == 1){
    		len = (nums.length - 1) / 2;
    	}else{
    		len = nums.length / 2;
    	}
    	    		
		mid = nums[len];
		if(mid == target)
    		return len;
		else if(mid < target){
			int[] array = new int[len];
    		for(int i = 0; i < len; i++){
    			array[i] = nums[i+len];
    		}
    		binarySearch(array, target);
    	}else{
    		int[] array = new int[len];
    		for(int i = 0; i < len; i++){
    			array[i] = nums[i];
    		}
    		binarySearch(array, target);
    	}
    	return index;
    }
    
    public static void main(String args[]){
    	BinarySearch_14 obj = new BinarySearch_14();
    	
    	int[] nums = {1, 2, 3, 3, 4, 5, 10};
    	int target = 3;
    	System.out.println(obj.binarySearch(nums, target));
    }
}
