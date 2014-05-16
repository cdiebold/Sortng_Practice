package Diebold.Sorting;

public class ComparisonBasedSorting extends SortingBase{
	
	public ComparisonBasedSorting()
	{
		super();
	}
	public ComparisonBasedSorting(int size)
	{
		super(size);
	}
	
	public int getSize()
	{
		return size;
	}
	public int[] getArray()
	{
		return arr;
	}
	
	public void insertionSort()
	{
		for(int i = 1; i < this.getSize(); i++)
		{
			int temp = arr[i];
			int j;
			for(j = i -1; j >= 0 && temp < arr[j]; j--)
			{
				arr[j+1] = arr[j];
				
			}
			arr[j+1] = temp;
		}
		
	}
	/**
	 * Selection Sort is an in-place comparison sorting algorithm. 
	 * The algorithm divides the input lists into 2 parts: sorted and unsorted. 
	 * The algorithm finds the smallest element in the unsorted list and swaps it with the 
	 * leftmost unsorted element. 
	 */
	public void selectionSort()
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			 int min = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] < arr[min])
					min = j; 
			}
				//swap
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public void bubbleSort()
	{
		for(int pass = this.getSize()-1; pass >= 0; pass--)
		{
			for(int i = 0; i < pass -1; i++)
			{
				if(arr[i] > arr[i+1]){
					//swap
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparisonBasedSorting s = new ComparisonBasedSorting(25);
		s.print();
		System.out.println();
		s.insertionSort();
		s.print();

	}

}
