public class FirstUniqChar_209 {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
    	if(str == null)
    		return (Character) null;
    	
    	if(str.length() == 1)
    		return str.charAt(0);
    	
    	char[] result = new char[1];
    	for(int i = 0; i < str.length(); i++){
    		int count = 1;
    		for(int j = i + 1; j < str.length(); j++){
    			if(str.charAt(i) == str.charAt(j)){
    				++count;
    			}
    		}
			
			if(count == 1){
				result[0] = str.charAt(i);
				break;
			}
    	}
    	return result[0];
    }
    
    public static void main(String args[]){
    	FirstUniqChar_209 obj = new FirstUniqChar_209();
    	
    	String str = "aabc";
    	System.out.println(obj.firstUniqChar(str));
    }
}