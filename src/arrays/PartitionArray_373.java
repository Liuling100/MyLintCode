package arrays;

public class PartitionArray_373 {
	/*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
    	int loop = 0;
    	for(int i = 0; i < nums.length; i++){
    		if( nums[i] % 2 == 0){
    			for(int j = nums.length - 1 - loop; j > i; j--){
    				if(nums[j] % 2 != 0){
    					int tmp = nums[i];
    					nums[i] = nums[j];
    					nums[j] = tmp;
    					loop++;
    					break;
    				}
    			}
    		}
    	}
    	System.out.println(nums);
    }
    
    public static void main(String args[]){
    	PartitionArray_373 obj = new PartitionArray_373();
    	
    	int[] nums = {2, 4, 3, 1};
    	
    	obj.partitionArray(nums);
    }
}
