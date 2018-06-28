import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRelativeRanks_1200 {
    /**
     * @param nums: List[int]
     * @return: return List[str]
     */
    public String[] findRelativeRanks(int[] nums) {
        // write your code here
    	if(nums == null)
    		return null;
    	
    	String[] result = new String[nums.length];
    	if(nums.length == 0)
    		return result;
    	
    	if(nums.length == 2){
    		if(nums[0] == nums[1]){
    			result[0] = "Gold Medal";
    			result[1] = "Gold Medal";
    		}else if(nums[0] > nums[1]){
    			result[0] = "Gold Medal";
    			result[1] = "Silver  Medal";
    		}else{
    			result[0] = "Silver Medal";
    			result[1] = "Gold Medal";
    		}
    		return result;
    	}
    	
    	int[] newNums = new int[nums.length];
    	for(int i =0; i<nums.length;i++)
    		newNums[i] = nums[i];
    	Arrays.sort(newNums);

    	for(int i = 0; i < nums.length; i++){
    		int a = nums[i];
    		for(int j = nums.length - 1; j >= 0 ; j--){
    			int b = newNums[j];
    			if(a == b){
    				if(j == nums.length - 1){
    					result[i] = "Gold Medal";
    				}else if(j == nums.length - 2){
    					result[i] = "Silver Medal";
    				}else if(j == nums.length - 3){
    					result[i] = "Bronze Medal";
    				}else{
    					result[i] = (nums.length -j) + "";
    				}
    				break;
    			}
    		}
    	}
    	return result;
    }
    
    public static void main(String args[]){
    	FindRelativeRanks_1200 obj = new FindRelativeRanks_1200();
    	int[] nums = {5, 4, 3, 2, 1};
    	System.out.println(obj.findRelativeRanks(nums));
    }
}