package Diebold.Sorting;
public class DNC_Sorting extends SortingBase{
	
	public DNC_Sorting()
	{
		super();
	}
	public DNC_Sorting(int size)
	{
		super(size);
		
	}
	
	//private function definitions
	private void mergeSort(int[] arr, int left, int right)
	{
		if(right > left)
		{
			int mid = (left+right)/2;
		    mergeSort(arr,0, mid);
			mergeSort(arr,mid+1, right);
			merge(arr, left, mid, right);
		}
		
	}
	private void merge(int[] arr, int left,int mid, int right)
	{
		int helper[] = new int[arr.length];
		// Copy both parts into the helper array
	    for (int i = left; i <= right; i++) {
	      helper[i] = arr[i];
	    }

	    int i = left;
	    int j = mid + 1;
	    int k = left;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= mid && j <= right) {
	      if (helper[i] <= helper[j]) {
	        arr[k] = helper[i];
	        i++;
	      } else {
	        arr[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= mid) {
	      arr[k] = helper[i];
	      k++;
	      i++;
	    }

	  }
		
	
	private void quickSort(int[] arr, int low, int high)
	{
		
	}
	private void partition(int[] arr, int low, int high)
	{
		
	}
	
	//public wrappers of private functions
	public void mergeSort(int[] arr)
	{
		mergeSort(arr,0,arr.length-1);
		
	}
	public void quickSort(int[] arr)
	{
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DNC_Sorting s = new DNC_Sorting(25);
		s.print();
		System.out.println();
		s.mergeSort(s.getArray());
		s.print();
	}

}
