
public class IsBuild_749 {
	 /**
     * @param x: the wall's height
     * @return: YES or NO
     */
    public String isBuild(int x) {
        // write you code here
    	if(x <= 0)
    		return "NO";
    	
    	if(x % 3 == 0 || x % 7 == 0)
    		return "YES";
    	
    	while(x > 0){
    		if(x % 3 == 0)
    			return "YES";
    		
    		x -= 7;
    	}
    	return "NO";
    }
    
    public static void main(String args[]){
    	IsBuild_749 obj = new IsBuild_749();
    	int x = 13;
    	System.out.println(obj.isBuild(x));
    }
}
