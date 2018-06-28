import java.util.HashMap;
import java.util.Map;

public class CanConstruct_1270 {
    /**
     * @param ransomNote: a string
     * @param magazine: a string
     * @return: whether the ransom note can be constructed from the magazines
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        // Write your code here
    	if(magazine.length() == 0 && ransomNote.length() == 0)
    		return true;
    	
    	if(magazine.length() == 0 && ransomNote.length() != 0 || ransomNote.length() > magazine.length())
    		return false;
    	

		int index = 0;
    	for(int i = 0; i < ransomNote.length(); i++){
    		char a = ransomNote.charAt(i);
    		boolean exist = false;
    		for(int j = index; j < magazine.length(); j++){
    			char b = magazine.charAt(j);
    			if(a == b){
    				index = j+1;
    				exist = true;
    				break;
    			}
    		}
    		if(!exist)
    			return false;
    	}
    	
    	return true;
    }
    
    public static void main(String args[]){
    	CanConstruct_1270 obj = new CanConstruct_1270();
    	String ransomNote = "aa";
    	String magazine = "ab";
    	System.out.println(obj.canConstruct(ransomNote, magazine));
    }
}