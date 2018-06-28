import java.util.HashMap;
import java.util.Map;

public class WordPattern_828 {
    /**
     * @param pattern: a string, denote pattern string
     * @param str: a string, denote matching string
     * @return: an boolean, denote whether the pattern string and the matching string match or not
     */
    public boolean wordPattern(String pattern, String str) {
        // write your code here
    	String[] strs = str.split(" ");
    	char[] patterns = pattern.toCharArray();
    	Map<Character, String> maps = new HashMap<>();
    	
    	if(strs.length != patterns.length)
    		return false;
    	
    	for(int i = 0; i < patterns.length; i++){
    		char ch = patterns[i];
    		if(maps.containsKey(ch)){
    			
    			String value = maps.get(ch);
    			if(!value.equals(strs[i]))
    				return false;
    			
    		}else{
    			
    			if(maps.containsValue(strs[i]))
    				return false;
    			
    			maps.put(ch, strs[i]);
    		}
    	}
    	
    	return true;
    }
    
    public static void main(String args[]){
    	WordPattern_828 obj = new WordPattern_828();
    	String pattern = "abba";
    	String str = "dog dog dog dog";
    	System.out.println(obj.wordPattern(pattern, str));
    }
}