package Diebold.Sorting;

import java.util.Random;

public abstract class SortingBase {
	protected int [] arr;
	protected int size;
	
	protected SortingBase(){
		size = 25;
		arr = new int[25];
		for (int i = arr.length - 1; i >= 0; i--)
		{
		    arr[i] = i;
		}
		
	}
	protected SortingBase(int size){
		this.size = size;
		arr = new int[size];
		Random rng = new Random();
		for(int i = 0; i < size; i++)
		{
			//random number between 1 and 100
			arr[i] = 1+ rng.nextInt(100); 
			
		}
		
	}
	protected int getSize()
	{
		return size;
	}
	
	protected int[] getArray()
	{
		return arr;
	}
	protected void print()
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		String s1 = "Size: " + this.getSize() +"\n";
		String s2 = "";
		for(int i = 0; i < this.getSize(); i++)
		{
			s2 += arr[i] + " ";
		}
		sb.append(s1);
		sb.append(s2);
		return sb.toString();
	}
}
