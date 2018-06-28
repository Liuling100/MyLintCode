package interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lintCodeClass.Interval;

public class MergeKSortedIntervalLists_577 {
	 /**
     * @param intervals: the given k sorted interval lists
     * @return:  the new sorted interval list
     */
    public List<Interval> mergeKSortedIntervalLists(List<List<Interval>> intervals) {
        // write your code here
    	if(intervals.size() == 0)
    		return new ArrayList<Interval>();
    	
    	List<Interval> results = new ArrayList<Interval>();
    	List<Interval> results2 = new ArrayList<Interval>();
    	
    	for(int i = 0; i < intervals.size(); i++){
    		List<Interval> list = intervals.get(i);
    		for(int j = 0; j < list.size(); j++){
    			Interval itr = list.get(j);
    			results.add(itr);
    		}
    	}
    	
    	results.sort(Comparator.comparing(i->i.start));
    	
    	Interval itr1 = results.get(0);
    	for(int i = 1; i < results.size(); i++){
    		Interval itr2 = results.get(i);
    		if(itr2.start <= itr1.end){
    			itr1.end = Math.max(itr2.end, itr1.end);
    		}else{
    			results2.add(itr1);
    			itr1 = itr2;
    		}
    	}
    	results2.add(itr1);
    	
    	return results2;
    }
    
    public static void main(String args[]){
    	MergeKSortedIntervalLists_577 obj = new MergeKSortedIntervalLists_577();
    	
    	List<List<Interval>> intervals = new ArrayList<List<Interval>>();
    	
    	List<Interval> list1 = new ArrayList<Interval>();
    	List<Interval> list2 = new ArrayList<Interval>();
    	
    	Interval i0 = new Interval(1,3);
    	Interval i1 = new Interval(4,7);
    	Interval i2 = new Interval(6,8);
    	Interval i3 = new Interval(1,2);
    	Interval i4 = new Interval(9,10);
    	
    	list1.add(i0);
    	list1.add(i1);
    	list1.add(i2);
    	list2.add(i3);
    	list2.add(i4);
    	
    	intervals.add(list1);
    	intervals.add(list2);
    	
    	obj.mergeKSortedIntervalLists(intervals);
    }
}
