
public class LuckyNumber_1385 {
	/**
     * @param n: count lucky numbers from 1 ~ n
     * @return: the numbers of lucky number
     */
    public int luckyNumber(int n) {
        // Write your code here
    	if(n < 8 || n > 1000000)
    		return 0;
    	
    	int nums = 0;
    	
    	for(int i = 8; i < n; i++){    		
    		char[] chars = Integer.toString(i).toCharArray();
    		for(int j = 0; j < chars.length; j++){
    			if(chars[j] == '8'){
    				nums++;
    				break;
    			}
    		}
    	}
    	
    	return nums;
    }
    
    public static void main(String args[]){
    	LuckyNumber_1385 obj = new LuckyNumber_1385();
    	
    	int n = 100;
    	obj.luckyNumber(n);
    }
}
