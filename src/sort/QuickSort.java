package sort;

public class QuickSort {
	public void quickSort(int[] A, int start, int end){
		int pivot = A[start];
		int i = start;
		int j = end;
		
		while(i < j){
			while(i < j && A[j] > pivot)
				j--;
			
			A[i] = A[j];
			
			while(i < j && A[i] < pivot)
				i++;
			
			A[j] = A[i];
		}
		
		A[j] = pivot;
		
		if(i - 1 > start)
			quickSort(A, start, i-1);
		
		if(i+1 <end)
			quickSort(A, i+1, end);
	}

	public static void main(String args[]){
		QuickSort obj = new QuickSort();
		
		int[] A = {2,3,1,5,4};
		obj.quickSort(A, 0, A.length- 1);
		System.out.println(A);
	}
}
