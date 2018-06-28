package heap;

public class Topk_544 {
    /**
     * @param nums: an integer array
     * @param k: An integer
     * @return: the top k largest numbers in array
     */
    public int[] topk(int[] nums, int k) {
        // write your code here
    	int[] output = new int[k];
    	
    	for(int i = 0; i < nums.length; i++){
    		for(int j = 0; j < nums.length; j++){
    			if(nums[i] >= nums[j]){
    				int tmp = 0;
    				tmp = nums[i];
    				nums[i] = nums[j];
    				nums[j] = tmp;
    			}
    		}
    	}
    	
    	for(int i = 0; i < k; i ++){
    		output[i] = nums[i];
    	}
    	
    	return output;
    }
    
    public static void main(String args[]){
    	Topk_544 obj = new Topk_544();
    	
    	int[] nums = {3,10,1000,-99,4,100}; 
    	int k = 3;
    	
    	System.out.println(obj.topk(nums, k));
    }
}
