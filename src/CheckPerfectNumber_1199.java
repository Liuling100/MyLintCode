import java.util.ArrayList;
import java.util.List;

public class CheckPerfectNumber_1199 {
	/**
     * @param num: an integer
     * @return: returns true when it is a perfect number and false when it is not
     */
    public boolean checkPerfectNumber(int num) {
        // write your code here
    	if(num == 1)
    		return false;
    	
    	List<Integer> lists = new ArrayList<Integer>();
    	lists.add(1);
    	
    	for(int d = 2; d <= num/2; d++){
    		if(num % d == 0)
    			lists.add(d);
    	}
    	
    	int sum = 0;
    	for(Integer i : lists)
    		sum += i;
    	
    	return sum == num;
    }
    
    public static void main(String args[]){
    	CheckPerfectNumber_1199 obj = new CheckPerfectNumber_1199();
    	int num = 28;
    	System.out.println(obj.checkPerfectNumber(num));
    }
}
