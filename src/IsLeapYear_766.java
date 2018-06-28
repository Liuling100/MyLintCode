public class IsLeapYear_766 {
    /**
     * @param n: a number represent year
     * @return: whether year n is a leap year.
     */
    public boolean isLeapYear(int n) {
        // write your code here
    	return (n % 4 == 0 && n % 100 != 0 || n % 400 == 0);
    }
    
    public static void main(String args[]){
    	IsLeapYear_766 obj = new IsLeapYear_766();
    	int n = 2000;
    	
    	System.out.println(obj.isLeapYear(n));
    }
}