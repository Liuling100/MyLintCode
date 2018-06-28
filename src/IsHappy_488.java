import java.util.HashSet;

public class IsHappy_488 {
    /**
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // write your code here
    	if(n <= 0)
    		return false;
    	
    	HashSet<Integer> hash = new HashSet<Integer>();
    	        
        while(n != 1){
        	if(hash.contains(n))
        		return false;
        	
        	hash.add(n);
        	n = getNextHappy(n);
    	}
        
    	return true;
    }
    
    public int getNextHappy(int n){
    	int sum = 0;
    	String str = Integer.toString(n);
    	for(int i = 0; i < str.length(); i++){
    		int a = Integer.parseInt(str.charAt(i) + "");
    		sum += a * a;
    	}
    	
    	return sum;
    }
    	
    public static void main(String args[]){
    	IsHappy_488 obj = new IsHappy_488();
    	
    	int n = 19;
    	System.out.println(obj.isHappy(n));
    }
}