import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindMedianSortedArrays_65 {
    /*
     * @param A: An integer array
     * @param B: An integer array
     * @return: a double whose format is *.5 or *.0
     */
    public double findMedianSortedArrays(int[] A, int[] B) {
        // write your code here
    	double output = 0;
    	
    	// set has no duplicate element
    	Set<Integer> set = new HashSet<Integer>();
    	
    	for(int i = 0; i < A.length; i++){
    		set.add(A[i]);
    	}
    	
    	for(int i = 0; i < B.length; i++){
    		set.add( B[i]);
    	}
    	
    	Iterator<Integer> i = set.iterator();
    	int[] C = new int[set.size()];
    	int num = 0;
    	
    	while(i.hasNext()){
    		int a = i.next();
    		C[num] = a;
    		num++;
    	}
    	
    	
    	
    	if(C.length % 2 == 0)
    		output = (C[C.length/2 - 1]+ C[C.length/2]) / 2.0;
    	else
    		output = C[(C.length - 1) / 2];
    	
    	return output;
    }
    
    public static void main(String args[]){
    	FindMedianSortedArrays_65 obj = new FindMedianSortedArrays_65();
    	
    	int[] A = {1,2,3};
    	int[] B = {4,5};
    	
    	System.out.println(obj.findMedianSortedArrays(A, B));
    	
    }
}