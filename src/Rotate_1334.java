public class Rotate_1334 {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        // Write your code here
    	int[] part1 = new int[nums.length];
    	
    	while(nums.length < k){
    		k = k - nums.length;
    	}    	
    	
    	for(int i = 0; i < k; i++){
    		part1[i] = nums[nums.length - k +i];
    	}
    	
    	for(int i = 0; i < nums.length - k; i++){
    		part1[i+k] = nums[i];
    	}
    	
    	
    	return part1;
    }
    
    public static void main(String args[]){
    	Rotate_1334 obj = new Rotate_1334();
    	int[] nums = {1,2,3};
    	int k = 4;
    	obj.rotate(nums, k);
    }
}