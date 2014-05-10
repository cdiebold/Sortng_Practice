package Diebold.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;

import Diebold.Sorting.ComparisonBasedSorting;
import junit.framework.TestCase;
@RunWith(ExtendedRunner.class)
public class ComparisonBasedSortingTest extends TestCase {
	ComparisonBasedSorting s;
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	@Repeat(10)
	public void isSortedTest()
	{
		ComparisonBasedSorting s = null;
		//initialize to 25 random integers
		//loop through and check if s[i] > s[i-1]
		
		
	}
	@Test
	public void notEmptyTest()
	{
		ComparisonBasedSorting s = null;
		assertNotNull(s);
		
	}

}
