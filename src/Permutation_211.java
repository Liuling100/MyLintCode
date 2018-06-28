import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation_211 {
	/**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here    	
    	char[] chA = A.toCharArray();
    	char[] chB = B.toCharArray();
    	
    	if(chA.length != chB.length)
    		return false;
    	
    	List<Character> listA = new ArrayList<Character>();
    	List<Character> listB = new ArrayList<Character>();
    	for(int i = 0; i < chA.length; i++){
    		listA.add(chA[i]);
    		listB.add(chB[i]);
    	}
    	Arrays.sort(chA);
    	Arrays.sort(chB);
    	
    	return Arrays.equals(chA, chB);
    }
    
    public static void main(String args[]){
    	Permutation_211 obj = new Permutation_211();
    	
    	String A = "aabc";
    	String B = "abcc";
    	
    	System.out.println(obj.Permutation(A, B));;
    }
}
