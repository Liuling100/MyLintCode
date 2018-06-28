import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams_647 {
    /**
     * @param s: a string
     * @param p: a string
     * @return: a list of index
     */
    public List<Integer> findAnagrams(String s, String p) {
        // write your code here
    	List<Integer> result = new ArrayList<Integer>();
    	
    	if(s.length() < p.length() || s == null || s.length() == 0 || p == null || p.length() == 0)
    		return result;
    	
    	for(int i = 0; i < s.length() - p.length() + 1; i++){
    		if(isMatch(s.substring(i, i + p.length()), p)){
    			result.add(i);
    		}
    	}
    	
    	return result;
    }
    
    public boolean isMatch(String subStr, String p) {
		char[] char1 = new char[subStr.length()];
		char[] char2 = new char[p.length()];
		
		for(int i = 0; i < p.length(); i++){
			char1[i] = subStr.charAt(i);
			char2[i] = p.charAt(i);
		}
    	
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		for(int i = 0; i < p.length(); i++){
			if(char1[i] != char2[i])
				return false;
		}
    	
		return true;
	}

	public static void main(String args[]){
    	FindAnagrams_647 obj = new FindAnagrams_647();
    	String s = "abab";
    	String p = "ab";
    	
    	obj.findAnagrams(s, p);
    }
}