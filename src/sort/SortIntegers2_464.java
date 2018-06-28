package sort;

public class SortIntegers2_464 {
    /**
     * @param A: an integer array
     * @return: nothing
     */
	//O(n*logn)
	//¹é²¢ÅÅĞò
	public void sortIntegers1(int[] A) {
        // write your code here
		sort(A, 0, A.length - 1);
    }
	
	public void sort(int[] A, int start, int end){
		if(start >= end)
			return;
		
		int mid = (start + end) / 2;
		sort(A, start, mid);
		sort(A, mid + 1, end);
		merge(A, start, mid, end);
	}
	
	public void merge(int[] A, int start, int mid, int end){
		int[] num1 = new int[mid - start + 1];
		int[] num2 = new int[end - mid];
		
		for(int i = start; i <= end; i++){
			if(i - start < num1.length)
				num1[i - start] = A[i];
			else
				num2[i - start - num1.length] = A[i];
		}
		
		int i, j, k;
		i = j = k = 0;
		while(i < num1.length && j < num2.length){
			if(num1[i] <= num2[j]){
				A[start + k++] = num1[i++];
			}else{
				A[start + k++] = num2[j++];
			}
		}
		
		while(i < num1.length){
			A[start + k++] = num1[i++];
		}
		
		while(j < num2.length){
			A[start + k++] = num2[j++];
		}
	}
	
	/***************************************************************
	 * 
	 * @param A
	 */
	//¿ìËÙÅÅĞò
    public void sortIntegers2(int[] A) {
        // write your code here
    	quickSort(A, 0, A.length - 1);
    	System.out.println(A);
    }

    public void print(int[] A){
    	for(int t = 0; t < A.length; t++){
    		System.out.print(A[t] + " ");
    	}
    	System.out.print("/");
    }
    
    public void quickSort(int[] A, int start, int end){
    	int key = A[start];
    	int i = start;
    	int j = end;
    	while(i < j){
    		while(i < j && A[j] > key)
    			j--;
    		
    		A[i] = A[j];
    		
    		print(A);		
    		
    		while(i < j && A[i] < key)
    			i++;
    		
    		A[j] = A[i];   
    		
    		print(A);
    	}
    	
    	A[j] = key;
    	print(A);
    	if(i - 1 > start)
    		quickSort(A, start, i - 1);
    	if(i + 1 < end)
    		quickSort(A, i + 1, end);
    }
    
    
    
	/***************************************************************
	 * 
	 * @param A
	 */
    //¶ÑÅÅĞò
    public void sortIntegers3(int[] A) {
        // write your code here
    	heapSort(A);
    }
    
    public void heapSort(int[] A) {
		for(int i = A.length / 2; i >= 0; i--){
			heapAdjust(A, i, A.length);
		}
		
		for(int i = A.length - 1; i > 0; i--){
			swap(A, 0, i);
			heapAdjust(A, 0, i);
		}
		System.out.println(A);
	}

    public void swap(int[] A, int i, int j) {
		int tmp;
		tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	public void heapAdjust(int[] A, int i, int n) {
		int child = 0, father;
		for(father = A[i]; leftChild(i) < n; i = child){
			child = leftChild(i);
			
			if(child != n - 1 && A[child] < A[child + 1]){
				child++;
			}
			
			if(father < A[child]){
				A[i] = A[child];
			}else{
				break;
			}
		}
		A[i] = father;
	}

	public int leftChild(int i) {
		
		return 2*i + 1;
	}

	public static void main(String args[]){
    	SortIntegers2_464 obj = new SortIntegers2_464();
    	
    	int[] A = {2,3,1,5,4};
    	
    	//obj.sortIntegers1(A);
    	obj.sortIntegers2(A);
    	//obj.sortIntegers3(A);
    }
}
