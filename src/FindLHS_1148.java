import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLHS_1148 {
    /**
     * @param nums: a list of integers
     * @return: return a integer
     */
    public int findLHS(int[] nums) {
        // write your code here
    	List<int[]> lists = new ArrayList<int[]>();
    	
    	Arrays.sort(nums);
    	
    	for(int i = 0; i < nums.length; i++){
    		int count = 1;
			int[] ele = new int[2];
			ele[0] = nums[i];
    		for(int j = i + 1; j < nums.length; j++){
    			if(nums[i] == nums[j]){
    				++count;
    			}else{
    				ele[1] = count;
    				lists.add(ele);
    				i = j -1;
    				break;
    			}
    		}
    	}
    	
    	int length = 0;
		boolean hasSingle = false;
    	for(int i = 0; i < lists.size(); i++){
    		int[] ele = lists.get(i);
    		if(ele[1] % 2 != 0){
    			hasSingle = true;
    		}else{
    			length += ele[1];
    		}
    	}
    	
    	if(hasSingle)
    		++length;
    	
    	return length;
    }
    
    public static void main(String args[]){
    	FindLHS_1148 obj = new FindLHS_1148();
    	int[] nums = {1,3,2,2,5,2,3,7};
    	System.out.println(obj.findLHS(nums));
    }
}