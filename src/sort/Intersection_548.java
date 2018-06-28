package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_548 {
	/*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
    	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i = 0; i < nums1.length; i++){
    		if(map.containsKey(nums1[i]))
    			map.put(nums1[i], map.get(nums1[i]) + 1);
    		else
    			map.put(nums1[i], 1);
    	}
    	
    	List<Integer> results = new ArrayList<Integer>();
    	for(int i = 0; i < nums2.length; i++){
    		if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
    			results.add(nums2[i]);
    			map.put(nums2[i], map.get(nums2[i]) - 1);
    		}
    			
    	}
    	
    	int[] output = new int[results.size()];
    	for(int i = 0; i < results.size(); i++){
    		output[i] = results.get(i);
    	}
    	
    	return output;
    }
    
    public static void main(String args[]){
    	Intersection_548 obj = new Intersection_548();
    	
    	int[] nums1 = {4,7,9,7,6,7};
    	int[] nums2 = {5,0,0,6,1,6,2,2,4};
    	obj.intersection(nums1, nums2);
    }
}
