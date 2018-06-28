import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoSum_607 {
    /*
     * @param number: An integer
     * @return: nothing
     */
	List<Integer> nums = new ArrayList<Integer>();
    public void add(int number) {
        // write your code here
    	nums.add(number);
    }

    /*
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        // write your code here
    	Collections.sort(nums);
    	for(int i = 0, j = nums.size() - 1; i < j;){
    		if(nums.get(i) + nums.get(j) == value)
    			return true;
    		else if(nums.get(i) + nums.get(j) < value){
    			i++;
    		}else{
    			j--;
    		}
    	}
    	return false;
    }
    
    public static void main(String args[]){
    	TwoSum_607 obj = new TwoSum_607();
    	int n1 = 1;
    	int n2 = 3;
    	int n3 = 5;
    	int val1 = 4;
    	int val2 = 7;
    	
    }
}