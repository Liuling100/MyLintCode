import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairs_1187 {
	 /**
     * @param nums: an array of integers
     * @param k: an integer
     * @return: the number of unique k-diff pairs
     */
    public int findPairs(int[] nums, int k) {
        // Write your code here
    	if(nums == null || nums.length <= 1)
    		return 0;
    	
    	List<int[]> lists = new ArrayList<int[]>();
    	for(int i = 0; i < nums.length; i++){
    		for(int j = i+1; j < nums.length; j++){
        		if(Math.abs(nums[j] - nums[i]) == k){
        			int[] ele = new int[2];
        			ele[0]= nums[i];
        			ele[1]= nums[j];
        			lists.add(ele);
        		}
        	}
    	}
    	
    	int counts = lists.size();
    	for(int i = 0; i < lists.size()-1; i++){
    		if(lists.get(i)[0] == lists.get(i+1)[0] && lists.get(i)[1] == lists.get(i+1)[1] )
    			--counts;
    	}
    	
    	return counts;
    }
    
    public static void main(String args[]){
    	FindPairs_1187 obj = new FindPairs_1187();
    	int[] nums  = {3, 1, 4, 1, 5};
    	int k = 2;
    	System.out.println(obj.findPairs(nums, k));
    }
}
