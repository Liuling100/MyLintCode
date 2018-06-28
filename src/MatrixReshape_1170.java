import java.util.ArrayList;
import java.util.List;

public class MatrixReshape_1170 {
	/**
     * @param nums: List[List[int]]
     * @param r: an integer
     * @param c: an integer
     * @return: return List[List[int]]
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // write your code here
    	int r1= nums.length;
    	int c1 = nums[0].length;
    	
    	if(r1*c1 != r*c)
    		return nums;
    	
    	List<Integer> lists = new ArrayList<Integer>();
    	for(int i = 0; i < r1; i++){
    		for(int j = 0; j < c1; j++){
    			lists.add(nums[i][j]);
    		}
    	}
    	
    	int[][] result = new int[r][c];
    	int index = 0;
    	for(int i = 0; i < r; i++){
    		for(int j = 0; j < c; j++){
    			result[i][j]=lists.get(index++);
    		}
    	}
    	return result;
    }
    
    public static void main(String args[]){
    	MatrixReshape_1170 obj = new MatrixReshape_1170();
    	int[][] nums = new int[2][2];
    	nums[0][0] = 1;
    	nums[0][1] = 1;
    	nums[1][0] = 1;
    	nums[1][1] = 1;
    	
    	int r= 1;
    	int c=4;
    	obj.matrixReshape(nums, r, c);
    }
}
