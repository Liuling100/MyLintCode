public class IsStrobogrammatic_644 {
    /**
     * @param num: a string
     * @return: true if a number is strobogrammatic or false
     */
    public boolean isStrobogrammatic(String num) {
        // write your code here
    	if(num == null)
    		return true;
    	
    	if(num.length() == 1){
    		if(num.charAt(0) == '8' || num.charAt(0) == '0' || num.charAt(0) == '1'){
    			return true;
    		}else{
        		return false;
    		}
    	} 
    	
    	for(int i = 0, j = num.length() - 1; i < j; i++, j--){
    		char ch1 = num.charAt(i);
    		char ch2 = num.charAt(j);
    		
    		if(isValid(ch1) && isValid(ch2)){        		
    			if(!(Integer.parseInt(ch1+"") == Integer.parseInt(ch2+"")
    					|| Integer.parseInt(ch1+"") == 6 && Integer.parseInt(ch2+"") == 9
    					|| Integer.parseInt(ch1+"") == 9 && Integer.parseInt(ch2+"") == 6)){
    				return false;
    			}
    		}else{
    			return false;
    		}
    		
    		if(num.length() % 2 != 0){
    			return isValid(num.charAt((num.length()-1)/2));
    		}
    	}
    	
    	return true;
    }
    
    public boolean isValid(char ch){
    	if(ch == '8' || ch == '0' || ch == '1' || ch == '6' || ch == '9'){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    public static void main(String args[]){
    	IsStrobogrammatic_644 obj = new IsStrobogrammatic_644();
    	
    	String num = "96801866799810896";
    	System.out.println(obj.isStrobogrammatic(num));
    }
}