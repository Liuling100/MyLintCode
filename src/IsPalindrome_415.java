import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class IsPalindrome_415 {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
    	if(s == null || s.length() < 2)
    		return true;
    	
    	s = s.replaceAll("[^(a-zA-Z0-9)]", "").toLowerCase();  
    	for(int i = 0, j = s.length() - 1; i < j; i++, j--){
    		char a = s.charAt(i);
    		char b = s.charAt(j);
    		
    		if(a != b){
    			return false;
    		}
    	}    	
    	return true;
    }
    
    public static void main(String args[]){
    	IsPalindrome_415 obj = new IsPalindrome_415();
    	String s = "race a car";
    	System.out.println(obj.isPalindrome(s));
    }
}