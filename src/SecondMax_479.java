import java.util.Arrays;

public class SecondMax_479 {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
    	Arrays.sort(nums);
    	return nums[nums.length - 2];
    }
    
    public static void main(String args[]){
    	SecondMax_479 obj = new SecondMax_479();
    	int[] nums = {1, 3, 2, 4};
    	obj.secondMax(nums);
    }
}