public class CountAndSay_420 {
    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public String countAndSay(int n) {
        // write your code here
    	String str = Integer.toString(n);
    	
    	if(str.length() == 1){
    		return "1"+ str.charAt(0);
    	}
    	
    	String results = "";
    	for(int i = 0; i < str.length(); i++){
    		char a = str.charAt(i);
    		int counts = 1;
    		for(int j = i + 1; j < str.length(); j++){
    			char b = str.charAt(j);
    			if(a == b){
    				++counts;
    				i = j;
    			}else{
    				break;
    			}
    		}

			results += (Integer.toString(counts) + a);
    	}
    	return results;
    }
    
    public static void main(String args[]){
    	CountAndSay_420 obj = new CountAndSay_420();
    	
    	int n = 21;
    	System.out.println(obj.countAndSay(n));
    }
}