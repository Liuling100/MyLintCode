package interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lintCodeClass.Interval;

public class CountOfAirplanes_391 {
	 /**
     * @param airplanes: An interval array
     * @return: Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) {
        // write your code here
    	int num = 0;
    	
    	if(airplanes.size() == 0 || airplanes.size() == 1)
    		return airplanes.size();
    	
    	airplanes.sort(Comparator.comparing(i->i.start));
    	
    	Interval plane1 = airplanes.get(0);
    	for(int i = 1; i < airplanes.size(); i++){
    		Interval plane2 = airplanes.get(i);
    		
    		if(plane2.start <= plane1.end){
    			++num;
    		}
    	}
    	
    	return num;
    }
    
    public static void main(String args[]){
    	CountOfAirplanes_391 obj = new CountOfAirplanes_391();
    	
    	List<Interval> airplanes = new ArrayList<Interval>();
    	Interval p0 = new Interval(1,10);
    	Interval p1 = new Interval(2,3);
    	Interval p2 = new Interval(5,8);
    	Interval p3 = new Interval(4,7);
    	airplanes.add(p0);
    	airplanes.add(p1);
    	airplanes.add(p2);
    	airplanes.add(p3);
    	
    	obj.countOfAirplanes(airplanes);
    }
}
