public class CountPrimes_1324 {
    /**
     * @param n: a integer
     * @return: return a integer
     */
    public int countPrimes(int n) {
        // write your code here
    	int counts = 0;
    	
    	if(n <= 1)
    		return 0;
    	else if(n == 2){
    		return 0;
    	}else if(n == 3)
    		return 1;
    	
    	boolean[] del = new boolean[n];
    	del[2] = false;
    	
    	for(int i = 3; i < n; i++){
    		if(i % 2 == 0)
    			del[i] = true;
    		else
    			del[i] = false;
    	}
    	
    	for(int i = 3; i < n; i += 2){
    		if(!del[i]){
    			if(i*i > n)
    				break;
    			
    			for(int j = 2; i * j < n; ++j){
    				del[i*j] = true;
    			}
    		}
    	}
    	
    	for(int i = 2; i < n; i++){
    		if(!del[i])
    			++counts;
    	}
    	
    	return counts;
    }
    
    public static void main(String args[]){
    	CountPrimes_1324 obj = new CountPrimes_1324();
    	
    	int n = 5;
    }
}