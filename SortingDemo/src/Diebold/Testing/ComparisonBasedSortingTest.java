package Diebold.Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Diebold.Sorting.ComparisonBasedSorting;
import junit.framework.TestCase;
@RunWith(ExtendedRunner.class)
public class ComparisonBasedSortingTest{
	ComparisonBasedSorting s;
	
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
		s = new ComparisonBasedSorting(1000);
	}
	
	@Test
	public void notEmptyTest()
	{
		ComparisonBasedSorting s = new ComparisonBasedSorting(10);
		assertNotNull(s);
		
	}
	
	@Test
	@Repeat(100)
	public void selectionSortTest()
	{
		s.selectionSort();
		//ComparisonBasedSorting s = new ComparisonBasedSorting(100);
		int [] a = s.getArray();
		assertTrue(isSorted(a));
		
		
	}
	

}
