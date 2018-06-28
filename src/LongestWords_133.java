import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestWords_133 {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
        // write your code here
    	List<String> results = new ArrayList<String>();
    	
    	if(dictionary.length == 0 || dictionary == null)
    		return results;
    	
    	if(dictionary.length == 1){
    		results.add(dictionary[0]);
    	}
    	
    	
    	int index = 0;
    	int max = dictionary[index].length();
    	for(int i = 1; i < dictionary.length; i++){
    		if(max < dictionary[i].length()){
    			index = i;
    			max = dictionary[i].length();
    		}
    	}
    	
    	for(int i = 0; i < dictionary.length; i++){
    		if(dictionary[i].length() == max){
    			results.add(dictionary[i]);
    		}
    	}
    				
    	return results;
    }
    
    public static void main(String args[]){
    	LongestWords_133 obj = new LongestWords_133();
    	
    	String[] dictionary = {"like",
    			  "love",
    			  "hate",
    			  "yes",
    			  "none"};
    	
    	obj.longestWords(dictionary);
    }
}