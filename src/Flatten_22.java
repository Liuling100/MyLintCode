import java.util.ArrayList;
import java.util.List;

import lintCodeClass.NestedInteger;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Flatten_22 {

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
    }
    
    public static void main(String args[]){
    	Flatten_22 obj = new Flatten_22();
    	
    	NestedInteger int1 = new NestedInteger(0);
    	List<NestedInteger> nestedList = new ArrayList<NestedInteger>();
    	nestedList.add(int1);
    }
}