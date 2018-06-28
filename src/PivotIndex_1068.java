
public class PivotIndex_1068 {
	/**
     * @param nums: an array
     * @return: the "pivot" index of this array
     */
    public int pivotIndex(int[] nums) {
        // Write your code here
    	int pivot = -1;
    	
    	if(nums == null || nums.length <= 2)
    		return pivot;
    	
    	for(int i = 0; i < nums.length; i++){
    		int left = sum(0, i-1, nums);
    		int right = sum(i+1, nums.length -1, nums);
    		if(left == right)
    			pivot = i;
    	}
    	
    	return pivot;
    }
    
    private int sum(int start, int end, int[] nums) {
		int sum = 0;
		for(int i = start; i <= end; i++){
			sum += nums[i];
		}
		return sum;
	}

	public static void main(String args[]){
    	PivotIndex_1068 obj = new PivotIndex_1068();
    	int[] nums = {-1,-1,0,1,1,0};
    	obj.pivotIndex(nums);
    }
}
