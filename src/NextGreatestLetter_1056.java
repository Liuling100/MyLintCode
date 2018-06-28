import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreatestLetter_1056 {
	/**
     * @param letters: a list of sorted characters
     * @param target: a target letter
     * @return: the smallest element in the list that is larger than the given target
     */
    public char nextGreatestLetter(char[] letters, char target) {
        // Write your code here
    	Arrays.sort(letters);
    	
    	for(int i = 0; i < letters.length; i++){
    		if(letters[i] > target)
    			return letters[i];
    	}
    	
    	return letters[0];
    }
    
    public static void main(String args[]){
    	NextGreatestLetter_1056 obj = new NextGreatestLetter_1056();
    	char[] letters = {'c', 'f', 'j'};
    	char target = 'c';
    	System.out.println(obj.nextGreatestLetter(letters, target));
    }
}
