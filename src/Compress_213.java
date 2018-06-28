
public class Compress_213 {
	 /**
     * @param str: a string
     * @return: a compressed string
     */
    public String compress(String str) {
        // write your code here
    	if(str == null || str.length() < 2)
    		return str;
    	
    	String result = "";
    	
    	for(int i = 0; i < str.length(); i++){
    		char a = str.charAt(i);
    		int nums = 1;
    		for(int j = i + 1; j < str.length(); j++){
    			char b = str.charAt(j);
    			if(a == b){
    				++nums;
    				i = j;
    			}else{
    				break;
    			}
    		}
    		result += (a + Integer.toString(nums));
    		nums = 0;
    	}
    	
    	if(result.length() >= str.length())
    		return str;
    	else
    		return result;
    }
    
    public static void main(String args[]){
    	Compress_213 obj = new Compress_213();
    	
    	String str = "aabbcc";
    	System.out.println(obj.compress(str));
    }
}
