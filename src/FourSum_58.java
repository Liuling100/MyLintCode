import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum_58 {
    /**
     * @param numbers: Give an array
     * @param target: An integer
     * @return: Find all unique quadruplets in the array which gives the sum of zero
     */
    public List<List<Integer>> fourSum(int[] numbers, int target) {
        // write your code here
    	List<List<Integer>> results = new ArrayList<List<Integer>>();
    	
    	if(numbers == null || numbers.length < 4)
    		return results;
    	
    	Arrays.sort(numbers);
    	
    	for(int i = 0; i < numbers.length - 3; i++){
    		int a = numbers[i];
    		for(int j = i + 1; j < numbers.length - 2; j++){
    			int b = numbers[j];
    			for(int k = j + 1; k < numbers.length - 1; k++){
    				int c = numbers[k];
    				for(int t = k + 1; t < numbers.length; t++){
    					int d = numbers[t];
    					if(a + b + c + d == target){
    						List<Integer> item = new ArrayList<Integer>();
    						item.add(a);
    						item.add(b);
    						item.add(c);
    						item.add(d);
    						results.add(item);
    					}
    				}
    			}
    		}
    	}
    	
    	HashSet<List<Integer>> h = new HashSet<List<Integer>>(results);
    	results.clear();
    	results.addAll(h);
    	
    	return results;
    }
    
    public static void main(String args[]){
	    FourSum_58 obj = new FourSum_58();
		
		int[] numbers = {1, 0, -1, 0, -2, 2};
		int target = 0;
		
		obj.fourSum(numbers, target);
    }
}