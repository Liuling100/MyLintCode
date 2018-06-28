import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWords_1204 {
    /**
     * @param words: a list of strings
     * @return: return a list of strings
     */
    public String[] findWords(String[] words) {
        // write your code here
    	if(words == null)
    		return null;
    	
    	if(words.length == 0)
    		return new String[1];
    	
    	List<Map<Integer, String>> checkLines = new ArrayList<Map<Integer, String>>();
    	
    	Map<Integer, String> line0 = setValue0();
    	
    	Map<Integer, String> line1 = setValue1();

    	Map<Integer, String> line2 = setValue2();
    	
    	checkLines.add(line0);
    	checkLines.add(line1);
    	checkLines.add(line2);
    	
    	List<String> resultList = new ArrayList<String>();
    	
    	for(int i = 0; i < words.length; i++){
    		String word = words[i];
    		
    		Map<Integer, String> tmpLine = selectLine(word.charAt(0)+"", line0, line1, line2);
    		for(int j = 1; j < word.length(); j++){
    			if(!tmpLine.containsValue(word.charAt(j)+""))
    				break;
    			
    			if(j==word.length()-1)
    				resultList.add(word);
    		}
    	}
    	
    	String[] result = new String[resultList.size()];
    	for(int i = 0; i < result.length; i++)
    		result[i] = resultList.get(i);
    	
    	return result;
    }
    
    public Map<Integer, String> selectLine(String str, Map<Integer, String> line0, Map<Integer, String> line1, Map<Integer, String> line2){
    	if(line0.containsValue(str.toLowerCase()))
    		return line0;
    	else if(line1.containsValue(str.toLowerCase()))
    		return line1;
    	else if(line2.containsValue(str.toLowerCase()))
    		return line2;
    	
    	return null;
    }
    
    public Map<Integer, String> setValue0(){
    	Map<Integer, String> line0 = new HashMap<Integer, String>();
    	int index0 = 0;
    	line0.put(index0++, "unCap");
    	line0.put(index0++, "q");
    	line0.put(index0++, "w");
    	line0.put(index0++, "e");
    	line0.put(index0++, "r");
    	line0.put(index0++, "t");
    	line0.put(index0++, "y");
    	line0.put(index0++, "u");
    	line0.put(index0++, "i");
    	line0.put(index0++, "o");
    	line0.put(index0++, "p");
    	return line0;
    }
    
    public Map<Integer, String> setValue1(){
    	Map<Integer, String> line1 = new HashMap<Integer, String>();
    	int index1 = 0;
    	line1.put(index1++, "cap");
    	line1.put(index1++, "a");
    	line1.put(index1++, "s");
    	line1.put(index1++, "d");
    	line1.put(index1++, "f");
    	line1.put(index1++, "g");
    	line1.put(index1++, "h");
    	line1.put(index1++, "j");
    	line1.put(index1++, "k");
    	line1.put(index1++, "l");
    	line1.put(index1++, "p");
    	return line1;
    }
   
    public Map<Integer, String> setValue2(){
    	Map<Integer, String> line2 = new HashMap<Integer, String>();
    	int index2 = 0;
    	line2.put(index2++, "unCap");
    	line2.put(index2++, "z");
    	line2.put(index2++, "x");
    	line2.put(index2++, "c");
    	line2.put(index2++, "v");
    	line2.put(index2++, "b");
    	line2.put(index2++, "n");
    	line2.put(index2++, "m");
    	return line2;
    }
    
    public static void main(String arg[]){
    	FindWords_1204 obj = new FindWords_1204();
    	String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    	obj.findWords(words);
    }
}