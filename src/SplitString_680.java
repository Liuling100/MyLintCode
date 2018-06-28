import java.util.ArrayList;
import java.util.List;

public class SplitString_680 {
    /*
     * @param : a string to be split
     * @return: all possible split string array
     */
    public List<List<String>> splitString(String s) {
        // write your code here
    	List<List<String>> results = new ArrayList<List<String>>();
    	
    	if(s.length() == 1){
    		List<String> list = new ArrayList<String>();
    		list.add(s.charAt(0) + "");
    		results.add(list);
    	}else if(s.length() == 2){
    		List<String> list = new ArrayList<String>();
    		list.add(s.charAt(0) + "");
    		list.add(s.charAt(1) + "");
    		list.add(s);
    	}
    		
    	
    	return results;
    }
    
    public static void main(String args[]){
    	SplitString_680 obj = new SplitString_680();
    	
    	String s = "123";
    	obj.splitString(s);
    }
}