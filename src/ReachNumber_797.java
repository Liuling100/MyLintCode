public class ReachNumber_797 {
    /**
     * @param target: the destination
     * @return: the minimum number of steps
     */
    public int reachNumber(int target) {
        // Write your code here
    	int k = 0;
    	target = Math.abs(target);
    	
    	while(target > 0){
    		target -= ++k;
    	}
    	
    	return target % 2 == 0 ? k : k + 1 + k % 2;
    }
    
    public static void main(String args[]){
    	ReachNumber_797 obj = new ReachNumber_797();
    	
    	int target = 7;
    	
    	System.out.println(obj.reachNumber(target));
    }
}