import java.util.Arrays;

public class Anagram_158 {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
    	if(s.length() != t.length())
    		return false;
    	
    	char[] sCh = s.toCharArray();
    	Arrays.sort(sCh);
    	
    	char[] tCh = t.toCharArray();
    	Arrays.sort(tCh);
    	  	
    	boolean equals = true;
    	for(int i = 0; i < sCh.length; i++){
    		if(sCh[i] != tCh[i]){
    			equals = false;
    			break;
    		}
    			
    	}
    	
    	return equals;
    }
    
    public static void main(String args[]){
    	Anagram_158 obj = new Anagram_158();
    	String s = "ab";
    	String t = "dc";
    	System.out.println(obj.anagram(s, t));
    }
}