package sort;

public class Median_80 {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
    	quickSort(nums, 0, nums.length - 1);
    	
    	
    	if(nums.length / 2 == 0)
    		return nums[nums.length / 2];
    	else
    		return nums[(nums.length - 1) / 2];
    }
    
    public void quickSort(int[] nums, int start, int end){
    	int pivot = nums[start];
    	int i = start;
    	int j = end;
    	
    	while(i < j){
    		while(i < j && nums[j] > pivot)
    			j--;
    		
    		nums[i] = nums[j];
    		
    		while(i < j && nums[i] < pivot)
    			i++;
    		
    		nums[j] = nums[i];
    	}
    	
    	nums[j] = pivot;
    	
    	if(i - 1 > start)
    		quickSort(nums, start, i - 1);
    	
    	if(i+1 < end)
    		quickSort(nums, i+1, end);
    }
    
    public static void main(String args[]){
    	Median_80 obj = new Median_80();
    	
    	int[] nums = {7, 9, 4, 5};
    	System.out.println(obj.median(nums));
    }
}