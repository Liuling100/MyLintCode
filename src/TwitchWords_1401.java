import java.util.ArrayList;
import java.util.List;

public class TwitchWords_1401 {
    /**
     * @param str: the origin string
     * @return: the start and end of every twitch words
     */
    public int[][] twitchWords(String str) {
        // Write your code here
    	List<Integer> resultList = new ArrayList<Integer>();
    	
    	int twitch = 0;
    	for(int i = 0; i < str.length();i++){
    		char a = str.charAt(i);
    		int start = i, end = i;
    		for(int j = i + 1; j < str.length(); j++){
    			char b = str.charAt(j);
    			if( a == b){
    				end = j;
    				++twitch;
    			}else{
    				break;
    			}
    		}
    		if(twitch != 0 && twitch >= 2){
    			i = end;
	    		resultList.add(start);
	    		resultList.add(end);
    		}
			twitch = 0;
    	}
    	
    	int length = resultList.size() / 2;
    	int[][] result = new int[length][2];
    	int index = 0;
    	for(int i = 0; i < length; i++){
    		result[i][0] = resultList.get(index++);
    		result[i][1] = resultList.get(index++);
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	TwitchWords_1401 obj = new TwitchWords_1401();
    	String str = "llavttupppteewjtooob";
    	System.out.println(obj.twitchWords(str));
    }
}