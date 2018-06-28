import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers_1236 {
    /**
     * @param nums: a list of integers
     * @return: return a list of integers
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // write your code here
    	List<Integer> result = new ArrayList<Integer>();
    	if(nums == null || nums.length == 0)
    		return result;
    		
    	if(nums.length == 1){
    		result.add(nums[0]);
    		return result;
    	}
    	
    	Arrays.sort(nums);
    	int ele = 1;
    	if(nums[0] > 1){
    		while(ele < nums[0]){
    			result.add(ele++);
    		}
    	}
    	
    	for(int i = 0; i < nums.length - 1; i++){
    		int difference = nums[i+1] - nums[i];
    		if(difference > 1){
    			while(difference != 1){
    				result.add(nums[i+1]-difference+1);
    				--difference;
    			}
    		}
    	}
    	
    	if(nums.length > nums[nums.length-1]){
    		int tmp = nums[nums.length-1];
    		while(tmp < nums.length){
    			result.add(++tmp);
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	FindDisappearedNumbers_1236 obj = new FindDisappearedNumbers_1236();
    	int[] nums = {13,98,15,75,16,49,25,10,62,1,8,49,7,25,79,67,81,93,62,83,61,46,17,50,29,27,3,24,41,35,69,34,28,12,18,46,72,64,2,64,11,17,48,52,95,89,19,40,83,24,82,32,84,88,66,39,54,61,36,9,30,88,16,52,81,80,22,37,44,85,35,60,22,70,34,54,63,8,60,92,2,20,40,50,96,70,10,98,66,51,6,65,97,67,57,9,27,82,63,59};
    	obj.findDisappearedNumbers(nums);
    }
}