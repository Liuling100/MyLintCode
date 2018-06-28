import java.util.ArrayList;
import java.util.List;

public class GetAns_1443 {
	/**
     * @param S: a String consists of a and b
     * @return: the longest of the longest string that meets the condition
     */
    public int getAns(String S) {
        // Write your code here
    	if(S == null || S.length() < 2)
    		return 0;
    	
    	int numsA = 0;
    	int numsB = 0;
    	List<String> strLists = new ArrayList<String>();
    	
    	for(int i = 0; i < S.length(); i++){
    		int beginIndex = i;
    		
    		if(S.charAt(i) == 'A')
    			++numsA;
    		else
    			++numsB;
    		
    		for(int j = i + 1; j < S.length(); j++){
	    		if(S.charAt(j) == 'A')
	    			++numsA;
	    		else
	    			++numsB;
	    		
	    		if(numsA == numsB){
	    			int endIndex = j;
	    			strLists.add(S.substring(beginIndex, endIndex+1));
	    		}
    		}
			numsA = 0;
			numsB = 0;
    	}
    	
    	if(strLists == null || strLists.size() == 0)
    		return 0;
    	
    	int size = strLists.get(0).length();
    	for(int i = 1; i < strLists.size(); i++){
    		size = Math.max(size, strLists.get(i).length());
    	}
    	
    	return size;
    }
    
    public static void main(String args[]){
    	GetAns_1443 obj = new GetAns_1443();
    	
    	String S = "AAAAAA";
    	System.out.println(obj.getAns(S));
    }
}
