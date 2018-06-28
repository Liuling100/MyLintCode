public class SameNumber_1368 {
    /**
     * @param nums: the arrays
     * @param k: the distance of the same number
     * @return: the ans of this question
     */
    public String sameNumber(int[] nums, int k) {
        // Write your code here
    	
    	for(int i = 0; i < nums.length; i++){
    		int num1 = nums[i];
    		for(int j = i + 1; j < nums.length; j++){
    			int num2 = nums[j];
    			if(num2 == num1 && (j - i) < k){
    				return "YES";
    			}
    		}
    	}
    	return "NO";
    	
    }
    
    public static void main(String args[]){
    	SameNumber_1368 obj = new SameNumber_1368();
    	
    	int[] nums = {1,2,3,5,7,1,5,1,3};
    	int k = 4;
    	
    	System.out.println(obj.sameNumber(nums, k));
    }
}