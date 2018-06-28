import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum_57 {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
    	List<List<Integer>> results = new ArrayList<List<Integer>>();
    	
    	if(numbers.length < 3)
    		return results;
    	
    	Arrays.sort(numbers);
    	
    	for(int i = 0; i < numbers.length - 2; i++){
    		int a = numbers[i];
    		for(int j = i + 1; j < numbers.length - 1; j++){
    			int b = numbers[j];
    			for(int k = j + 1; k < numbers.length; k++){
    				int c = numbers[k];
    				if((a + b + c) == 0){
    					List<Integer> item = new ArrayList<Integer>();
    					item.add(a);
    					item.add(b);
    					item.add(c);
    					results.add(item);
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
    	ThreeSum_57 obj = new ThreeSum_57();
    	
    	int[] numbers = {1,0,-1,-1,-1,-1,0,1,1,1};
    	
    	obj.threeSum(numbers);
    }
}