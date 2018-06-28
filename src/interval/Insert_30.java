package interval;

import java.util.ArrayList;
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

public class Insert_30 {
    /**
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
    	if(newInterval == null || intervals == null)
    		return intervals;
    	
    	List<Interval> results = new ArrayList<Interval>();
    	int insertPos = 0;
    	
    	for(Interval interval : intervals){
    		if(interval.end < newInterval.start){
    			results.add(interval);
    			insertPos++;
    		}else if(interval.start > newInterval.end){
    			results.add(interval);
    		}else{
    			newInterval.start = Math.min(interval.start, newInterval.start);
    			newInterval.end = Math.max(interval.end, newInterval.end);
    		}
    	}
    	
    	results.add(insertPos, newInterval);
    	
    	return results;
    }
    
    public static void main(String args[]){
    	Insert_30 obj = new Insert_30();
    	
    	Interval newInterval = new Interval(0, 3);
    	Interval interval1 = new Interval(1, 5);
    	//Interval interval2 = new Interval(5, 9);
    	List<Interval> intervals = new ArrayList<Interval>();
    	intervals.add(interval1);
    	//intervals.add(interval2);
    	
    	obj.insert(intervals, newInterval);
    }
}
