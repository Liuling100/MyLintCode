package arrays;

public class ReverseArray_767 {
	/**
     * @param nums: a integer array
     * @return: nothing
     */
    public void reverseArray(int[] nums) {
        // write your code here
    	if(nums.length == 0 || nums.length == 1){
    		return;
    	}
    	
    	for(int i = 0, j = nums.length - 1; i < j; i++, j--){
    		int tmp = nums[i];
    		nums[i] = nums[j];
    		nums[j] = tmp;
    	}
    }
    
    public static void main(String args[]){
    	ReverseArray_767 obj = new ReverseArray_767();
    	
    	int[] nums = {1, 2, 3};
    	
    	obj.reverseArray(nums);
    	System.out.println(nums);
    }
}
