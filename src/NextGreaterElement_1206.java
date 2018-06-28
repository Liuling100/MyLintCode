
public class NextGreaterElement_1206 {
	 /**
     * @param nums1: an array
     * @param nums2: an array
     * @return:  find all the next greater numbers for nums1's elements in the corresponding places of nums2
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Write your code here
    	int[] result = new int[nums1.length];
    	for(int i = 0; i < nums1.length; i++){
			result[i] = -1;
    		int a = nums1[i];
    		for(int j = 0; j < nums2.length; j++){
    			int b = nums2[j];
    			if(a == b && j < nums2.length - 1){
    				for(int start = j+1; start < nums2.length; start++){
    					if(nums2[start] > a){
    						result[i] = nums2[start];
    						break;
    					}
    				}
    			}
    		}
    	}
    	return result;
    }
    
    public static void main(String args[]){
    	NextGreaterElement_1206 obj = new NextGreaterElement_1206();
    	int[] nums1 = {2,4};
    	int[] nums2 = {1,2,3,4};
    	
    	obj.nextGreaterElement(nums1, nums2);
    }
}
