public class SwapIntegers_484 {
    /**
     * @param A: An integer array
     * @param index1: the first index
     * @param index2: the second index
     * @return: nothing
     */
    public void swapIntegers(int[] A, int index1, int index2) {
        // write your code here
    	int t = 0;
    	t = A[index1];
    	A[index1] = A[index2];
    	A[index2] = t;
    }
    
    public static void main(String args[]){
    	SwapIntegers_484 obj = new SwapIntegers_484();
    	int[] A = new int [4];
    	A[0] = 1;
    	A[1] = 2;
    	A[2] = 3;
    	A[3] = 4;
    	int index1 = 2;
    	int index2 = 3;
    	obj.swapIntegers(A, index1, index2);
    	System.out.println(A);
    }
}