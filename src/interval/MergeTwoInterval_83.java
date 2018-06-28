package interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lintCodeClass.Interval;

/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class MergeTwoInterval_83 {
    /**
     * @param list1: one of the given list
     * @param list2: another list
     * @return: the new sorted list of interval
     */
    public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {
        // write your code here
    	
    	if(list1.size() == 0)
    		return list2;
    	
    	if(list2.size() == 0)
    		return list1;
    	
    	List<Interval> results = new ArrayList<Interval>();
    	for(Interval interval : list2){
    		list1.add(interval);
    	}
    	
    	list1.sort(Comparator.comparing(i -> i.start));
    	
    	Interval itr1 = list1.get(0);
    	
    	for(int i = 1; i < list1.size(); i++){
    		Interval itr2 = list1.get(i);
    		
    		if(itr2.start <= itr1.end){
    			itr1.end = Math.max(itr1.end, itr2.end);
    		}else{
    			results.add(itr1);
    			itr1 = itr2;
    		}
    	}
    	results.add(itr1);
    	
    	return results;
    }
    
    public static void main(String args[]){
    	MergeTwoInterval_83 obj = new MergeTwoInterval_83();
    	
    	List<Interval> list1 = new ArrayList<Interval>();
    	Interval i0 = new Interval(1, 2);
    	Interval i1 = new Interval(3, 4);
    	//list1.add(i0);
    	//list1.add(i1);
    	
    	List<Interval> list2 = new ArrayList<Interval>();
    	Interval i2 = new Interval(2, 3);
    	Interval i3 = new Interval(5, 6);
    	//list2.add(i2);
    	//list2.add(i3);
    	
    	obj.mergeTwoInterval(list1, list2);
    }
}
