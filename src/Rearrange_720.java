import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rearrange_720 {
    /**
     * @param str: a string containing uppercase alphabets and integer digits
     * @return: the alphabets in the order followed by the sum of digits
     */
    public String rearrange(String str) {
        // Write your code here
    	if(str == null || str.length() <= 1)
    		return str;    	
    	
    	List<Character> list = new ArrayList<Character>();
    	int sum = 0;
    	for(int i = 0; i < str.length(); i++){
    		char ele = str.charAt(i);
    		if(Character.isDigit(ele))
    			sum += ele - '0';
    		else
    			list.add(ele);
    	}
    	Collections.sort(list);
    	
    	String result = "";
    	for(int i = 0; i < list.size(); i++){
    		result += list.get(i);
    	}
    	
    	return result+ sum;
    }

    public static void main(String args[]){
    	Rearrange_720 obj = new Rearrange_720();
    	String str = "AC2BEW3";
    	
    	System.out.println(obj.rearrange(str));
    }
}