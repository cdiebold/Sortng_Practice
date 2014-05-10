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
	
	@Before
	public void setUp() throws Exception {
		s = new ComparisonBasedSorting(10);
	}
	
	@Test
	public void notEmptyTest()
	{
		ComparisonBasedSorting s = new ComparisonBasedSorting(10);
		assertNotNull(s);
		
	}
	
	@Test
	@Repeat(10)
	public void selectionSortTest()
	{
		s.selectionSort();
		//ComparisonBasedSorting s = new ComparisonBasedSorting(100);
		int [] a = s.getArray();
		int cnt = 0;
		//int c = 0;
		for(int i = 0; i < a.length-1; i++)
		{
			int c = 0;
			for(int j = i+1; j<a.length; j++ )
			{
				if(a[j] > a[i])
					c++;
					
			}
			System.out.println("c: " + c);
			if(c == a.length - i+2)
				cnt++;
			c = 0; //reset c for next iteration
		}
		System.out.println("Count: " + cnt);
		if(cnt == a.length)
			assertTrue(true);
		else
			assertTrue(false);
		
		
	}
	

}
