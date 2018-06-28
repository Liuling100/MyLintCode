package traversal;

import java.util.ArrayList;
import java.util.List;

public class ProductExcludeItself_50 {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
    	List<Long> result = new ArrayList<Long>();
    	
    	if(nums.size() == 0)
    		return result;
    	
    	
    	for(int i = 0; i < nums.size(); i++){
    		List<Integer> tmp = newTmp(nums);
    		tmp.remove(i);
    		result.add(multiplyAll(tmp));
    	}
    		
    	return result;
    }
    
    public List<Integer> newTmp(List<Integer> A){
    	List<Integer> result = new ArrayList<Integer>();
    	for(Integer i : A)
    		result.add(i);
    	
    	return result;
    } 
    
    public Long multiplyAll(List<Integer> A){
    	Long result = (long) 1;
    	
    	for(Integer i : A){
    		result *= i;
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	ProductExcludeItself_50 obj = new ProductExcludeItself_50();
    	
    	List<Integer> nums = new ArrayList<Integer>();
    	nums.add(1);
    	nums.add(2);
    	nums.add(3);
    	obj.productExcludeItself(nums);
    }
}
