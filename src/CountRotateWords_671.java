import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountRotateWords_671 {
    /*
     * @param words: A list of words
     * @return: Return how many different rotate words
     */
    public int countRotateWords(List<String> words) {
        // Write your code here
    	List<String> newWords = new ArrayList<String>();
    	for(int i = 0; i < words.size(); i++){
    		byte[] b = words.get(i).getBytes();
    		Arrays.sort(b);
    		String sNew = new String(b);
    		words.set(i, sNew);
    	}
    	
    	for(int i = 0; i < words.size(); i++){
    		String a = words.get(i);
    		if(!newWords.contains(a))
    			newWords.add(a);
    	}
    	
    	return newWords.size();
    }
    
    public static void main(String args[]){
    	CountRotateWords_671 obj = new CountRotateWords_671();
    	List<String> words = new ArrayList<String>();
    	words.add("picture");
    	words.add("turepic");
    	words.add("icturep");
    	words.add("word");
    	words.add("ordw");
    	words.add("lint");
    	System.out.println(obj.countRotateWords(words));
    }
}