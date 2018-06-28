
public class LicenseKeyFormatting_1214 {
	/**
     * @param S: a string
     * @param K: a integer
     * @return: return a string
     */
    public String licenseKeyFormatting(String S, int K) {
        // write your code here
    	if(S == null)
    		return null;
    	
    	if(S.length() == 0 || K <= 0)
    		return "";
    	
    	String result = "";
    	
    	String[] strs = S.split("-");
    	if(strs.length == 1){
    		if(strs[0].length() <= K){
    			result = strs[0];
    		}else{
    			result = changeString(strs,K);
    		}
			return result;
    	}else{
    		if(strs[0].length() <= K){
    			if(strs[0] != "")
    				result = strs[0] + "-";
    			
    			String[] newStrs = new String[strs.length - 1];
    			for(int i = 1; i < strs.length; i++)
    				newStrs[i-1]=strs[i];
    			
    			result += changeString(newStrs,K);
    			
    		}else{
    			
    			result = changeString(strs,K);
    		}
    	}
    		
    	return result.toUpperCase();
    }
    
    public String changeString(String[] strs, int k){
    	String result = "";
    	String result1 = "";
    	
    	for(int i = 0; i < strs.length; i++){
    		result += strs[i];
    	}
    	
    	for(int i = 0; i < result.length(); i++){
    		if(i == 0)
    			result1 += result.charAt(0);
    		else{
        		if(i % k != 0){
        			result1 += result.charAt(i);
        		}else{
        			result1 += ("-"+result.charAt(i));
        		}
    		}
    	}
    	
    	return result1;
    }
    
    public static void main(String args[]){
    	LicenseKeyFormatting_1214 obj = new LicenseKeyFormatting_1214();
    	String S = "---EhjmFocBlI";
    	int K = 4;
    	System.out.println(obj.licenseKeyFormatting(S, K));
    }
}
