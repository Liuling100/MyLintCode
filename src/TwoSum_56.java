public class TwoSum_56 {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
    	int[] output = new int[2];
    	
    	for(int i = 0; i < numbers.length; i++){
    		for(int j = i + 1; j < numbers.length; j++){
    			if((numbers[i] + numbers[j]) == target){
    				output[0] = i;
    				output[1] = j;
    			}
    		}
    	}
    	
    	return output;
    }
    
    public static void main(String args[]){
    	TwoSum_56 obj = new TwoSum_56();
    	
    	int[] numbers = {2, 7, 11, 15};
    	int target = 9;
    	System.out.println(obj.twoSum(numbers, target));
    }
}