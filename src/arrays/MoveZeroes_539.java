package arrays;

public class MoveZeroes_539 {
	/**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        // write your code here
    	if(nums.length == 0 || nums.length == 1)
    		return;
    	
    	for(int i = 0; i < nums.length - 1; i++){
    		if(nums[i] == 0){
    			for(int j = i + 1; j < nums.length; j++){
    				if(nums[j] != 0){
    	    			int tmp = nums[i];
    	    			nums[i] = nums[j];
    	    			nums[j] = tmp;
    	    			break;
    				}
    			}
    		}
    	}
    	System.out.println(nums);
    }
    
    public static void main(String args[]){
    	MoveZeroes_539 obj = new MoveZeroes_539();
    	
    	int[] nums = {0, 1, 0, 3, 12};
    	obj.moveZeroes(nums);
    	System.out.println(nums);
    }
}
