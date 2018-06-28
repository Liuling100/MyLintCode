import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRestaurant_1143 {
    /**
     * @param list1: a list of strings
     * @param list2: a list of strings
     * @return: the common interest with the least list index sum
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        // Write your code here
    	String[] result = new String[1];
    	int length1 = list1.length;
    	int length2 = list2.length;
    	
    	for(int i = 0; i < Math.max(length1, length2); i++){
    		for(int j = 0; j < Math.min(length1, length2); j++){
        		if(list1[i] == list2[j]){
        			result[0] = list1[i];
        			break;
        		}
        	}
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	FindRestaurant_1143 obj = new FindRestaurant_1143();
    	String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    	String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    	
    	obj.findRestaurant(list1, list2);
    }
}