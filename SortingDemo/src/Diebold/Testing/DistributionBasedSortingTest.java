package Diebold.Testing;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import Diebold.Sorting.ComparisonBasedSorting;
import Diebold.Sorting.DistributionBasedSorting;
import junit.framework.TestCase;
@RunWith(ExtendedRunner.class)
public class DistributionBasedSortingTest extends TestCase {
	DistributionBasedSorting s;

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	@Repeat(10)
	public void isSortedTest()
	{
		DistributionBasedSorting s = null;
		//initialize to 25 random integers
		//loop through and check if s[i] > s[i-1]
		
		
	}
	@Test
	public void notEmptyTest()
	{
		DistributionBasedSorting s = null;
		assertNotNull(s);
		
	}

}
