package Diebold.Testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.TestCase;
import Diebold.Sorting.ComparisonBasedSorting;
import Diebold.Sorting.DNC_Sorting;
import junit.framework.TestCase;
@RunWith(ExtendedRunner.class)
public class DNC_SortingTest{
	DNC_Sorting s;
	
	private boolean isSorted(int[] a)
	{
		
		int cnt = 0;
		//int c = 0;
		for(int i = 0; i < a.length; i++)
		{
			int c = 0;
			for(int j = i+1; j<a.length-1; j++ )
			{
				if(a[j] >= a[i])
					c++;
					
			}
			//System.out.println("c: " + c);
			int sz = a.length-1 -i-1;
		//	System.out.println(sz);
			if(c == sz)
				cnt++;
			c = 0; //reset c for next iteration
		}
		//System.out.println("Count: " + cnt);
		if(cnt == a.length-1)
			return true;
		else
			return false;
		
		
	}
	@Before
	public void setUp() throws Exception {
		s = new DNC_Sorting(100);
	}
	
	@Test
	public void notEmptyTest()
	{
		DNC_Sorting s = new DNC_Sorting(10);
		assertNotNull(s);
		
	}
	
	@Test
	@Repeat(10)
	public void mergeSortTest()
	{
		s.mergeSort(s.getArray());
		int [] a = s.getArray();
		assertTrue(isSorted(a));
	}

}
