
public class CountOnes_365 {
	 /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        // write your code here
    	int nums = 0;
    	
    	String str = Integer.toBinaryString(num);
    	
    	for(int i = 0; i < str.length(); i++){
    		if(str.charAt(i) == '1')
    			nums++;
    	}
    	
    	return nums;
    }
    
    public static void main(String args[]){
    	CountOnes_365 obj = new CountOnes_365();
    	int num =1023;
    	
    	obj.countOnes(num);
    }
}
