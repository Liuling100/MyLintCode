import java.util.HashMap;
import java.util.Map;

public class FindTheDifference_1266 {
    /**
     * @param s: a string
     * @param t: a string
     * @return: the letter that was added in t
     */
    public char findTheDifference(String s, String t) {
    	Map<Integer, Character> mapS = new HashMap<Integer, Character>();
    	Map<Integer, Character> mapT = new HashMap<Integer, Character>();
    	
    	for(int i = 0; i < s.length(); i++){
    		mapS.put(i, s.charAt(i));
    	}
    	
    	for(int i = 0; i < t.length(); i++){
    		mapS.put(i, t.charAt(i));
    	}
    	
    	for(int i = 0; i < t.length(); i++){
    		if(!mapS.containsValue(mapT.get(i))){
    			return mapT.get(i);
    		}
    	}
    	return t.charAt(0);
    }
    
    public static void main(String args[]){
    	FindTheDifference_1266 obj = new FindTheDifference_1266();
    	String s = "abcd";
    	String t= "abcde";
    	System.out.println(obj.findTheDifference(s, t));
    }
}