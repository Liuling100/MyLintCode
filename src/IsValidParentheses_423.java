import java.util.Stack;

public class IsValidParentheses_423 {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
    	if(s.length() == 0 || s.length() == 1)
    		return false;
    	
    	Stack<Character> x = new Stack<Character>();
    	for(int i = 0; i < s.length(); i++){
    		if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' )
    			x.push(s.charAt(i));
    		else{
	    		if(x.size() == 0)
	    			return false;
	    		
	    		char top = x.pop();
	    		
	    		if (s.charAt(i) == ')' && top != '(') 
	    			return false;
	    		
	            if (s.charAt(i) == ']' && top != '[') 
	            	return false;
	            
	            if (s.charAt(i) == '}' && top != '{') 
	            	return false;
    		}
    		
    	}
    	
    	return x.size()==0;
    }
    
    public static void main(String args[]){
    	IsValidParentheses_423 obj = new IsValidParentheses_423();
    	
    	String s = "([]{}";
    	System.out.println(obj.isValidParentheses(s));
    }
}