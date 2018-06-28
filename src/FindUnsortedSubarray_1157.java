import java.util.Arrays;

public class FindUnsortedSubarray_1157 {
	/**
     * @param nums: an array
     * @return: the shortest subarray's length
     */
    public int findUnsortedSubarray(int[] nums) {
        // Write your code here
    	if(nums == null || nums.length == 0 || nums.length == 1)
    		return 0;
    	int[] sortNums = new int[nums.length];
    	for(int i =0; i< nums.length;i++)
    		sortNums[i]=nums[i];
    	Arrays.sort(sortNums);
    	
    	boolean same = true;
    	for(int i = 0; i< nums.length;i++){
    		if(sortNums[i]!=nums[i]){
    			same = false;
    			break;
    		}
    	}
    	
    	if(same)
    		return 0;
    	else{
    		int start = 0;
        	int end = nums.length - 1;
        	for(int i = 0; i < end; i++){
        		if(sortNums[i] != nums[i]){
        			start = i;
        			break;
        		}
        	}
        	
        	for(int j=end; j >= 0; j--){
        		if(sortNums[j] != nums[j]){
        			end = j;
        			break;
        		}
        	}
        	
        	return end - start+1;
    	}
    }
    
    public static void main(String args[]){
    	FindUnsortedSubarray_1157 obj = new FindUnsortedSubarray_1157();
    	int[] nums= {1,2,3,4};
    	System.out.println(obj.findUnsortedSubarray(nums));
    }
}
