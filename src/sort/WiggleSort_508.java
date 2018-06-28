package sort;

public class WiggleSort_508 {
    /*
     * @param nums: A list of integers
     * @return: nothing
     */
	int index = 0;
    public void wiggleSort(int[] nums) {
        // write your code here
    	for(int i = 1; i < nums.length; i++){
    		if(i % 2 == 1 && nums[i - 1] > nums[i]
    				|| i % 2 == 0 && nums[i -1] < nums[i])
    			swap(nums, i - 1, i);
    	}
    }
    
    public void swap(int[] nums, int index1, int index2){
    	int tmp = nums[index1];
    	nums[index1] = nums[index2];
    	nums[index2] = tmp;
    }
	
	/*public void wiggleSort(int[] nums) {
        // Write your code here
        for(int i=1; i<nums.length; i++) {
            if((i%2==1 && (nums[i] < nums[i-1]) || 
              (i%2==0) && (nums[i] > nums[i-1]))) {
                swap(nums, i-1, i);
            }
        }
    }*/
    
    public static void main(String args[]){
    	WiggleSort_508 obj = new WiggleSort_508();
    	
    	int[] nums = {4,1,4,3,4,3,3,2,0,2};
    	
    	obj.wiggleSort(nums);
    	
    	for(int i = 0; i < nums.length; i++){
    		System.out.print(nums[i] + " ");
    	}
    }
}
