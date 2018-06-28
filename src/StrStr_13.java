public class StrStr_13 {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here
    	if(source == null || target == null || source.length() < target.length()){
    		return -1;
    	}
    	
    	if(source == "" && target == "")
    		return 0;
    	
    	int index = -1;
    	for(int i = 0; i < source.length() - target.length() + 1; i++){
    		String tmp = source.substring(i, i + target.length());
    		if(tmp.equals(target)){
    			index = i;
    			break;
    		}
    	}
    	return index;
    }
    
    public static void main(String args[]){
    	StrStr_13 obj =new StrStr_13();
    	
    	String source = "lintcode";
    	String target = "lintcode";
    	
    	obj.strStr(source, target);
    }
}