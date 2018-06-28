import java.util.Arrays;

public class FindShortestSubArray_1078 {
    /**
     * @param nums: a list of integers
     * @return: return a integer
     */
    public int findShortestSubArray(int[] nums) {
        // write your code here
    	int degree = 0;
    	
    	if(nums == null || nums.length ==0)
    		return degree;
    	
    	Arrays.sort(nums);
    	
    	for(int i = 0; i < nums.length - 1; i++){
    		int counts = 1;
    		for(int j = i + 1; j < nums.length; j++){
    			if(nums[i] == nums[j]){
    				++counts;
    				degree = Math.max(degree, counts);
    			}else{
    				i = j-1;
    				break;
    			}
    		}
    	}
    	
    	return degree;
    }
    
    public static void main(String args[]){
    	FindShortestSubArray_1078 obj = new FindShortestSubArray_1078();
    	int[] nums = {1, 2, 2, 3, 1};
    	System.out.println(obj.findShortestSubArray(nums));
    }
}