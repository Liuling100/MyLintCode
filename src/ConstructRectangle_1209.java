public class ConstructRectangle_1209 {
    /**
     * @param area: web  area
     * @return: the length L and the width W of the web page you designed in sequence
     */
    public int[] constructRectangle(int area) {
        // Write your code here
    	int[] result = new int[2];
    	
    	if(area <= 0){
    		return result;
    	}
    	
    	int w = 1;
    	int l = area / w;
    	int diff = l - w;
    	
    	for(;w <= area / w; w++){
    		l = area / w;
    		if(diff >= l - w && l * w == area){
    			result[0] = l;
    			result[1] = w;
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String args[]){
    	ConstructRectangle_1209 obj = new ConstructRectangle_1209();
    	int area = 7978235;
    	System.out.println(obj.constructRectangle(area));
    }
}