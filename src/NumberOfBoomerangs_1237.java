
public class NumberOfBoomerangs_1237 {
	/**
     * @param points: a 2D array
     * @return: the number of boomerangs
     */
    public int numberOfBoomerangs(int[][] points) {
        // Write your code here
    	int counts = 0;
    	
    	if(points == null || points.length == 0 || points[0].length == 0)
    		return counts;
    	
    	for(int i = 0; i < points.length; i++){
    		
    	}
    	
    	return counts;
    }
    
    public static void main(String args[]){
    	NumberOfBoomerangs_1237 obj = new NumberOfBoomerangs_1237();
    	int[][] points = new int[3][2];
    	points[0][0] = 0;
    	points[0][1] = 0;
    	
    	points[1][0] = 1;
    	points[1][1] = 0;
    	
    	points[2][0] = 2;
    	points[2][1] = 0;
    	
    	System.out.println(obj.numberOfBoomerangs(points));
    }
}
