import java.util.ArrayList;
import java.util.List;

public class Subsets_17 {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
    	List<List<Integer>> results = new ArrayList<List<Integer>>();
    	
    	List<Integer> empty = new ArrayList<Integer>();
    	results.add(empty);
    	
    	// 1 element
    	for(int i = 0; i < nums.length; i++){
    		
    	}
    	
    	
    	
    	return results;
    }
    
    public static void main(String args[]){
    	Subsets_17 obj = new Subsets_17();
    	
    	int[] nums = {1, 2, 3};
    	obj.subsets(nums);
    }
}