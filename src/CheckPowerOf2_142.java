
public class CheckPowerOf2_142 {
	 /**
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
    	if(n < 1){
    		return false;
    	}else if(n == 1){
    		return true;
    	}else if(n % 2 != 0){
    		return false;
    	}else {
    		if (checkPowerOf2(n / 2))
                return true;
    	}
    	
    	return false;
    }
    
    public static void main(String args[]){
    	CheckPowerOf2_142 obj = new CheckPowerOf2_142();
    	int n = 8;
    	System.out.print(obj.checkPowerOf2(n));
    }
}
