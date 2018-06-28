package sort;

public class KthLargestElement_5 {
	/*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
    	return quickSort(nums, 0, nums.length - 1, k);
    }
    
    public int quickSort(int[] nums, int start, int end, int k) {
		int i = start;
		int j = end;
		int pivot = nums[start];
		
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
			quickSort(nums, start, i - 1, k);
		
		if(i + 1 < end)
			quickSort(nums, i + 1, end, k);
		
		return nums[nums.length - k];
	}

	public static void main(String args[]){
    	KthLargestElement_5 obj = new KthLargestElement_5();
    	
    	int[] nums = {1,2,3,4,5,6,8,9,10,7};
    	int k = 10;
    	
    	System.out.println(obj.kthLargestElement(k, nums));
    }
}
