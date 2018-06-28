import java.text.DecimalFormat;

public class Calculate_764 {
    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    public double[] calculate(int r) {
        // write your code here
    	double[] result = new double[2];
    	
    	result[0] = 2 * r * Math.PI;
    	result[1] = Math.PI * r * r;
    	
    	return result;
    }
    
    public static void main(String args[]){
    	Calculate_764 obj = new Calculate_764();
    	int r = 2;
    	System.out.println(obj.calculate(r));
    }
}