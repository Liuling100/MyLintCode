import java.util.LinkedList;

public class MovingAverage_642 {
	LinkedList<Integer> queue;
	int size;
	double avg;
    /*
    * @param size: An integer
    */public MovingAverage_642(int size) {
        // do intialization if necessary
    	this.size = size;
    	this.queue = new LinkedList<Integer>();
    }

    /*
     * @param val: An integer
     * @return:  
     */
    public double next(int val) {
        // write your code here
    	if(queue.size() < this.size){
    		queue.offer(val); // add new element to the tail of queue
    		int sum = 0;
    		for(int i : queue){
    			sum += i;
    		}
    		avg = (double) sum / queue.size();
    	}else{
    		int head = queue.poll(); // remove the head element of the tail
    		double minus = (double) head / this.size;
    		queue.offer(val);
    		double add = (double) val / this.size;
    		avg = avg + add - minus;
    	}
    	
    	return avg;
    }
    
    public static void main(String args[]){
    	MovingAverage_642 obj = new MovingAverage_642(3);
    	
    	System.out.print(obj.next(1));
    }
}