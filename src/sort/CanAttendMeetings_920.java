package sort;

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

public class CanAttendMeetings_920 {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
    	if(intervals.isEmpty())
    		return true;
    	
    	
    	
    	// Put all intervals into a hashmap; key is the start, value is the end.
    	for(int i = 0; i < intervals.size(); i++){
    		Interval itv = intervals.get(i);
    		int itvStart = itv.start;
    		int itvEnd = itv.end;
    		
    		if(itvStart > itvEnd)
    			return false;  		
    	}
    	
    	// Sort the map, based on itvStart
    	quickSort(intervals, 0, intervals.size() - 1);
    	
    	// Put the sorted intervals into an array
    	List<Integer> array = new ArrayList<Integer>();
    	for(int i = 0; i < intervals.size(); i++){
    		array.add(intervals.get(i).start);
    		array.add(intervals.get(i).end);
    	}
    	
    	// Check whether the array is sorted.
    	return checkOrder(array);
    }
    
    private boolean checkOrder(List<Integer> array) {
		for(int i = 0; i < array.size() - 1; i++){
			if(array.get(i) > array.get(i + 1))
				return false;
		}
		return true;
	}

	private void quickSort(List<Interval> intervals, int start, int end) {
		int i = start;
		int j = end;
		Interval pivot = intervals.get(start);
		
		while(i < j){
			while(i < j && intervals.get(j).start > pivot.start)
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
    	CanAttendMeetings_920 obj = new CanAttendMeetings_920();
    	
    	List<Interval> intervals = new ArrayList<Interval>();
    	Interval i1 = new Interval(5, 8);
    	Interval i2 = new Interval(6, 8);
    	//Interval i3 = new Interval(15, 20);
    	//intervals.add(i3);
    	intervals.add(i2);
    	intervals.add(i1);
    	
    	System.out.println(obj.canAttendMeetings(intervals));
    }
}