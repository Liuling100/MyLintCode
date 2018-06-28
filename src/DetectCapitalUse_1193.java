public class DetectCapitalUse_1193 {
    /**
     * @param word: a string
     * @return: return a boolean
     */
    public boolean detectCapitalUse(String word) {
        // write your code here
    	if(word.length() <= 1)
    		return true;
    	
    	if(word.equals(word.toUpperCase()))
    		return true;
    	    	
    	for(int i = 1; i < word.length();i++){
    		if(Character.isUpperCase(word.charAt(i)))
    			return false;
    	}
    	
    	return true;
    }
    
    public static void main(String args[]){
    	DetectCapitalUse_1193 obj = new DetectCapitalUse_1193();
    	String word = "USA";
    	
    	System.out.println(obj.detectCapitalUse(word));
    }
}