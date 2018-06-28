package interval;

import java.util.ArrayList;
import java.util.Arrays;
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

public class Merge_156 {
    /**
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
    	if(intervals.size() == 0 || intervals.size() == 1)
    		return intervals;
    	
    	List<Interval> results = new ArrayList<Interval>();
    	Collections.sort(intervals, new IntervalComparator());
    	
    	Interval itr1 = intervals.get(0);
    	for(int i = 1; i < intervals.size(); i++){
    		Interval itr2 = intervals.get(i);
    		
    		if(itr2.start >= itr1.start && itr2.start <= itr1.end){
    			itr1.end = Math.max(itr1.end, itr2.end);
    		}else{
    			results.add(itr1);
    			itr1 = itr2;
    		}
    	}
    	
    	results.add(itr1);
    	
    	return results;
    }
    
    private class IntervalComparator implements Comparator<Interval> {
    	 public int compare(Interval a, Interval b) {
             return a.start - b.start;
         }
    }
    
    public static void main(String args[]){
    	Merge_156 obj = new Merge_156();
    	
    	Interval interval0 = new Interval(1,4);
    	Interval interval1 = new Interval(0,2);
    	Interval interval2 = new Interval(3,5);
    	//Interval interval3 = new Interval(15, 18);
    	
    	List<Interval> intervals = new ArrayList<Interval>();
    	intervals.add(interval1);
    	intervals.add(interval0);
    	intervals.add(interval2);
    	//intervals.add(interval3);
    	
    	obj.merge(intervals);
    }
}
