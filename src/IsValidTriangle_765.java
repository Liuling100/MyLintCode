
public class IsValidTriangle_765 {
	 /**
     * @param a: a integer represent the length of one edge
     * @param b: a integer represent the length of one edge
     * @param c: a integer represent the length of one edge
     * @return: whether three edges can form a triangle
     */
    public boolean isValidTriangle(int a, int b, int c) {
        // write your code here
    	if(a <=0 || b <=0 ||c<=0)
    		return false;
    	return (a + b) > c && (a + c) > b && (c + b) > a;
    }

	public static void main(String args[]){
    	IsValidTriangle_765 obj = new IsValidTriangle_765();
    	int a = 1;
    	int b = 2;
    	int c = 3;
    	System.out.println(obj.isValidTriangle(a, b, c));
    }
}
