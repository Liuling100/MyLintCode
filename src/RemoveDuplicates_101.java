public class RemoveDuplicates_101 {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
    	if(nums == null || nums.length <= 2)
    		return nums.length;
    	
    	int index = 0;
    	int count = 1;
    	
    	for(int i = 1; i < nums.length; i++){
    		if(nums[i] == nums[index]){
    			if(count < 2){
    				nums[++index] = nums[i];
    				count++;
    			}
    		}else{
    			nums[++index] = nums[i];
    			count = 1;
    		}
    	}
    	
    	return index + 1;
    }
    
    public static void main(String args[]){
    	RemoveDuplicates_101 obj = new RemoveDuplicates_101();
    	int[] nums = {1,1,2,2,3,3,5};
    	System.out.println(obj.removeDuplicates(nums));
    }
}