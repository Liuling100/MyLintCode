package arrays;

public class SpiralArray_769 {
	 /**
     * @param n: a Integer
     * @return: a spiral array
     */
    public int[][] spiralArray(int n) {
        // write your code here
    	if(n == 0)
    		return null;
    	
    	int[][] output = new int[n][n];
    	int rows = 0;
    	int cols = -1;
    	int index = 1;
    	int div = 0;
    	
    	while(index <= n*n){
    		//top
    		for(int i = 0; i < n - div; i++){
    			output[rows][++cols] = index++;
    		}
    		
    		//right
    		for(int i = 0; i < n - 1 - div; i++){
    			output[++rows][cols] = index++;
    		}
    		
    		//bottom
    		for(int i = 0; i < n - 1 - div; i++){
    			output[rows][--cols] = index++;
    		}
    		
    		//left
    		for(int i = 0; i < n - 2 - div; i++){
    			output[--rows][cols] = index++;
    		}
    		
    		div += 2;
    	}
    	
    	return output;
    }
    
    
    
    public static void main(String args[]){
    	SpiralArray_769 obj = new SpiralArray_769();
    	
    	int n = 3;
    	obj.spiralArray(n);
    }
}
