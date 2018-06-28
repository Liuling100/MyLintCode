package sort;

import java.util.ArrayList;
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
    	if(intervals.size()<=1)
    		return intervals;
    	
    	List<Interval> output = new ArrayList<Interval>();
    	
    	// check each interval
    	for(int i = 0; i < intervals.size(); i++){
    		Interval itv = intervals.get(i);
    		int itvStart = itv.start;
    		int itvEnd = itv.end;
    		
    		if(itvStart > itvEnd)
    			return output;  		
    	}
    	
    	// Sort the map, based on itvStart
    	quickSort(intervals, 0, intervals.size() - 1);
    	
    	output = intervalsToArray(intervals);
    	
    	return output;
    }
    
    public List<Interval> intervalsToArray(List<Interval> intervals){
    	// Put the sorted intervals into an array
    	List<Integer> array = new ArrayList<Integer>();
    	for(int i = 0; i < intervals.size(); i++){
    		array.add(intervals.get(i).start);
    		array.add(intervals.get(i).end);
    	}
    	
    	// check array's order
    	array = processArray(array);
    	
    	// creat new intervals
    	return arrayToInterval(array);
    }
    
    private List<Interval> arrayToInterval(List<Integer> array) {
    	List<Interval> newIntervals = new ArrayList<Interval>();
		for(int i = 0; i < array.size(); i+=2){
			Interval itv = new Interval(array.get(i), array.get(i + 1));
			newIntervals.add(itv);
		}
		return newIntervals;
	}

	public List<Integer> processArray(List<Integer> array){
    	for(int i = 0; i < array.size() - 1; i++){
			if(array.get(i) > array.get(i + 1)){
				array.remove(i);
				array.remove(i);
				i--;
			}
		}
    	return array;
    }
    
    private void quickSort(List<Interval> intervals, int start, int end) {
		int i = start;
		int j = end;
		Interval pivot = intervals.get(start);
		
		while(i < j){
			while(i < j && intervals.get(j).start >= pivot.start)
				j--;
			
			intervals.set(i, intervals.get(j));
			
			while(i < j && intervals.get(i).start < pivot.start)
				i++;
			
			intervals.set(j, intervals.get(i));
		}
		
		intervals.set(j, pivot);
		
		if(i - 1 > start)
			quickSort(intervals, start, i - 1);
		
		if(i + 1 < end)
			quickSort(intervals, i + 1, end);
	}
    
    public static void main(String args[]){
    	Merge_156 obj = new Merge_156();
    	
    	List<Interval> intervals = new ArrayList<Interval>();
    	Interval i1 = new Interval(1, 3);
    	Interval i2 = new Interval(2, 6);
    	Interval i3 = new Interval(8, 10);
    	Interval i4 = new Interval(15, 18);
    	intervals.add(i4);
    	intervals.add(i3);
    	intervals.add(i2);
    	intervals.add(i1);
    	
    	obj.merge2(intervals);
    }

	private List<Interval> merge2(List<Interval> intervals) {
		if(intervals == null || intervals.size() <= 1)
			return intervals;
		
		List<Interval> output = new ArrayList<Interval>();
		
		intervals.sort(Comparator.comparing(i -> i.start));
		
		Interval last = null;
		for(Interval item : intervals){
			if(last == null || last.end < item.start){
				output.add(item);
				last = item;
			}else{
				last.end = Math.max(last.end, item.end);
			}
				
		}
		return output;
	}
}
