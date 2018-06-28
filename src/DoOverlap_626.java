import lintCodeClass.Point;

/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

public class DoOverlap_626 {
    /**
     * @param l1: top-left coordinate of first rectangle
     * @param r1: bottom-right coordinate of first rectangle
     * @param l2: top-left coordinate of second rectangle
     * @param r2: bottom-right coordinate of second rectangle
     * @return: true if they are overlap or false
     */
    public boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        // write your code here
    	int width_1 = r1.x - l1.x;
    	int height_1 = l1.y - r1.y;
    	int width_2 = r2.x - l2.x;
    	int height_2 = l2.y - r2.y;
    	
    	if (l1.x + width_1  >= l2.x &&
    	        l2.x + width_2  >= l1.x &&
    	        r1.y + height_1 >= r2.y &&
    	        r2.y + height_2 >= r1.y)
    	        return true;
    	
    	else
    	    return false;
    }
    
    public static void main(String args[]){
    	DoOverlap_626 obj = new DoOverlap_626();
    	Point l1 = new Point(-1,10);
    	Point r1 = new Point(10,5); 
    	Point l2 = new Point(5,15);
    	Point r2 = new Point(12,11);
    	System.out.println(obj.doOverlap(l1, r1, l2, r2));
    }
}