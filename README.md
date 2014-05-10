Sortng_Practice
===============
Purpose: To create a suite of classes organizing the most popular sorting algorithms in a way that can be used for practicing the implementation in preparation of job interviews.

Data Structure: We use an array of 25 ints. I chose an array of 25 ints simply because it is easy to test by eye and easy to validate my test to ensure they are correct. This may change. Many of these algorithms are fast sorting algorithms. Their power comes from sorting large data sets. So I may change this to accomadate and test their speed on large data sets.

Testing: To test I use JUnit 3. See associated Test Package for all tests. 

Class Description:

-- SortingBase: This is an abstract base class that just contains the data structure. All classes inherit this class.

-- ComparisonBasedSorting: used for all the popular O(N^2) sorting algorithms. 

-- DNC_Sorting: Divide and conquer sorting algorithms like QuickSort. 

-- DistributionBasedSorting: Noncomparison based sorting like countingSort. 

-- All the above with the exception of the abstract class have an associated test class. 

Things I may add:

-- May include a custom Linked list class and test the sorting algorithms on a linked list. 

-- GUI. --may be good practice. If I do it will be using Javafx.

