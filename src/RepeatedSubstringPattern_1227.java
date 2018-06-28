public class RepeatedSubstringPattern_1227 {
    /**
     * @param s: a string
     * @return: return a boolean
     */
    public boolean repeatedSubstringPattern(String s) {
        // write your code here
    	if(s.length() <= 1)
    		return true;

    	// achieve sub strings
    	String subStr = "";
    	char first = s.charAt(0);
		for(int j = 1; j < s.length(); j++){
			if(first == s.charAt(j)){
				subStr = s.substring(0, j);
				break;
			}
		}
    	
    	// check
		for(int i = subStr.length(); i < s.length(); i+=subStr.length()){
			if((i+subStr.length() > s.length() || !subStr.equals(s.substring(i, i+subStr.length()))))
				return false;
		}
    	
		return true;
    }
    
    public static void main(String args[]){
    	RepeatedSubstringPattern_1227 obj = new RepeatedSubstringPattern_1227();
    	String s = "abcabcabcabc";
    	System.out.println(obj.repeatedSubstringPattern(s));
    }
}