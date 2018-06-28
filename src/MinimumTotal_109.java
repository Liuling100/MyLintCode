import java.util.Arrays;

public class MinimumTotal_109 {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
    	if(triangle == null || triangle.length == 0)
    		return -1;
    	
    	int sum = 0;
    	
    	for(int i = 0; i < triangle.length; i++){
    		int[] line = triangle[i];
    		Arrays.sort(line);
    		sum += line[0];
    	}
    	
    	return sum;
    }
    
    public static void main(String args[]){
    	MinimumTotal_109 obj = new MinimumTotal_109();
    	
    	int[][] triangle = {{-1},
    		    {2,3},
    		    {1,-1,3}};
    	obj.minimumTotal(triangle);
    }
}