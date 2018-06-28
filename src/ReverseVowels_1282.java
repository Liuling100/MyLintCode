import java.util.ArrayList;
import java.util.List;

public class ReverseVowels_1282 {
    /**
     * @param s: a string
     * @return: reverse only the vowels of a string
     */
    public String reverseVowels(String s) {
        // write your code here
    	if(s.length() <= 1)
    		return s;
    	
    	List<Integer> vowelIndex = new ArrayList<Integer>();
    	
    	for(int i = 0; i < s.length(); i++){
    		if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'
    			|| s.charAt(i) == 'A' || s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'	){
    			vowelIndex.add(i);
    		}
    	}
    	StringBuilder strBuilder = new StringBuilder(s);  
    	for(int i = 0, j = vowelIndex.size() - 1; i < j; i++, j--){
    		char tmp = s.charAt(vowelIndex.get(i));
    		strBuilder.setCharAt(vowelIndex.get(i), s.charAt(vowelIndex.get(j)));
    		strBuilder.setCharAt(vowelIndex.get(j), tmp);
    	}
    	
    	return strBuilder.toString();
    }
    
    public static void main(String args[]){
    	ReverseVowels_1282 obj = new ReverseVowels_1282();
    	String s = "lintcode";
    	System.out.println(obj.reverseVowels(s));
    }
}