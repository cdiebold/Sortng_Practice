package Diebold.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.TestCase;
import Diebold.Sorting.ComparisonBasedSorting;
import Diebold.Sorting.DNC_Sorting;
import junit.framework.TestCase;
@RunWith(ExtendedRunner.class)
public class DNC_SortingTest extends TestCase {
	DNC_Sorting s;
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	
	@Test
	@Repeat(10)
	public void isSortedTest()
	{
		DNC_Sorting s = null;
		//initialize to 25 random integers
		//loop through and check if s[i] > s[i-1]
		
		
	}
	@Test
	public void notEmptyTest()
	{
		DNC_Sorting s = null;
		assertNotNull(s);
		
	}

}
