

public class ReverseWords_53 {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
    	if(s == null || s.length() == 0)
    		return s;
    	
    	
    	String[] strs = s.trim().split("\\s+");
    	
    	for(int i = 0, j = strs.length - 1; i < j; i++, j--){    		
    		String tmp = "";
    		tmp = strs[i];
    		strs[i] = strs[j];
    		strs[j] = tmp;
    	}
    	
    	return String.join(" ", strs);
    }
    
    public static void main(String args[]){
    	ReverseWords_53 obj = new ReverseWords_53();
    	String str = "the";
    	
    	System.out.println(obj.reverseWords(str));
    }
}