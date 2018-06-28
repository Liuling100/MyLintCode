
public class NumJewelsInStones_1038 {
	 /**
     * @param J: the types of stones that are jewels
     * @param S: representing the stones you have
     * @return: how many of the stones you have are also jewels
     */
    public int numJewelsInStones(String J, String S) {
        // Write your code here
    	if(S.length() == 0)
    		return 0;
    	
    	int nums = 0;
    	for(int i = 0; i < J.length(); i++){
    		for(int j = 0; j < S.length(); j++){
    			if((J.charAt(i)+"").equals(S.charAt(j)+""))
    				++nums;
    		}
    	}
    	return nums;
    }
    
    public static void main(String args[]){
    	NumJewelsInStones_1038 obj = new NumJewelsInStones_1038();
    	String J = "a";
    	String S = "AA";
    	System.out.println(obj.numJewelsInStones(J, S));
    }
}
