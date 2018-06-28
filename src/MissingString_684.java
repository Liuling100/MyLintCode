import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingString_684 {
    /**
     * @param str1: a given string
     * @param str2: another given string
     * @return: An array of missing string
     */
    public List<String> missingString(String str1, String str2) {
        // Write your code here
    	List<String> output = new ArrayList<String>();
    	
        String[] str1s = str1.trim().split("\\s+");
        String[] str2s = str2.trim().split("\\s+");
        Map<Integer, String> str2Map = new HashMap<>();
        
        
        for(int i = 0; i < str2s.length; i++){
        	str2Map.put(i, str2s[i]);
        }
        
        for(int i = 0; i < str1s.length; i++){
        	String tmp = str1s[i];
        	if(!str2Map.containsValue(tmp)){
        		output.add(tmp);
        	}
        }
    	
    	return output;
    }
    
    public static void main(String args[]){
    	MissingString_684 obj = new MissingString_684();
    	String str1 = "This is an example";
    	String str2 = "is";
    	
    	System.out.println(obj.missingString(str1, str2));
    }
}