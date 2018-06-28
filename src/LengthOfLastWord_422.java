import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord_422 {
    /**
     * @param s: A string
     * @return: the length of last word
     */
    public int lengthOfLastWord(String s) {
        // write your code here
    	if(s == null || s.length() == 0)
    		return 0;
    	
    	if(s.length() == 1)
    		return 1;
    	
    	String[] strLists = s.split(" ");
    	return strLists[strLists.length - 1].length();    	
    }
    
    public static void main(String args[]){
    	LengthOfLastWord_422 obj = new LengthOfLastWord_422();
    	
    	String s = "a";
    	
    	System.out.println(obj.lengthOfLastWord(s));
    }
}