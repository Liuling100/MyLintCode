package sort;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection_547 {
    
    /*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
    	
    	Set<Integer> set1 = new HashSet<Integer>();
    	for(int i = 0; i < nums1.length; i++){
    		set1.add(nums1[i]);
    	}
    	
    	Set<Integer> set2 = new HashSet<Integer>();
    	for(int i = 0; i < nums2.length; i++){
    		if(set1.contains(nums2[i]))
    			set2.add(nums2[i]);
    	}
    	
    	Iterator<Integer> itr = set2.iterator();
    	int[] output = new int[set2.size()];
    	int i = 0;
    	
    	while(itr.hasNext()){
    		output[i++] = itr.next();
    	}
    	return output;
    }
    
    public static void main(String args[]){
    	Intersection_547 obj = new Intersection_547();
    	int[] nums1 = {1, 2, 2, 1};
    	int[] nums2 = {2, 2};
    	
    	System.out.println(obj.intersection(nums1, nums2));
    }
};
